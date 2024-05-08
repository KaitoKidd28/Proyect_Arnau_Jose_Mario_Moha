package planetwars;

import java.util.ArrayList;

public class Battle {
	// Para almacenar la flota enemiga.
	private ArrayList<MilitaryUnit>[] planetArmy;
	
	// Para almacenar la flota de nuestro planeta.
	private ArrayList<MilitaryUnit>[] enemyArmy;
	
	/*Que es un array de ArrayList de dos filas y siete columnas,
	donde almacenaremos nuestro ejército en la primera fila, y el ejército enemigo en la
	segunda fila;*/
	private ArrayList[][] armies;
	
	// Donde guardamos todo el desarrollo de la batalla paso a paso.
	private String battleDevelopment;
	
	/*Coste de metal deuterio de los ejercitos iniciales
	initialCostFleet = [[metal][deuterio],[metal][deuterio]] , donde initialCostFleet[0]
	costes unidades del planeta , initialCostFleet[1] costes unidades enemigas. Lo
	necesitamos para saber las pérdidas en materiales de cada flota.*/
	private int[][] initialCostFleet;
	
	/*La batalla se
	acabará cuando uno de los dos ejércitos se quede con el 20% o menos de sus
	unidades iniciales, por tanto es necesario saber la cantidad de unidades iniciales de
	cada ejército.*/
	private int initialNumberUnitsPlanet;
	private int initialNumberUnitsEnemy;

	// esiduos generados en la batalla [metal, deuterio].
	private int[] wasteMetalDeuterium;
	
	// necesarios para generar reporte de batalla, y
	//para calcular las pérdidas materiales de cada ejército.
	private int[] enemyDrops;
	private int[] planetDrops;
	
	private int[][] resourcesLooses;
	
	private int[][] initialArmies;
	
	private int[] actualNumberUnitsPlanet;
	private int [] actualNumberUnitsEnemy;
}