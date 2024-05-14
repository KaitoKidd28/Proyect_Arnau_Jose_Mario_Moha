package entitys;

import interfaces.MilitaryUnit;
import interfaces.Variables;

public abstract class Ship implements MilitaryUnit, Variables {
	private int armor;
	private int initialArmor;
	private int baseDamage;

	public Ship() {
		super();
	}

	public Ship(int armor, int baseDamage, int initialArmor) {
		super();
		this.armor = armor;
		this.initialArmor = initialArmor;
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

}
