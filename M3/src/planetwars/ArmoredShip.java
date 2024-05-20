package planetwars;

public class ArmoredShip extends Ship{
	// Armadura de nuestro cazador ligero .
	private final int ARMOR_LIGTHHUNTER = 1000;
	// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
	private final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	
	private final int BASE_DAMAGE_LIGTHHUNTER = 50;
	
	private final int PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY = 10;
	
	// Primer constructor
	public ArmoredShip(int armor, int baseDamage) {
		super(armor, baseDamage);
	}
	
	// Segundo contructor
    public ArmoredShip() {
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