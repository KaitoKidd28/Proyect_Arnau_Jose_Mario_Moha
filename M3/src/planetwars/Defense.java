package planetwars;

public class Defense implements MilitaryUnit, Variables{
	// armor será la armadura restante de nuestra defensa durante las batallas.
		private int armor;
		// InitialArmor será la armadura inicial de nuestra defensa, es decir, la armadura al momento de crearla.
		private int initialArmor;
		// BaseDamage el poder de ataque, le llamaremos baseDamage pensando en alguna posible ampliación del proyecto.
		private int baseDamage;
		
		public Defense(int armor, int baseDamage) {
			super();
			this.armor = armor;
			this.baseDamage = baseDamage;
		}
		
		public int getArmor() {
			return armor;
		}


		public void setArmor(int armor) {
			this.armor = armor;
		}



		public int getInitialArmor() {
			return initialArmor;
		}



		public void setInitialArmor(int initialArmor) {
			this.initialArmor = initialArmor;
		}
		


		public int getbaseDamage() {
			return baseDamage;
		}



		public void setbaseDamage(int baseDamage) {
			this.baseDamage = baseDamage;
		}
		
		// ---------------------------------------------------

		@Override
		public int attack() {
			return this.baseDamage;
		}

		@Override
		public void tekeDamage(int receivedDamage) {
			this.armor -= receivedDamage;
		}

		@Override
		public int getAcualArmor() {
			return this.armor;
		}

		@Override
		public int getMetalCost() {
			if (this instanceof MissileLauncher) {
				return Variables.METAL_COST_MISSILELAUNCHER;
			} else if (this instanceof IonCannon) {
				return Variables.METAL_COST_IONCANNON;
			} else if (this instanceof PlasmaCannon) {
				return Variables.METAL_COST_PLASMACANNON;
			} else {
				return 0;
			}
		}

		@Override
		public int getDeuteriumCost() {
			if (this instanceof MissileLauncher) {
				return Variables.DEUTERIUM_COST_MISSILELAUNCHER;
			} else if (this instanceof IonCannon) {
				return Variables.DEUTERIUM_COST_IONCANNON;
			} else if (this instanceof PlasmaCannon) {
				return Variables.DEUTERIUM_COST_PLASMACANNON;
			} else {
				return 0;
			}
		}

		@Override
		public int getChanceGeneratinWaste() {
			if (this instanceof MissileLauncher) {
				return Variables.CHANCE_GENERATNG_WASTE_MISSILELAUNCHER;
			} else if (this instanceof IonCannon) {
				return Variables.CHANCE_GENERATNG_WASTE_IONCANNON;
			} else if (this instanceof PlasmaCannon) {
				return Variables.CHANCE_GENERATNG_WASTE_PLASMACANNON;
			} else {
				return 0;
			}
		}

		@Override
		public int getChanceAttackAgain() {
			if (this instanceof MissileLauncher) {
				return Variables.CHANCE_ATTACK_AGAIN_MISSILELAUNCHER;
			} else if (this instanceof IonCannon) {
				return Variables.CHANCE_ATTACK_AGAIN_IONCANNON;
			} else if (this instanceof PlasmaCannon) {
				return Variables.CHANCE_ATTACK_AGAIN_PLASMACANNON;
			} else {
				return 0;
			}
		}

		@Override
		public void resetArmor() {
			this.armor = this.initialArmor;
		}

}
