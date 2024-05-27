package planetwars;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import planetwars.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Main implements Variables{
	private Planet planeta;
	private Battle pelea;
	private int metalEnemigo = METAL_BASE_ENEMY_ARMY;
	private int deuterioEnemigo = DEUTERIUM_BASE_ENEMY_ARMY;
	private TimerTask task1;
	private TimerTask task2;
	private TimerTask task3;
	private final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
	private final String menu05 = "\nMain Menu\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n5)View Thread Comming\n0)Exit";
	private boolean flg_00 = true;
	private boolean nosAtacan = false;
	private String menuMostrar = "";
	Main(){
		this.planeta = new Planet();
		this.pelea = new Battle();
	}
	public static void main(String[] args) throws ResourceException {
		OracleJavaJDBC conexion = new OracleJavaJDBC();
		conexion.conectar();
		Main programa = new Main();
		Planet planet = programa.getPlanet();
		Battle pelea = programa.getPelea();
		planet.setMetal(200000);
		planet.setDeuterium(54500);
		planet.setTechnologyDefense(0);
        planet.setTechnologyAtack(0);
        
        //---------------------------
		
        planet.setTechnologyAtack(0);
		planet.setUpgradeAttackTechnologyDeuteriumCost(2000);
		planet.setUpgradeDefenseTechnologyDeuteriumCost(2000);
		
		// ---------------------------
		
		planet.newArmoredShip(1);
		planet.newBattleShip(1);
		planet.newLigthHunter(3);
		planet.newHeavyHunter(1);

		//---------------------------

		planet.newMissileLauncher(1);
		planet.newIonCannon(1);
		planet.newPlasmaCannon(1);
		Timer timer = new Timer();
		programa.timers();
		timer.schedule(programa.task1, 60000,60000);
        timer.schedule(programa.task2, 180000,180000);
        timer.schedule(programa.task3, 120000,180000);
		
		// ---------------------------------------------------------
        
		final String menu02 = "Build\n1)Build troops\n2)Build Defenses\n3)Go Back";
		final String menu021 = "Menu Build troops\n\n1)Build Ligth Hunter\n2)Build HeavyHunter\n3)Build Battle Ship\n4)Build ArmoredShip\n5)Go Back";
		final String menu022 = "Menu Build Defenses\n\n1)Build Missile Launcher\n2)Build Ion Cannon\n3)Build Plasma Cannon\n4)Go Back";
		final String menu03 = "1)Upgrade Defense Technology.\n2)Upgrade Attack Technology.\n3)Go Back";
		final String menu04 = "Battle Reports\nThere is not reports to read";
		
		boolean salir = false;
	    programa.setMenuMostrar(programa.menu00);
		Comprobacion comprobacion = new Comprobacion();

		while (!salir) {
			System.out.println(programa.menuMostrar);
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
				System.out.println(menu04);
				break;
			case 5:
				if (programa.flg_00 & programa.nosAtacan) {
					programa.ViewThreat();
					break;	
				}
				else {
					System.out.println("Incorrect option");
					break;
				}
			case 0:
				timer.cancel();
				comprobacion.parar();
				conexion.insertar(planet.getMetal(), planet.getDeuterium(), planet.getTechnologyDefense(), planet.getTechnologyAtack(), planet.getArmy()[4].size(), planet.getArmy()[5].size(), planet.getArmy()[6].size(), planet.getArmy()[0].size(), planet.getArmy()[1].size(), planet.getArmy()[2].size(), planet.getArmy()[3].size());
				salir = true;
				break;
				
			default:
				System.out.println("\nOpcion incorrecta\n");
			}
		}
	}
	
