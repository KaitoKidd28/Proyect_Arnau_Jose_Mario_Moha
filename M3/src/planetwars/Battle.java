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
	
	
	public void battle() {
		
	}
	
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
        // Paso 1: Calcular el total de unidades
        int totalUnits = 0;
        int calculo = 0;
        int totalprobabilidad = 0;
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

