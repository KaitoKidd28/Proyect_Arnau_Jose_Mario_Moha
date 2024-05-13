package proyecto;

public abstract class Ship implements MilitaryUnit, Variables {
	private int armor;
	private int initialArmor;
	private int baseDamage;
	public Ship() {
		super();
	}
	public Ship(int armor,int baseDamage) {
		super();
		this.armor = armor;
		this.baseDamage = baseDamage;
	}
	
	
	
	
}