// ------------------------------------------------------------------------------------------
	
	public void createEnemyArmy() {
		int recursosMetal = metalEnemigo;
	    int recursosDeuterium = deuterioEnemigo;
	    int[] porcentajesEnemy = {35, 25, 20, 20};
	    int total = 0;
	    
	    ArrayList<MilitaryUnit>[] enemyArmy = new ArrayList[4];
	    for (int i= 0; i < enemyArmy.length; i++) {
	    	enemyArmy[i] = new ArrayList<MilitaryUnit>();
	    	
	    }
	    
        while (recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
            int randNum =  (int)(Math.random()*100);
            total = 0;
            boolean seleccionado = false;
            for (int i = 0; i < porcentajesEnemy.length; i++) {
            	total += porcentajesEnemy[i];
            	if(total >= randNum) {
            	 if (i == 0 & !seleccionado & recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
                     enemyArmy[0].add(new LigthHunter());
                     recursosMetal -= METAL_COST_LIGTHHUNTER;
                     recursosDeuterium -= DEUTERIUM_COST_LIGTHHUNTER;
                     seleccionado = true;
                 } else if (i == 1 &  !seleccionado & recursosMetal >= METAL_COST_HEAVYHUNTER & recursosDeuterium >= DEUTERIUM_COST_HEAVYHUNTER) {
                     enemyArmy[1].add(new HeavyHunter());
                     recursosMetal -= METAL_COST_HEAVYHUNTER;
                     recursosDeuterium -= DEUTERIUM_COST_HEAVYHUNTER;
                     seleccionado = true;
                 } else if ( i == 2 &  !seleccionado &   recursosMetal >= METAL_COST_BATTLESHIP & recursosDeuterium >= DEUTERIUM_COST_BATTLESHIP) {
                     enemyArmy[2].add(new BattleShip());
                     recursosMetal -= METAL_COST_BATTLESHIP;
                     recursosDeuterium -= DEUTERIUM_COST_BATTLESHIP;
                     seleccionado = true;
                 } else if ( i == 3 &    !seleccionado &  recursosMetal >= METAL_COST_ARMOREDSHIP & recursosDeuterium >= DEUTERIUM_COST_ARMOREDSHIP) {
                     enemyArmy[3].add(new ArmoredShip());
                     recursosMetal -= METAL_COST_ARMOREDSHIP;
                     recursosDeuterium -= DEUTERIUM_COST_ARMOREDSHIP;
                     seleccionado = true;
                 } 
            	}
            	}
            }
        metalEnemigo += 40000;
        deuterioEnemigo += 20000;

        pelea.setEnemyArmy(enemyArmy.clone());
            	}
	
