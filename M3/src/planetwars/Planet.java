package planetwars;

import java.util.ArrayList;

public class Planet {
	private int technologyDefense;
	private int technologyAtack;
	private int metal;
	private int deuterium;
	private int upgradeDefenseTechnologyDeuteriumCost;
	private int upgradeAttackTechnologyDeuteriumCost;
	private ArrayList<MilitaryUnit>[] army = new ArrayList[7];

	
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
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[0].add(new LigthHunter());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newHeavyHunter(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[1].add(new HeavyHunter());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newBattleShip(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[2].add(new BattleShip());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	public void newArmoredShip(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[3].add(new ArmoredShip());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}
	
	/*¡public void newMissileLauncher(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[4].add(new MissileLauncher());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}*/
	
	/*public void newIonCannon(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[5].add(new IonCannon());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}*/
	
	/*public void newPlasmaCannon(int n) throws ResourceException{
		int precio = n;
		if (deuterium >= precio) {
			for (int i = 0; i < n; i++) {
				army[6].add(new PlasmaCannon());
			}
			deuterium -= precio;
		} else {
			throw new ResourceException("Deuterium insuficiente para construir unidades.");
		}
	}*/
	
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
