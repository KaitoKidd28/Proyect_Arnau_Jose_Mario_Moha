package planetwars;

public class Defense implements MilitaryUnit, Variables{
	// armor será la armadura restante de nuestra defensa durante las batallas.
	private int armor;
	// InitialArmor será la armadura inicial de nuestra defensa, es decir, la armadura al momento de crearla.
	private int initialArmor;
	// BaseDamage el poder de ataque, le llamaremos baseDamage pensando en alguna posible ampliación del proyecto.
	private int baseDamage;
	
	public Defense(int armor, int baseDamage) {
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



	public int getbaseDamage() {
		return baseDamage;
	}



	public void setbaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	// ---------------------------------------------------
	
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return baseDamage;
	}
	
	@Override
	public void tekeDamage(int receivedDamage) {
		// TODO Auto-generated method stub
		armor -= receivedDamage;
		
	}
	
	@Override
	public int getAcualArmor() {
		// TODO Auto-generated method stub
		return armor;
	}
	
	@Override
	public int getMetalCost() {
		// TODO Auto-generated method stub
		if (this instanceof MissileLauncher) {
			return Variables.METAL_COST_MISSILELAUNCHER;
		} else if (this instanceof IonCannon) {
			return Variables.METAL_COST_IONCANNON;
		} else if (this instanceof PlasmaCannon) {
			return Variables.METAL_COST_PLASMACANNON;
		} else {
			return 0;
		}
	}
	
	@Override
	public int getDeuteriumCost() {
		// TODO Auto-generated method stub
		if (this instanceof MissileLauncher) {
			return Variables.DEUTERIUM_COST_MISSILELAUNCHER;
		} else if (this instanceof IonCannon) {
			return Variables.DEUTERIUM_COST_IONCANNON;
		} else if (this instanceof PlasmaCannon) {
			return Variables.DEUTERIUM_COST_PLASMACANNON;
		} else {
			return 0;
		}
	}
	
	@Override
	public int getChanceGeneratinWaste() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getChanceAttackAgain() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void resetArmor() {
		// TODO Auto-generated method stub
		armor = initialArmor;
	}
	
}
