package planetwars;

import java.util.ArrayList;

public class Planet implements Variables{
	private int technologyDefense;
	private int technologyAtack;
	private int metal;
	private int deuterium;
	private int upgradeDefenseTechnologyDeuteriumCost;
	private int upgradeAttackTechnologyDeuteriumCost;
	private ArrayList<MilitaryUnit>[] army = new ArrayList[6];

	
	public Planet(int technologyDefense, int technologyAtack, int metal, int deuterium,
			int upgradeDefenseTechnologyDeuteriumCost, int upgradeAttackTechnologyDeuteriumCost) {
		super();
		this.technologyDefense = technologyDefense;
		this.technologyAtack = technologyAtack;
		this.metal = metal;
		this.deuterium = deuterium;
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
	}

	public Planet() {
		for (int i = 0; i < army.length; i++) {
			army[i] = new ArrayList<>();
		}
	}
	
	public int getTechnologyDefense() {
		return technologyDefense;
	}



	public void setTechnologyDefense(int technologyDefense) {
		this.technologyDefense = technologyDefense;
	}



	public int getTechnologyAtack() {
		return technologyAtack;
	}



	public void setTechnologyAtack(int technologyAtack) {
		this.technologyAtack = technologyAtack;
	}



	public int getMetal() {
		return metal;
	}



	public void setMetal(int metal) {
		this.metal = metal;
	}



	public int getDeuterium() {
		return deuterium;
	}



	public void setDeuterium(int deuterium) {
		this.deuterium = deuterium;
	}



	public int getUpgradeDefenseTechnologyDeuteriumCost() {
		return upgradeDefenseTechnologyDeuteriumCost;
	}



	public void setUpgradeDefenseTechnologyDeuteriumCost(int upgradeDefenseTechnologyDeuteriumCost) {
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
	}



	public int getUpgradeAttackTechnologyDeuteriumCost() {
		return upgradeAttackTechnologyDeuteriumCost;
	}



	public void setUpgradeAttackTechnologyDeuteriumCost(int upgradeAttackTechnologyDeuteriumCost) {
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
	}



	public ArrayList<MilitaryUnit>[] getArmy() {
		return army;
	}



	public void setArmy(ArrayList<MilitaryUnit>[] army) {
		this.army = army;
	}

// ------------------------------------------------------------------------------------------------------
	
	public void upgradeTechnologyDefense() throws ResourceException{
		if (deuterium >= upgradeDefenseTechnologyDeuteriumCost) {
			technologyDefense++;
			deuterium -= upgradeDefenseTechnologyDeuteriumCost;
			upgradeDefenseTechnologyDeuteriumCost *= 1.1;
		} else {
			throw new ResourceException("Deuterium insuficiente para actualizar la tecnologia de defensa.");
		}
	}
	
	public void upgradeTechnologyAttack() throws ResourceException{
		if (deuterium >= upgradeAttackTechnologyDeuteriumCost) {
			technologyAtack++;
			deuterium -= upgradeAttackTechnologyDeuteriumCost;
			upgradeAttackTechnologyDeuteriumCost *= 1.1;
		} else {
			throw new ResourceException("Deuterium insuficiente para actualizar la tecnologia de ataque.");
		}
	}

