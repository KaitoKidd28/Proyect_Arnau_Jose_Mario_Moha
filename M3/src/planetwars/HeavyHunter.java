package planetwars;

public class HeavyHunter extends Ship{
		// Armadura de nuestro cazador ligero .
		private static final int ARMOR_LIGTHHUNTER = 1000;
		// Plus de armadura que tendrá en función del nivel de tecnologia de defensa que tengamos.
		private static final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
		
		private static final int BASE_DAMAGE_LIGTHHUNTER = 50;
		
		private static final int PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY = 10;
		
		// Primer constructor.
		public HeavyHunter(int armor, int baseDamage, int technologyLevel) {
			super(armor, baseDamage);
			// Esto de squi calcula la armadura basandose en la tecnologia de defensa.
			int armorWithTechnology = ARMOR_LIGTHHUNTER + (technologyLevel * PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY * ARMOR_LIGTHHUNTER)/100;
			
			// Esto calcula el daño base basandose en la tecnología de ataque.
			int baseDamageWithTechnology = BASE_DAMAGE_LIGTHHUNTER + (technologyLevel * PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY * BASE_DAMAGE_LIGTHHUNTER)/100;
			setArmor(armorWithTechnology);
	        setInitialArmor(armorWithTechnology);
	        setBaseDamage(baseDamageWithTechnology);
		}
		

}
