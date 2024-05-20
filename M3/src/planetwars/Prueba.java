package planetwars;

import java.util.Arrays;
import java.util.List;

public class Prueba {
	public static void main(String[] args) {
		Planet planet = new Planet();
		planet.setTechnologyDefense(3);
        planet.setTechnologyAtack(2);
        planet.setMetal(10000);
        planet.setDeuterium(10000);
        planet.setUpgradeDefenseTechnologyDeuteriumCost(100);
        planet.setUpgradeAttackTechnologyDeuteriumCost(120);
        Planet myPlanet = new Planet();

        // Inicializar las flotas (suponiendo que ya has agregado unidades a las flotas)
        // myPlanet.initializeArmies();

        // Obtener la cantidad de cada tipo de unidad
//        int[] unitCounts = myPlanet.initialFleetNumber(myPlanet.getArmy());
//
//        // Mostrar la cantidad de cada tipo de unidad
//        System.out.println("Cantidad de unidades al iniciar la pelea:");
//        System.out.println("Ligth Hunters: " + unitCounts[0]);
//        System.out.println("Heavy Hunters: " + unitCounts[1]);
        // Añade más líneas para mostrar otras unidades si es necesario
//        List<Integer> list = Arrays.asList(0,2,4,6,8,10,12);
//        long total = list.stream().count();
//        System.out.println(total);
//        Battle battle = new Battle();
        
//        Defense missileLauncher = new MissileLauncher();
//        Ship heavyHunter = new HeavyHunter();
//        Ship battleShip = new BattleShip();
//        Ship armoredShip = new ArmoredShip();
        

//        System.out.println("Costo de deuterio para Missile Launcher: " + missileLauncher.getChanceGeneratinWaste());
//        System.out.println("Costo de deuterio para Heavy Hunter: " + heavyHunter.getChanceAttackAgain());
//        System.out.println("Costo de deuterio para Battle Ship: " + battleShip.getChanceAttackAgain());
//        System.out.println("Costo de deuterio para Armored Ship: " + armoredShip.getChanceGeneratinWaste());
        
	}
}
