package ships;

import entitys.Ship;

public class HeavyHunter extends Ship {

	public HeavyHunter(int armor, int initialArmor, int baseDamage, int technologyDefense, int technologyAtack) {
		super(armor, initialArmor, baseDamage);
		armor = ARMOR_HEAVYHUNTER
				+ ((technologyDefense * PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY) * ARMOR_HEAVYHUNTER / 100);
		baseDamage = BASE_DAMAGE_HEAVYHUNTER
				+ ((technologyAtack * PLUS_ATTACK_HEAVYHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_HEAVYHUNTER / 100);
		initialArmor = armor;
	}

	public HeavyHunter(int armor, int baseDamage, int initialArmor) {
		super(armor, baseDamage, initialArmor);
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
