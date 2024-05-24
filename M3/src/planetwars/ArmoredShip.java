package planetwars;

public class ArmoredShip extends Ship{
	// Armadura de nuestro cazador ligero .
	private final int ARMOR_ARMOREDSHIP = 8000;
	// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
	private final int PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY = 5;
	
	private final int BASE_DAMAGE_ARMOREDSHIP = 700;
	
	private final int PLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY = 5;
	
	// Primer constructor
	public ArmoredShip(int armor, int baseDamage) {
		super(armor, baseDamage);
	}
	
	// Segundo contructor
    public ArmoredShip() {
        this(1000, 50);
    }

	public int getARMOR_ARMOREDSHIP() {
		return ARMOR_ARMOREDSHIP;
	}

	public int getPLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY() {
		return PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY;
	}

	public int getBASE_DAMAGE_ARMOREDSHIP() {
		return BASE_DAMAGE_ARMOREDSHIP;
	}

	public int getPLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY() {
		return PLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY;
	}

    
}
