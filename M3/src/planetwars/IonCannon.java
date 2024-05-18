package planetwars;

public class IonCannon extends Defense{
	public final int ARMOR_IONCANNON = 1200;
	public final int BASE_DAMAGE_IONCANNON = 250;
	public final int PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY = 5;
	public final int PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY = 5;
	
	public IonCannon(int armor, int baseDamage) {
		super(armor, baseDamage);
	}
	
	public IonCannon() {
		this(1200,250);
	}

	public int getARMOR_IONCANNON() {
		return ARMOR_IONCANNON;
	}

	public int getBASE_DAMAGE_IONCANNON() {
		return BASE_DAMAGE_IONCANNON;
	}

	public int getPLUS_ARMOR_IONCANNON_BY_TECHNOLOGY() {
		return PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY;
	}

	public int getPLUS_ATTACK_IONCANNON_BY_TECHNOLOGY() {
		return PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY;
	}

}
