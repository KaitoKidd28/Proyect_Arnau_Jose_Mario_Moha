package planetwars;

import java.util.ArrayList;

public class Battle {
	private ArrayList<MilitaryUnit>[] planetArmy;
	private ArrayList<MilitaryUnit>[] enemyArmy;
	private ArrayList[][] armies;
	private String battleDevelopment;
	private int[][] initialCostFleet;
	private int initialNumberUnitsPlanet;
	private int initialNumberUnitsEnemy;
	private int[] wasteMetalDeuterium;
	private int[] enemyDrops;
	private int[] planetDrops;
	private int[][] resourcesLooses;
	private int[][] initialArmies;
	private int[] actualNumberUnitsPlanet;
	private int[] actualNumberUnitsEnemy;
	
	public String getBattleReport(int battles) {
		return battleDevelopment;
	}
	
	public String getBattleDevelopment() {
		return battleDevelopment;
	}
	
	public void initInitialArmies() {
	       for (int i = 0; i < 2; i++) {
	           for (int j = 0; j < 7; j++) {
	               if (i == 0) {
	                   initialArmies[i][j] = actualNumberUnitsPlanet[j];
	               } else {
	                   initialArmies[i][j] = actualNumberUnitsEnemy[j];
	               }
	           }
	       }
	   }
	
	public void updateResourcesLooses() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resourcesLooses[i][j] = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                resourcesLooses[i][0] += initialCostFleet[i][0] * (initialArmies[i][j] - actualNumberUnitsPlanet[j]);
                resourcesLooses[i][1] += initialCostFleet[i][1] * (initialArmies[i][j] - actualNumberUnitsPlanet[j]);
            }
        }
        resourcesLooses[0][2] = resourcesLooses[0][0] + 5 * resourcesLooses[0][1];
        resourcesLooses[1][2] = resourcesLooses[1][0] + 5 * resourcesLooses[1][1];
    }
	
	public int[] fleetResourceCost(ArrayList<MilitaryUnit>[] army) {
        int totalMetalCost = 0;
        int totalDeuteriumCost = 0;
        for (ArrayList<MilitaryUnit> unitList : army) {
            for (MilitaryUnit unit : unitList) {
                totalMetalCost += unit.getMetalCost();
                totalDeuteriumCost += unit.getDeuteriumCost();
            }
        }
        return new int[] {totalMetalCost, totalDeuteriumCost};
    }

	public int[] initialFleetNumber(ArrayList<MilitaryUnit>[] army) {
	    int[] unitCounts = new int[army.length];

	    for (int i = 0; i < army.length; i++) {
	        unitCounts[i] = army[i].size();
	    }

	    return unitCounts;
	}

//	public void initialFleetNumber(ArrayList<MilitaryUnit>[] army) {
//		int cont = 0;
//      	for (int i = 0; i < 2; i++) {
//      		for (int j = 0; j < 7; j++) {
//      			if (i == 0) {
//      				cont += 1;
//      				initialArmies[i][j] = actualNumberUnitsPlanet[j];
//      			} else {
//      				initialArmies[i][j] = actualNumberUnitsEnemy[j];
//      			}
//      		}
//      	}
//	}
	
	public int remainderPercentageFleet(ArrayList<MilitaryUnit>[] army) {
		return 0;	
	}
	
	public int getGroupDefender(ArrayList<MilitaryUnit>[] army) {
		return 0;
	}
	
	public int getPlanetGroupAttacker() {
		return 0;
	}
	
	public int  getEnemyGroupAttacker() {
		return 0;
	}
	
	public void resetArmyArmor() {
		
	}
}

