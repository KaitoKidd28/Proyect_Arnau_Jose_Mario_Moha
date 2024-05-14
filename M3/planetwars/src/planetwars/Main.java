package planetwars;

import interfaces.Variables;
import ships.LigthHunter;

public class Main {

	public static void main(String[] args) {
		addLightHunter();

	}

	public static void addLightHunter() {
		int technologyDefense = 2;
		int technologyAtack = 3;

		int armor = Variables.ARMOR_LIGTHHUNTER + ((technologyDefense * Variables.PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY)
				* Variables.ARMOR_LIGTHHUNTER / 100);
		int baseDamage = Variables.BASE_DAMAGE_LIGTHHUNTER
				+ ((technologyAtack * Variables.PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY)
						* Variables.BASE_DAMAGE_LIGTHHUNTER / 100);
		int initialArmor = armor;

		LigthHunter nave = new LigthHunter(armor, baseDamage, initialArmor, 4, 5);
	}

	public static void addEnemyLightHunter() {
		LigthHunter naveEnemiga = new LigthHunter(Variables.ARMOR_LIGTHHUNTER, Variables.BASE_DAMAGE_LIGTHHUNTER,
				Variables.BASE_DAMAGE_LIGTHHUNTER);

	}

}
