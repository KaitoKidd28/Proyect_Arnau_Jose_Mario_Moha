package planetwars;

public class MissileLauncher extends Defense{
	private final int ARMOR_MISSILELAUNCHER = 800;
	private final int BASE_DAMAGE_MISSILELAUNCHER = 100;
	private final int PLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY = 5;
	private final int PLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY = 5;
	
	public MissileLauncher(int armor, int baseDamage) {
	    super(armor, baseDamage);
	}
	
	public MissileLauncher() {
		this(800, 100);
	}

	public int getARMOR_MISSILELAUNCHER() {
		return ARMOR_MISSILELAUNCHER;
	}

	public int getBASE_DAMAGE_MISSILELAUNCHER() {
		return BASE_DAMAGE_MISSILELAUNCHER;
	}

	public int getPLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY() {
		return PLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY;
	}

	public int getPLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY() {
		return PLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY;
	}
	
}