//	public void createEnemyArmy() {
//		int recursosMetal = METAL_BASE_ENEMY_ARMY;
//	    int recursosDeuterium = DEUTERIUM_BASE_ENEMY_ARMY;
//	    int[] porcentajesEnemy = {35, 25, 20, 20};
//	    ArrayList<MilitaryUnit>[] enemyArmy = new ArrayList[4];
//	    for (int i = 0; i < enemyArmy.length;i++) {
//	    	enemyArmy[i] = new ArrayList<MilitaryUnit>();
//	    }
//	    while (recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
//	    	int randNum = (int)Math.random()*100;
//	        if (randNum <= porcentajesEnemy[0] & recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
//	            enemyArmy[0].add(new LigthHunter());
//	            recursosMetal -= METAL_COST_LIGTHHUNTER;
//	            recursosDeuterium -= DEUTERIUM_COST_LIGTHHUNTER;
//	        } else if (randNum <= (porcentajesEnemy[0] + porcentajesEnemy[1]) & recursosMetal >= METAL_COST_HEAVYHUNTER & recursosDeuterium >= DEUTERIUM_COST_HEAVYHUNTER) {
//	            enemyArmy[1].add(new HeavyHunter());
//	            recursosMetal -= METAL_COST_HEAVYHUNTER;
//	            recursosDeuterium -= DEUTERIUM_COST_HEAVYHUNTER;
//	        } else if (randNum <= (porcentajesEnemy[0] + porcentajesEnemy[1] + porcentajesEnemy[2]) & recursosMetal >= METAL_COST_BATTLESHIP & recursosDeuterium >= DEUTERIUM_COST_BATTLESHIP) {
//	            enemyArmy[2].add(new BattleShip());
//	            recursosMetal -= METAL_COST_BATTLESHIP;
//	            recursosDeuterium -= DEUTERIUM_COST_BATTLESHIP;
//	        } else if (randNum <= (porcentajesEnemy[0] + porcentajesEnemy[1] + porcentajesEnemy[2] + porcentajesEnemy[3]) & recursosMetal >= METAL_COST_ARMOREDSHIP & recursosDeuterium >= DEUTERIUM_COST_ARMOREDSHIP) {
//	            enemyArmy[3].add(new ArmoredShip());
//	            recursosMetal -= METAL_COST_ARMOREDSHIP;
//	            recursosDeuterium -= DEUTERIUM_COST_ARMOREDSHIP;
//	        }
//	    }
//	    metalEnemigo += 30000;
//	    deuterioEnemigo += 15000;
//	    pelea.setEnemyArmy(enemyArmy.clone());
//	}
	
	public void ViewThreat() {
		String datos = String.format("NEW THREAT COMING\n\nLigth Hunter:			%d\nHeavyHunter:			%d\nBattle Ship:			%d\nArmored Ship			%d", 
				pelea.getEnemyArmy()[0].size(),pelea.getEnemyArmy()[1].size(), pelea.getEnemyArmy()[2].size(),pelea.getEnemyArmy()[3].size() );
		System.out.println(datos);
	}
	
	public void battle() {
	    pelea = new Battle(); // Asegúrate de inicializar enemyArmy
	    pelea.iniciarArmies();
	    pelea.initInitialArmies();

	    int cont = 0;
	    int numAleatorio = (int) (Math.random() * 2) + 1;
	    int grupoAtacante = 0;
	    int grupoDefensor = 0;
	    int atacante = 0;
	    int defensor = 0;
	    boolean salir = false;

	    while (!salir) {
	        boolean salir2 = false;
	        // Determina el grupo atacante
	        if (numAleatorio % 2 == 0) {
	            grupoAtacante = pelea.getEnemyGroupAttacker();
	            cont = 1;
	        } else {
	            grupoAtacante = pelea.getPlanetGroupAttacker();
	            cont = 0;
	        }
	        
	        // Determina el grupo defensor
	        ArrayList<MilitaryUnit>[] defendingArmy = pelea.getArmies()[numAleatorio % 2];
	        if (defendingArmy == null) {
	            System.out.println("El ejército defensor es nulo.");
	            return;
	        }
	        grupoDefensor = pelea.getGroupDefender(defendingArmy);

	        if (defendingArmy[grupoDefensor] == null || defendingArmy[grupoDefensor].isEmpty()) {
	            System.out.println("El grupo defensor es nulo o está vacío.");
	            return;
	        }

	        // Selecciona unidades atacantes y defensoras
	        atacante = (int) (Math.random() * pelea.getArmies()[cont][grupoAtacante].size());
	        defensor = (int) (Math.random() * defendingArmy[grupoDefensor].size());

	        // El atacante ataca al defensor
	        MilitaryUnit defensorUnit = (MilitaryUnit) defendingArmy[grupoDefensor].get(defensor);
	        MilitaryUnit atacanteUnit = (MilitaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante);
	        defensorUnit.tekeDamage(atacanteUnit.attack());

	        // Proceso de ataque
	        while (!salir2) {
	            int numAleatorio2 = (int) (Math.random() * 100);

	            // Verifica si la unidad defensora ha sido destruida
	            if (defensorUnit.getAcualArmor() <= 0) {
	                defendingArmy[grupoDefensor].remove(defensor);

	                // Verifica si el grupo defensor está vacío
	                if (defendingArmy[grupoDefensor].isEmpty()) {
	                    if (pelea.remainderPercentageFleet(defendingArmy) <= 20) {
	                        salir2 = true;
	                        salir = true;
	                        break;
	                    }
	                    grupoDefensor = pelea.getGroupDefender(defendingArmy);
	                }
	                defensor = (int) (Math.random() * defendingArmy[grupoDefensor].size());
	                defensorUnit = (MilitaryUnit) defendingArmy[grupoDefensor].get(defensor);
	            }

	            // Ataque basado en las probabilidades
	            if (numAleatorio % 2 == 0) {
	                if (CHANCE_ATTACK_ENEMY_UNITS[grupoAtacante] <= numAleatorio2) {
	                    defensorUnit.tekeDamage(atacanteUnit.attack());
	                } else {
	                    salir2 = true;
	                }
	            } else {
	                if (CHANCE_ATTACK_PLANET_UNITS[grupoAtacante] <= numAleatorio2) {
	                    defensorUnit.tekeDamage(atacanteUnit.attack());
	                } else {
	                    salir2 = true;
	                }
	            }
	        }

	        // Verifica si alguno de los ejércitos ha perdido el 80% de sus unidades
	        if (pelea.remainderPercentageFleet(pelea.getArmies()[0]) <= 20 || 
	            pelea.remainderPercentageFleet(pelea.getArmies()[1]) <= 20) {
	            salir = true;
	        }
	        numAleatorio += 1;
	    }
	}

	public void timers(){
		
		task1 = new TimerTask() {

			 public void run()
			 {
				 planeta.setMetal(planeta.getMetal()+12500);
				 planeta.setDeuterium(planeta.getDeuterium()+6500);
			 }
			 };	
			 
		task2 = new TimerTask() {

			 public void run()
			 {
				 Comprobacion comprobacion = new Comprobacion();
				 nosAtacan = true;
				 System.out.println("\n\nNEW THREAD IS COMMING");
				 menuMostrar = menu05;
				 createEnemyArmy();
				 if (flg_00) {
					 int option = 0;
					 System.out.println(menuMostrar);
					 System.out.println("Option > ");
					 option = comprobacion.comprobarNumero();
					 switch(option) {
					 case 5:
						 ViewThreat();
						 break;
					 }
				 }
			 }
			 };	
			 
		task3 = new TimerTask() {

			 public void run()
			 {
				 nosAtacan = false;
				 System.out.println("\n\nWE HAVE BEEN ATTACKED!!!");
				 menuMostrar = menu00;
				 if (flg_00) {
					 System.out.println();
				 }
			 }
			 };	
	}


