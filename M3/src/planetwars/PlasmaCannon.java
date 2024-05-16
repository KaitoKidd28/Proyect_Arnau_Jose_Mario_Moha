package planetwars;

public class PlasmaCannon extends Defense{
	public final int ARMOR_PLASMACANNON = 7000;
	public final int BASE_DAMAGE_PLASMACANNON = 2000;
	public final int PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY = 5;
	public final int PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY = 5;
	
	public PlasmaCannon(int armor, int baseDAmage) {
		super(armor, baseDAmage);
	}
	
	public PlasmaCannon() {
		this(7000,2000);
	}
}
