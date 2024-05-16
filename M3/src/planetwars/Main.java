package planetwars;

public class Main {
	public static void main(String[] args) {
		Planet planet = new Planet();
		planet.setTechnologyDefense(3);
        planet.setTechnologyAtack(2);
        planet.setMetal(10000);
        planet.setDeuterium(10000);
        planet.setUpgradeDefenseTechnologyDeuteriumCost(100);
        planet.setUpgradeAttackTechnologyDeuteriumCost(120);
        
        //Defense missileLauncher = new MissileLauncher();
        //Ship heavyHunter = new HeavyHunter();
        //Ship battleShip = new BattleShip();
        //Ship armoredShip = new ArmoredShip();
        
        //System.out.println("Costo de deuterio para Missile Launcher: " + missileLauncher.getDeuteriumCost());
        //System.out.println("Costo de deuterio para Heavy Hunter: " + heavyHunter.getDeuteriumCost());
        //System.out.println("Costo de deuterio para Battle Ship: " + battleShip.getDeuteriumCost());
        //System.out.println("Costo de deuterio para Armored Ship: " + armoredShip.getDeuteriumCost());
        
        Comprobacion comprobacion = new Comprobacion();
       
        
        final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
        final String menu02 = "1)Build troops\n2)Build Defenses\n3)Go Back";
        final String menu03 = "1)Upgrade Defense Technology.\n2)Upgrade Attack Technology.\n3)Go Back";
        final String menu05 = "Planet Wars\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n5)View Thread Comming\n0)Exit";
        
        boolean salir = false;
		while (!salir) {
			System.out.println(menu00);
			System.out.println("Option > ");
			int option = comprobacion.comprobarNumero();
			switch (option) {
			case 1:
				planet.printStats();
				break;
			case 2:
				while (!salir) {
					System.out.println("\n" + menu02);
					System.out.println("Option > ");
					option = comprobacion.comprobarNumero();
					switch (option) {
					case 1:
						System.out.println("has elegido la opcion 1.");
						break;
					case 2:
						System.out.println("Has elegido la opcion 2.");
						break;
					case 3:
						salir = true;
						break;
					default:
						System.out.println("\nOpcion incorrecta\n");
					}
				}
				
			salir = false;
			break;
			case 3:
				while (!salir) {
					System.out.println("\n" + menu03);
					System.out.println("Option > ");
					option = comprobacion.comprobarNumero();
					switch (option) {
					case 1:
						System.out.println("has elegido la opcion 1.");
						break;
					case 2:
						System.out.println("has elegido la opcion 2.");
						break;
					case 3:
						salir = true;
						break;
					default:
						System.out.println("\nOpcion incorrecta\n");
					}
				}
				
			salir = false;
			break;
			case 4:
				System.out.println("Opcion no acabada.");
				break;
			
			case 0:
				salir = true;
				break;
			default:
				System.out.println("\nOpcion incorrecta\n");
			
		}

	}
}

}	

	



