package defenses;

import entitys.Defense;

public class IonCannon extends Defense {

	public IonCannon(int armor, int initialArmor, int baseDamage, int technologyDefense, int technologyAtack) {
		super(armor, initialArmor, baseDamage);
		armor = ARMOR_IONCANNON + ((technologyDefense * PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY) * ARMOR_IONCANNON / 100);
		baseDamage = BASE_DAMAGE_IONCANNON
				+ ((technologyAtack * PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY) * BASE_DAMAGE_IONCANNON / 100);
		initialArmor = armor;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void tekeDamage(int receivedDamage) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getActualArmor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMetalCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeuteriumCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChanceGeneratinWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChanceAttackAgain() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetArmor() {
		// TODO Auto-generated method stub

	}

}
