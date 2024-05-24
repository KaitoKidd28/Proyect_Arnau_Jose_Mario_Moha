package planetwars;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
	public static void main(String[] args) throws ResourceException {
		Planet planet = new Planet();
		planet.setMetal(200000);
		planet.setDeuterium(54500);
		planet.setTechnologyDefense(0);
		planet.setTechnologyAtack(0);
		planet.setUpgradeAttackTechnologyDeuteriumCost(2000);
		planet.setUpgradeDefenseTechnologyDeuteriumCost(2000);
		// ---------------------------
		planet.newArmoredShip(1);
		planet.newBattleShip(1);
		planet.newLigthHunter(3);
		planet.newHeavyHunter(1);
		// ---------------------------
		planet.newMissileLauncher(1);
		planet.newIonCannon(1);
		planet.newPlasmaCannon(1);
		Timer timer = new Timer();
		Comprobacion comprobacion = new Comprobacion();
		final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
		final String menu02 = "Build\n1)Build troops\n2)Build Defenses\n3)Go Back";
		final String menu021 = "Menu Build troops\n\n1)Build Ligth Hunter\n2)Build HeavyHunter\n3)Build Battle Ship\n4)Build ArmoredShip\n5)Go Back";
		final String menu022 = "Menu Build Defenses\n\n1)Build Missile Launcher\n2)Build Ion Cannon\n3)Build Plasma Cannon\n4)Go Back";
		final String menu03 = "1)Upgrade Defense Technology.\n2)Upgrade Attack Technology.\n3)Go Back";
		String menu04 = String.format("1)Upgrade Defense Technology.  Cost: %d Deuterium\\n2)Upgrade Attack Technology.  Cost: %d Deuterium\\n3)Go Back\";",
				planet.getUpgradeDefenseTechnologyDeuteriumCost(), planet.getUpgradeAttackTechnologyDeuteriumCost());
		final String menu05 = "Main Menu\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n5)View Thread Comming\n0)Exit";
		boolean salir = false;
		while (!salir) {
			System.out.println(menu00);
			System.out.println("Option > ");
			// timer.schedule(task, 180000);
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
						while (!salir) {
							System.out.println("\n" + menu021);
							System.out.println("Option > ");
							option = comprobacion.comprobarNumero();
							switch (option) {
							case 1:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								int amount = comprobacion.comprobarNumero();
								planet.newLigthHunter(amount);
								break;
							case 2:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								amount = comprobacion.comprobarNumero();
								planet.newHeavyHunter(amount);
								break;
							case 3:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								amount = comprobacion.comprobarNumero();
								planet.newBattleShip(amount);
								break;
							case 4:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								amount = comprobacion.comprobarNumero();
								planet.newArmoredShip(amount);
								break;
							case 5:
								salir = true;
								break;
							default:
								System.out.println("\nOpcion incorrecta\n");
							}
						}
						salir = false;
						break;
					case 2:
						while (!salir) {
							System.out.println("\n" + menu022);
							System.out.println("Option > ");
							option = comprobacion.comprobarNumero();
							switch (option) {
							case 1:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								int amount = comprobacion.comprobarNumero();
								planet.newMissileLauncher(amount);
								break;
							case 2:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								amount = comprobacion.comprobarNumero();
								planet.newIonCannon(amount);
								break;
							case 3:
								System.out.println("Amount of Units");
								System.out.println("Amount: >");
								amount = comprobacion.comprobarNumero();
								planet.newPlasmaCannon(amount);
								break;
							case 4:
								salir = true;
								break;
							default:
								System.out.println("\nOpcion incorrecta\n");
							}
						}
						salir = false;
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
				Scanner sc = new Scanner(System.in);
				while (!salir) {
					int actualDefense = planet.getTechnologyDefense();
					int actualAttack = planet.getTechnologyAtack();
					int costDefenseUpgrade = planet.getUpgradeDefenseTechnologyDeuteriumCost();
					int costAttackUpgrade = planet.getUpgradeAttackTechnologyDeuteriumCost();
					int deuteriumActual = planet.getDeuterium();
					String menuTech = String.format("Upgrade Technology\nActual Defense Technology:             %d\nActual Attack Technology:              %d\n\n1)Upgrade Defense Technology. Cost: %d  Deuterium\n2)Upgrade Attack Technology.  Cost: %d  Deuterium\n3)Go back\n\nDeuterium resources = %d",
							actualDefense, actualAttack, costDefenseUpgrade, costAttackUpgrade, deuteriumActual);
					System.out.println(menuTech);
					System.out.println("Option >");
					if (sc.hasNextInt()) {
						int opc = sc.nextInt();
						boolean inRange = opc >= 1 && opc <= 3;
						if (inRange) {
							switch (opc) {
							case 1:
								planet.upgradeTechnologyDefense();
								break;
							case 2:
								planet.upgradeTechnologyAttack();
								break;
							case 3:
								salir = true;
								break;
							}
						} else {
							System.out.println("Opción fuera de rango");
						}
					} else {
						System.out.println("Error: la entrada no es un número entero.");
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
	



