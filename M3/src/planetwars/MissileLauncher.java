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
	
}
