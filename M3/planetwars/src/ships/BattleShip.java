package ships;

import entitys.Ship;

public class BattleShip extends Ship {

	public BattleShip(int armor, int baseDamage, int initialArmor, int technologyDefense, int technologyAtack) {
		super(armor, baseDamage, initialArmor);
		armor = ARMOR_BATTLESHIP + ((technologyDefense * PLUS_ARMOR_BATTLESHIP_BY_TECHNOLOGY) * ARMOR_BATTLESHIP / 100);
		baseDamage = BASE_DAMAGE_BATTLESHIP
				+ ((technologyAtack * PLUS_ATTACK_BATTLESHIP_BY_TECHNOLOGY) * BASE_DAMAGE_BATTLESHIP / 100);
		initialArmor = armor;
	}

	public BattleShip(int armor, int baseDamage, int initialArmor) {
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
