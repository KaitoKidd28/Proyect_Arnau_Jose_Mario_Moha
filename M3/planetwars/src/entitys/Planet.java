package entitys;

import java.util.ArrayList;

import exceptions.ResourceException;
import interfaces.MilitaryUnit;

public class Planet {
	private int technologyDefense;
	private int technologyAtack;
	private int metal;
	private int deuterium;
	private int upgradeDefenseTechnologyDeuteriumCost;
	private int upgradeAttackTechnologyDeuteriumCost;
	ArrayList<MilitaryUnit>[] army = new ArrayList[7];

	private Planet(int technologyDefense, int technologyAtack, int metal, int deuterium,
			int upgradeDefenseTechnologyDeuteriumCost, int upgradeAttackTechnologyDeuteriumCost,
			ArrayList<MilitaryUnit>[] army) {
		super();
		this.technologyDefense = 1;
		this.technologyAtack = 1;
		this.metal = metal;
		this.deuterium = deuterium;
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
		this.army = army;
	}

	public void upgradeTechnologyDefense(int upgradeDefenseTechnologyDeuteriumCost, int deuterium)
			throws ResourceException {
		try {
			if (deuterium >= upgradeDefenseTechnologyDeuteriumCost) {
				this.technologyDefense += 1;
				this.deuterium -= upgradeDefenseTechnologyDeuteriumCost;
				this.upgradeDefenseTechnologyDeuteriumCost *= 1.10;
			} else {
				throw new ResourceException("No tienes suficiente deuterium");
			}
		} finally {
		}
	}

	public void upgradeTechnologyAttack(int upgradeAttackTechnologyDeuteriumCost, int deuterium)
			throws ResourceException {
		try {
			if (deuterium >= upgradeAttackTechnologyDeuteriumCost) {
				this.technologyAtack += 1;
				this.deuterium -= upgradeAttackTechnologyDeuteriumCost;
				this.upgradeAttackTechnologyDeuteriumCost *= 1.10;
			} else {
				throw new ResourceException("No tienes suficiente deuterium");
			}
		} finally {
		}
	}

	public void printStats(int technologyAtack, int technologyDefense) {

	}

	public int getTechnologyDefense() {
		return technologyDefense;
	}

	public void setTechnologyDefense(int technologyDefense) {
		this.technologyDefense = technologyDefense;
	}

	public int getTechnologyAtack() {
		return technologyAtack;
	}

	public void setTechnologyAtack(int technologyAtack) {
		this.technologyAtack = technologyAtack;
	}

	public int getMetal() {
		return metal;
	}

	public void setMetal(int metal) {
		this.metal = metal;
	}

	public int getDeuterium() {
		return deuterium;
	}

	public void setDeuterium(int deuterium) {
		this.deuterium = deuterium;
	}

	public int getUpgradeDefenseTechnologyDeuteriumCost() {
		return upgradeDefenseTechnologyDeuteriumCost;
	}

	public void setUpgradeDefenseTechnologyDeuteriumCost(int upgradeDefenseTechnologyDeuteriumCost) {
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
	}

	public int getUpgradeAttackTechnologyDeuteriumCost() {
		return upgradeAttackTechnologyDeuteriumCost;
	}

	public void setUpgradeAttackTechnologyDeuteriumCost(int upgradeAttackTechnologyDeuteriumCost) {
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
	}

	public ArrayList<MilitaryUnit>[] getArmy() {
		return army;
	}

	public void setArmy(ArrayList<MilitaryUnit>[] army) {
		this.army = army;
	}

}
