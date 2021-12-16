package bike.car;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class BikeCar {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean a = true;
        do {

            System.out.println("inserisci la velocità dei veicoli: ");
            bikes v = new bikes(0, 0);

            cars c = new cars(0, 0);

            v.setSpeed(sc.nextInt());
            System.out.println("inserisci l'accellerazione dei veicoli: ");
            v.setTurbo(sc.nextInt());
            System.out.println("scegli un veicolo: ");
            System.out.println("1. Macchina"
                    + "\n2. Bicicletta"
                    + "\n3. Esci");

            switch (sc.nextInt()) {
                case 1:
                    c.car();
                    break;
                case 2:
                    v.bike();
                    break;
                case 3:
                    a = false;
            }

        } while (a == true);
    }
}
