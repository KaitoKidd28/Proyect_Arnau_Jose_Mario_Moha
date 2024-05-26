package planetwars;

import java.util.ArrayList;

public class Battle implements Variables {
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
				if (armies[i][j] == null) {
					initialArmies[i][j] = 0;
				} else {
					initialArmies[i][j] = armies[i][j].size();
				}
			}
		}
	}

	public void updateResourcesLooses() {

	}

	public void fleetResourceCost(ArrayList<MilitaryUnit>[] army) {
		int totalMetal = 0;
		int totalDeuterium = 0;

		for (int i = 0; i < army.length; i++) {
			totalMetal += army[i].size() * METAL_COST_UNITS[i];
			totalDeuterium += army[i].size() * DEUTERIUM_COST_UNITS[i];
		}

		if (army.length == 7) {
			initialCostFleet[0][0] = totalMetal;
			initialCostFleet[0][1] = totalDeuterium;
		} else {
			initialCostFleet[1][0] = totalMetal;
			initialCostFleet[1][1] = totalDeuterium;
		}
	}

	public void initialFleetNumber(ArrayList<MilitaryUnit>[] army) {
		int total = 0;
		for (int i = 0; i < army.length; i++) {
			if (army[i] == null) {
				total += 0;
			} else {
				total += army[i].size();
			}
		}

		if (army.length == 7) {
			initialNumberUnitsPlanet = total;
		} else {
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
		} else {
			result = (flotaRestante * 100) / initialNumberUnitsEnemy;
		}
		return result;
	}

	public int getGroupDefender(ArrayList<MilitaryUnit>[] army) {
		int [] percentages = new int[army.length];
		for (int i = 0; i < army.length; i++) {
			percentages[i] = 100 * (army[i].size()) / initialNumberUnitsPlanet;
		}
		return 1;
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