package planetwars;

public class Ship implements MilitaryUnit, Variables{
	// armor será la armadura restante de nuestra nave durante las batallas.
	private int armor;
	
	// InitialArmor será la armadura inicial de nuestra nave, es decir, la armadura al momento de crearla.
	private int initialArmor;
	
	// BaseDamage el poder de ataque, le llamaremos baseDamage pensando en alguna posible ampliación del proyecto.
	private int baseDamage;
	
	public Ship(int armor, int baseDamage) {
		super();
		this.armor = armor;
		this.baseDamage = baseDamage;
	}
	
	
	
	public int getArmor() {
		return armor;
	}



	public void setArmor(int armor) {
		this.armor = armor;
	}



	public int getInitialArmor() {
		return initialArmor;
	}



	public void setInitialArmor(int initialArmor) {
		this.initialArmor = initialArmor;
	}



	public int getBaseDamage() {
		return baseDamage;
	}



	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	// -------------------------------------------------
	
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return this.baseDamage;
	}

	@Override
	public void tekeDamage(int receivedDamage) {
		// TODO Auto-generated method stub
		this.armor -= receivedDamage;
	}

	@Override
	public int getAcualArmor() {
		// TODO Auto-generated method stub
		return this.armor;
	}

	@Override
	public int getMetalCost() {
		// TODO Auto-generated method stub
		if (this instanceof LigthHunter) {
			return Variables.METAL_COST_LIGTHHUNTER;
		} else if (this instanceof HeavyHunter) {
			return Variables.METAL_COST_HEAVYHUNTER;
		} else if (this instanceof BattleShip) {
			return Variables.METAL_COST_BATTLESHIP;
		} else if (this instanceof ArmoredShip) {
			return Variables.METAL_COST_ARMOREDSHIP;
		} else {
			return 0;
		}
	}

	@Override
	public int getDeuteriumCost() {
		// TODO Auto-generated method stub
	    if (this instanceof LigthHunter) {
	        return Variables.DEUTERIUM_COST_LIGTHHUNTER;
	    } else if (this instanceof HeavyHunter) {
	        return Variables.DEUTERIUM_COST_HEAVYHUNTER;
	    } else if (this instanceof BattleShip) {
	        return Variables.DEUTERIUM_COST_BATTLESHIP;
	    } else if (this instanceof ArmoredShip) {
	        return Variables.DEUTERIUM_COST_ARMOREDSHIP;
	    } else {
	    	return 0;
	    }
	}

	@Override
	public int getChanceGeneratinWaste() {
	    if (this instanceof LigthHunter) {
	        return Variables.CHANCE_GENERATNG_WASTE_LIGTHHUNTER;
	    } else if (this instanceof HeavyHunter) {
	        return Variables.CHANCE_GENERATNG_WASTE_HEAVYHUNTER;
	    } else if (this instanceof BattleShip) {
	        return Variables.CHANCE_GENERATNG_WASTE_BATTLESHIP;
	    } else if (this instanceof ArmoredShip) {
	        return Variables.CHANCE_GENERATNG_WASTE_ARMOREDSHIP;
	    } else {
	    	return 0;
	    }
	}

	@Override
	public int getChanceAttackAgain() {
	    if (this instanceof LigthHunter) {
	        return Variables.CHANCE_ATTACK_AGAIN_LIGTHHUNTER;
	    } else if (this instanceof HeavyHunter) {
	        return Variables.CHANCE_ATTACK_AGAIN_HEAVYHUNTER;
	    } else if (this instanceof BattleShip) {
	        return Variables.CHANCE_ATTACK_AGAIN_BATTLESHIP;
	    } else if (this instanceof ArmoredShip) {
	        return Variables.CHANCE_ATTACK_AGAIN_ARMOREDSHIP;
	    } else {
	    	return 0;
	    }
	}

	@Override
	public void resetArmor() {
		// TODO Auto-generated method stub
		this.armor = this.initialArmor;
	}

}