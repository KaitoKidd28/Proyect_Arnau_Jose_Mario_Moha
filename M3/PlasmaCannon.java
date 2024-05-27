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

	public int getARMOR_PLASMACANNON() {
		return ARMOR_PLASMACANNON;
	}

	public int getBASE_DAMAGE_PLASMACANNON() {
		return BASE_DAMAGE_PLASMACANNON;
	}

	public int getPLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY() {
		return PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY;
	}

	public int getPLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY() {
		return PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY;
	}
	
}
