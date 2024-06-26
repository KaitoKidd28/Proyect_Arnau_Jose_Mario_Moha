package planetwars;

public class HeavyHunter extends Ship{
	// Armadura de nuestro cazador ligero .
	private final int ARMOR_HEAVYHUNTER = 1000;
	// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
	private final int PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY = 5;
	
	private final int BASE_DAMAGE_HEAVYHUNTER = 150;
	
	private final int PLUS_ATTACK_HEAVYHUNTER_BY_TECHNOLOGY = 5;
	
	// Primer constructor.
	public HeavyHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		// Esto de squi calcula la armadura basandose en la tecnologia de defensa.
	}
	
	// Segundo contructor
    public HeavyHunter() {
        this(1000, 150);
    }

	public int getARMOR_LIGTHHUNTER() {
		return ARMOR_LIGTHHUNTER;
	}

	public int getPLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY() {
		return PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY;
	}

	public int getBASE_DAMAGE_LIGTHHUNTER() {
		return BASE_DAMAGE_LIGTHHUNTER;
	}

	public int getPLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY() {
		return PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY;
	}
	
}
