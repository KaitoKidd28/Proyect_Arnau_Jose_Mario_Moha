package ships;

import entitys.Ship;

public class LigthHunter extends Ship {

	public LigthHunter(int armor, int baseDamage, int initialArmor, int technologyDefense, int technologyAtack) {
		super(armor, baseDamage, initialArmor);
		armor = ARMOR_LIGTHHUNTER + ((technologyDefense * PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY) * ARMOR_LIGTHHUNTER / 100);
		baseDamage = BASE_DAMAGE_LIGTHHUNTER + ((technologyAtack * PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_LIGTHHUNTER / 100);
		initialArmor = armor;
	}
	
	
	public LigthHunter(int armor, int baseDamage, int initialArmor) {
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
