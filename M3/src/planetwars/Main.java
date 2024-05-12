package planetwars;

public class Main {
	public static void main(String[] args) {
		Planet planet = new Planet();
		planet.setTechnologyDefense(3);
        planet.setTechnologyAtack(2);
        planet.setMetal(500);
        planet.setDeuterium(200);
        planet.setUpgradeDefenseTechnologyDeuteriumCost(100);
        planet.setUpgradeAttackTechnologyDeuteriumCost(120);
        planet.printStats();
		
        Ship lightHunter = new LigthHunter();
        Ship heavyHunter = new HeavyHunter();
        Ship battleShip = new BattleShip();
        Ship armoredShip = new ArmoredShip();
        
        System.out.println("Costo de deuterio para Light Hunter: " + lightHunter.getDeuteriumCost());
        System.out.println("Costo de deuterio para Heavy Hunter: " + heavyHunter.getDeuteriumCost());
        System.out.println("Costo de deuterio para Battle Ship: " + battleShip.getDeuteriumCost());
        System.out.println("Costo de deuterio para Armored Ship: " + armoredShip.getDeuteriumCost());
        
	}
}