//	public void battle() {
//		pelea = new Battle();
//		int cont = 0;
//		int numAleatorio = (int)Math.random()*2+1;
//		int grupoAtacante = 0;
//		int grupoDefensor = 0;
//		int atacante = 0;
//		int defensor = 0;
//		boolean salir = false;
//		while (!salir) {
//			boolean salir2 = false;
//			if (numAleatorio%2 == 0) {
//				grupoAtacante = pelea.getEnemyGroupAttacker();
//				cont = 1;
//			}
//			else {
//				grupoAtacante = pelea.getEnemyGroupAttacker();
//				cont = 0;
//			}
//			grupoDefensor = pelea.getGroupDefender(pelea.getArmies()[numAleatorio %2]);
//			atacante = (int)Math.random()*pelea.getArmies()[cont][grupoAtacante].size();
//			defensor = (int)Math.random()*pelea.getArmies()[numAleatorio%2][grupoDefensor].size();
//			((MilitaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).tekeDamage(((MilitaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());
//			while (!salir2) {
//				int numAleatorio2 = (int)Math.random()*100;
//				if (((MilitaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).getAcualArmor() <= 0){
//					pelea.getArmies()[numAleatorio%2][grupoDefensor].remove(defensor);
//					if (pelea.getArmies()[numAleatorio%2][grupoDefensor].isEmpty()) {
//						if(pelea.remainderPercentageFleet(pelea.getArmies()[numAleatorio%2]) <= 20) {
//							salir2 = true;
//							salir = true;
//							break;
//						}
//						grupoDefensor = pelea.getGroupDefender(pelea.getArmies()[numAleatorio %2]);
//					}
//					defensor = (int)Math.random()*pelea.getArmies()[numAleatorio%2][grupoDefensor].size();
//				}
//				if (numAleatorio%2 == 0) {
//					if (CHANCE_ATTACK_ENEMY_UNITS[grupoAtacante] <= numAleatorio2) {
//						((MilitaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).tekeDamage(((MilitaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());
//					}
//					else {
//						salir2 = true;
//					}
//				}
//				else {
//					if (CHANCE_ATTACK_PLANET_UNITS[grupoAtacante] <= numAleatorio2) {
//						((MilitaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).tekeDamage(((MilitaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());
//					}
//					else {
//						salir2 = true;
//					}
//				}
//				
//			}
//			if (pelea.remainderPercentageFleet(pelea.getArmies()[0]) <= 20 | pelea.remainderPercentageFleet(pelea.getArmies()[1]) <= 20) {
//				salir = true;
//			}
//			numAleatorio += 1;
//		}
//	}

	public Planet getPlanet() {
		return planeta;
	}

	public void setPlanet(Planet planet) {
		this.planeta = planet;
	}

	public Battle getPelea() {
		return pelea;
	}

	public void setPelea(Battle pelea) {
		this.pelea = pelea;
	}
	public String getMenuMostrar() {
		return menuMostrar;
	}
	public void setMenuMostrar(String menuMostrar) {
		this.menuMostrar = menuMostrar;
	}
	
	
}

	



