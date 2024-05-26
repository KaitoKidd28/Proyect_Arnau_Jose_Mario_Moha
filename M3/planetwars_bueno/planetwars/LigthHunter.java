package planetwars;

public class LigthHunter extends Ship{
	// Armadura de nuestro cazador ligero .
	private final int ARMOR_LIGTHHUNTER = 1000;
	// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
	private final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	
	private final int BASE_DAMAGE_LIGTHHUNTER = 50;
	
	private final int PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY = 10;
	
	// Primer constructor
	public LigthHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		// Esto de aqui calcula la armadura basandose en la tecnologia de defensa.
	}
	
	// Segundo contructor
    public LigthHunter() {
        this(1000, 50);
    }
	
}