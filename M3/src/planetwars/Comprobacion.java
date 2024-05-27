package planetwars;

import java.util.Scanner;

public class Comprobacion {
	private Scanner sc = new Scanner(System.in);
	public int comprobarNumero() {
        int option = 100;
        String cadena = "";
        if (!sc.hasNextInt()) {
            System.out.println("No has metido un número");
            sc.nextLine();
        } else {
            option = sc.nextInt();
            cadena = sc.nextLine();
            if (!cadena.equals("")) {
                System.out.println("Solo mete un número");
            }
        }
        return option;
    }
	public void parar() {
		sc.close();
	}
}
