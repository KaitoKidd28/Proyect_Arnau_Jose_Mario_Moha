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

}
