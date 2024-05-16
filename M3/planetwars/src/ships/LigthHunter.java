package ships;

import entitys.Ship;

public class LigthHunter extends Ship {
	private final int ARMOR_LIGTHHUNTER;
	private final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY;

	
	

	

	public LigthHunter(int armor, int baseDamage) {
		super();
		this.ARMOR_LIGTHHUNTER = 0;
		this.PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 0;
		
	}

	
	
	public LigthHunter() {
		super();
		this.ARMOR_LIGTHHUNTER = 0;
		this.PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 0;
		
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