	public void newLigthHunter(int n) throws ResourceException{
		int unidad = n;
		for (int i = 0; i < unidad; i++) {
			if (deuterium >= DEUTERIUM_COST_LIGTHHUNTER & metal >= METAL_COST_LIGTHHUNTER) {
				int armor = ARMOR_LIGTHHUNTER + ((technologyDefense * PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_LIGTHHUNTER + ((technologyAtack * PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_LIGTHHUNTER / 100);
				deuterium -= DEUTERIUM_COST_LIGTHHUNTER;
				metal -= METAL_COST_LIGTHHUNTER;
				army[0].add(new LigthHunter());
			} else {
				throw new ResourceException("Deuterium insuficiente para construir unidades.");
			}
		}
	}

	public void newHeavyHunter(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_HEAVYHUNTER & metal >= METAL_COST_HEAVYHUNTER) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_HEAVYHUNTER + ((technologyDefense * PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_HEAVYHUNTER + ((technologyAtack * PLUS_ATTACK_HEAVYHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_HEAVYHUNTER / 100);
				deuterium -= DEUTERIUM_COST_HEAVYHUNTER;
				metal -= METAL_COST_HEAVYHUNTER;
				army[1].add(new HeavyHunter());
			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}

	public void newBattleShip(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_BATTLESHIP & metal >= METAL_COST_BATTLESHIP) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_BATTLESHIP + ((technologyDefense * PLUS_ARMOR_BATTLESHIP_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_BATTLESHIP + ((technologyAtack * PLUS_ATTACK_BATTLESHIP_BY_TECHNOLOGY) * BASE_DAMAGE_BATTLESHIP / 100);
				deuterium -= DEUTERIUM_COST_BATTLESHIP;
				metal -= METAL_COST_BATTLESHIP;
				army[2].add(new BattleShip());
			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newArmoredShip(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_ARMOREDSHIP & metal >= METAL_COST_ARMOREDSHIP) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_ARMOREDSHIP + ((technologyDefense * PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_ARMOREDSHIP + ((technologyAtack * PLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY) * BASE_DAMAGE_ARMOREDSHIP / 100);
				deuterium -= DEUTERIUM_COST_ARMOREDSHIP;
				metal -= METAL_COST_ARMOREDSHIP;
				army[3].add(new ArmoredShip());
			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newMissileLauncher(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_MISSILELAUNCHER & metal >= METAL_COST_MISSILELAUNCHER) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_MISSILELAUNCHER + ((technologyDefense * PLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_MISSILELAUNCHER + ((technologyAtack * PLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY) * BASE_DAMAGE_MISSILELAUNCHER / 100);
				deuterium -= DEUTERIUM_COST_MISSILELAUNCHER;
				metal -= METAL_COST_MISSILELAUNCHER;
				army[4].add(new MissileLauncher());
			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newIonCannon(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_IONCANNON & metal >= METAL_COST_IONCANNON) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_IONCANNON + ((technologyDefense * PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_IONCANNON + ((technologyAtack * PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY) * BASE_DAMAGE_IONCANNON / 100);
				deuterium -= DEUTERIUM_COST_IONCANNON;
				metal -= METAL_COST_IONCANNON;
				army[5].add(new IonCannon());
			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newPlasmaCannon(int n) throws ResourceException{
		int unidad = n;
		if (deuterium >= DEUTERIUM_COST_PLASMACANNON & metal >= METAL_COST_PLASMACANNON) {
			for (int i = 0; i < unidad; i++) {
				int armor = ARMOR_PLASMACANNON + ((technologyDefense * PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY) * 1000 / 100);
		        int baseDamage = BASE_DAMAGE_PLASMACANNON + ((technologyAtack * PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY) * BASE_DAMAGE_PLASMACANNON / 100);
				deuterium -= DEUTERIUM_COST_PLASMACANNON;
				metal -= METAL_COST_PLASMACANNON;
				army[6].add(new PlasmaCannon());

			}
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
			}
		}
	
	public void printStats() {
		String datos = String.format("Planet Stats:\n\n" +
		        "TECHNOLOGY\n\n" +
		        "Atack Technology:       %d\n" +
		        "Defense Technology:     %d\n\n" +
		        "DEFENSES\n\n" +
		        "Missile Launcher:       \n" +
		        "Ion Cannon:             \n" +
		        "Plasma Cannon:          \n\n" +
		        "FLEET\n\n" +
		        "Light Hunter:           \n" +
		        "Heavy Hunter:           \n" +
		        "Battle Ship:            \n" +
		        "Armored Ship:           \n\n" +
		        "RESOURCES\n\n" +
		        "Metal:                  %d\n" +
		        "Deuterium:              %d\n",
		        technologyAtack, technologyDefense, metal, deuterium);
		System.out.println(datos);
	}

}
