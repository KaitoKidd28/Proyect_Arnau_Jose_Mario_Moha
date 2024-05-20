package planetwars;

import java.util.ArrayList;

public class Battle {
	// Para almacenar la flota enemiga.
	private ArrayList<MilitaryUnit>[] planetArmy;

	// Para almacenar la flota de nuestro planeta.
	private ArrayList<MilitaryUnit>[] enemyArmy;

	/*
	 * Que es un array de ArrayList de dos filas y siete columnas, donde
	 * almacenaremos nuestro ejército en la primera fila, y el ejército enemigo en
	 * la segunda fila;
	 */
	private ArrayList[][] armies;

	// Donde guardamos todo el desarrollo de la batalla paso a paso.
	private String battleDevelopment;

	/*
	 * Coste de metal deuterio de los ejercitos iniciales initialCostFleet =
	 * [[metal][deuterio],[metal][deuterio]] , donde initialCostFleet[0] costes
	 * unidades del planeta , initialCostFleet[1] costes unidades enemigas. Lo
	 * necesitamos para saber las pérdidas en materiales de cada flota.
	 */
	private int[][] initialCostFleet;

	/*
	 * La batalla se acabará cuando uno de los dos ejércitos se quede con el 20% o
	 * menos de sus unidades iniciales, por tanto es necesario saber la cantidad de
	 * unidades iniciales de cada ejército.
	 */
	private int initialNumberUnitsPlanet;
	private int initialNumberUnitsEnemy;

	// esiduos generados en la batalla [metal, deuterio].
	private int[] wasteMetalDeuterium;

	// necesarios para generar reporte de batalla, y
	// para calcular las pérdidas materiales de cada ejército.
	private int[] enemyDrops;
	private int[] planetDrops;

	private int[][] resourcesLooses;

	private int[][] initialArmies;

	private int[] actualNumberUnitsPlanet;
	private int[] actualNumberUnitsEnemy;

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
		return 
	}

	public int initialFleetNumber(ArrayList<MilitaryUnit>[] army) {
		return -1;
	}

	public int remainderPercentageFleet(ArrayList<MilitaryUnit>[] army) {
		return -1;
	}

	public int getGroupDefender(ArrayList<MilitaryUnit>[] army) {
		return -1;
	}

	public int getPlanetGroupAttacker() {
		return -1;
	}

	public int getEnemyGroupAttacker() {
		return -1;
	}

	public void resetArmyArmor() {

	}
}