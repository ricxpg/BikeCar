package bike.car;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class bikes {

    static Scanner sc = new Scanner(System.in);
    int speed;
    int turbo;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    public bikes(int speed, int turbo) {
        this.speed = speed;
        this.turbo = turbo;
    }

    public void bike() {
        int actuallyspeed;
        int actuallyturbo;
        System.out.println("la velocità della bicicletta è di " + getSpeed());
        System.out.println("se pedali puoi aumentarla, vuoi farlo? ");
        System.out.println("1. si"
                + "\n2. no");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("hai pedalato! La velocità è"
                        + " aumentata di 5");
                actuallyspeed = getSpeed() + 5;
                System.out.println("ora stai andando a " + actuallyspeed);
                break;
            case 2:
                actuallyspeed = getSpeed() - 5;
                System.out.println("la velocità è diminuita! ora è "
                        + actuallyspeed);
                break;
        }
        System.out.println("l'accellerazione attuale è di " + getTurbo());
        System.out.println("vuoi aumentarla?");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("l'accellerazione è aumentata di 5");
                actuallyturbo = getTurbo() + 5;
                break;
            case 2:
                actuallyturbo = getTurbo() - 10;
                System.out.println("l'accelleazione è diminuita drasticamente:"
                        + " " + actuallyturbo);
                break;
        }

    }
}
