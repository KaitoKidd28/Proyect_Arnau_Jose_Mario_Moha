package planetwars;

import java.util.ArrayList;

public class Battle implements Variables{
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
	               if (armies[i][j] == null) {
	                   initialArmies[i][j] = 0;
	               } else {
	            	   initialArmies[i][j] = armies[i][j].size();
	               }
	           }
	       }
	   }
	
	public void updateResourcesLooses() {
        // Puto
    }

	public void fleetResourceCost(ArrayList<MilitaryUnit>[] army) {
        int totalMetal = 0;
        int totalDeuterium = 0;
        
         for (int i = 0; i < army.length; i++) {
                 totalMetal += army[i].size() * METAL_COST_UNITS[i];
                 totalDeuterium += army[i].size() * DEUTERIUM_COST_UNITS[i];
         }
         if (army.length == 7) {
             initialCostFleet[0][0] =  totalMetal;
             initialCostFleet[0][1] = totalDeuterium;
         }
         else {
             initialCostFleet[1][0] = totalMetal;
             initialCostFleet[1][1] = totalDeuterium;
         }
    }

	public void initialFleetNumber(ArrayList<MilitaryUnit>[] army) {
        int total = 0;
        for (int i = 0; i < army.length; i++) {
        	if (army[i] == null) {
        		total += 0;
        	}
        	else {
        		total += army[i].size();
        	}
        }
        if (army.length == 7) {
            initialNumberUnitsPlanet = total;
        }
        else {
            initialNumberUnitsEnemy = total;
        }
   }
	
	public int remainderPercentageFleet(ArrayList<MilitaryUnit>[] army) {
        int flotaRestante = 0;
        int result = 0;
        for (int i = 0; i < army.length; i++) {
            if (army[i] != null) {
            	flotaRestante += army[i].size();
            }
        }
        if (army.length == 7) {
            result = (flotaRestante * 100) / initialNumberUnitsPlanet;
        }
        else {
            result = (flotaRestante * 100) / initialNumberUnitsEnemy;
        }
        return result;
    }
	
	public int getGroupDefender(ArrayList<MilitaryUnit>[] army) {
        int totalUnits = 0;
        int calculo = 0;
        int totalprobabilidad = 0;
        double randomNumber = 0;
        int comprobacionPorcentages = 0;
        ArrayList groupProbabilidades = new ArrayList();
        for (int i = 0; i < army.length; i++) {
            if (army[i] != null)
                totalUnits += army[i].size();
        }
        for (int i = 0; i < army.length; i++) {
            calculo = (army[i].size() * 100) / totalUnits;
            groupProbabilidades.add(calculo);
            totalprobabilidad += calculo;
        }
        while (true) {
            randomNumber = (int)(Math.random() * totalprobabilidad);
            for (int i = 0; i < groupProbabilidades.size(); i++) {
                comprobacionPorcentages += (int) groupProbabilidades.get(i);
                if (comprobacionPorcentages >= randomNumber) {
                    return i;
                }
            }
        }
	}
	
	public int getPlanetGroupAttacker() {
		int totalUnits = 0;
		double randomNumber = 0;
		int comprobacionPorcentages = 0;
		for (int i = 0; i < CHANCE_ATTACK_PLANET_UNITS.length; i++) {
			 totalUnits += CHANCE_ATTACK_PLANET_UNITS[i];
		}
		while (true) {
			randomNumber =  (int)(Math.random()*totalUnits);
			for (int i = 0; i < CHANCE_ATTACK_PLANET_UNITS.length; i++) {
				comprobacionPorcentages += (int) CHANCE_ATTACK_PLANET_UNITS[i];
                if (comprobacionPorcentages >= randomNumber) {
                    return i;
                }
			}
		}
	}
	
	public int  getEnemyGroupAttacker() {
		int totalUnits = 0;
		double randomNumber = 0;
		int comprobacionPorcentages = 0;
		for (int i = 0; i < CHANCE_ATTACK_ENEMY_UNITS.length; i++) {
			 totalUnits += CHANCE_ATTACK_ENEMY_UNITS[i];
		}
		while (true) {
			randomNumber =  (int)(Math.random()*totalUnits);
			for (int i = 0; i < CHANCE_ATTACK_ENEMY_UNITS.length; i++) {
				comprobacionPorcentages += (int) CHANCE_ATTACK_ENEMY_UNITS[i];
                if (comprobacionPorcentages >= randomNumber) {
                    return i;
                }
			}
		}
	}
	
	public void resetArmyArmor() {
		
	}
	
	public void iniciarArmies() {
		for (int i = 0; i < armies.length;i++) {
				if (i == 0) {
					armies[i] = planetArmy.clone();
				}
				else {
					armies[i] = enemyArmy.clone();
			}
		}
	}
	
// ---------------------------------------------------------------------------------
	
	public ArrayList<MilitaryUnit>[] getPlanetArmy() {
		return planetArmy;
	}

	public void setPlanetArmy(ArrayList<MilitaryUnit>[] planetArmy) {
		this.planetArmy = planetArmy;
	}

	public ArrayList<MilitaryUnit>[] getEnemyArmy() {
		return enemyArmy;
	}

	public void setEnemyArmy(ArrayList<MilitaryUnit>[] enemyArmy) {
		this.enemyArmy = enemyArmy;
	}

	public ArrayList[][] getArmies() {
		return armies;
	}

	public void setArmies(ArrayList[][] armies) {
		this.armies = armies;
	}
	
	
}

