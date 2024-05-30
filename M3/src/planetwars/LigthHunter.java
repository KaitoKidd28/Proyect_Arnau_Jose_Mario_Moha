package planetwars;

public class LigthHunter extends Ship{
	private final int ARMOR_LIGTHHUNTER = 1000;
	private final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	private final int BASE_DAMAGE_LIGTHHUNTER = 50;
	private final int PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	
	// Primer constructor
	public LigthHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		// Esto de squi calcula la armadura basandose en la tecnologia de defensa.
	}
	
	// Segundo contructor
    public LigthHunter() {
        this(1000, 50);
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