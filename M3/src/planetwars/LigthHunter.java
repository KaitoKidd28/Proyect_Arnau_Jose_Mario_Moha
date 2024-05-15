package planetwars;

public class LigthHunter extends Ship{
	// Armadura de nuestro cazador ligero .
	private static final int ARMOR_LIGTHHUNTER = 1000;
	// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
	private static final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	
	private static final int BASE_DAMAGE_LIGTHHUNTER = 50;
	
	private static final int PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY = 10;
	
	// Primer constructor
	public LigthHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		// Esto de squi calcula la armadura basandose en la tecnologia de defensa.
	}
	
	// Segundo contructor
    public LigthHunter() {
        this(ARMOR_LIGTHHUNTER, BASE_DAMAGE_LIGTHHUNTER);
    }

	
}
