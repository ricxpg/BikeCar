package bike.car;

/**
 *
 * @author puggioni.riccardo
 */
public class cars extends bikes {

    public cars(int speed, int turbo) {
        super(speed, turbo);
    }

    public void car() {
        int actuallyspeed;
        int actuallyturbo;
        bikes v = new bikes(0, 0);
        setSpeed(v.getSpeed());
        System.out.println("vuoi accendere la macchina? ");
        System.out.println("1. si"
                + "\n2. no");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("hai acceso la macchina: stai andando a"
                        + " " + getSpeed());
                System.out.println("vuoi accellerare?");
                switch (sc.next()) {
                    case "si":
                        actuallyspeed = getSpeed() + 30;
                        System.out.println("la tua velocità ora è"
                                + " " + actuallyspeed);
                        break;
                    case "no":
                        System.out.println("vuoi abilitare il turbo? ");
                        switch (sc.next()) {
                            case "si":
                                actuallyturbo = getTurbo() + 40;
                                System.out.println("turbo abilitato!"
                                        + " accellerazione aumentata a:"
                                        + " " + actuallyturbo);
                                break;
                            case "no":
                                System.out.println("accellerazione costante: "
                                        + "" + getTurbo());
                                break;
                        }
                        break;
                }
            case 2:
                break;
        }
        
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getTurbo() {
        return turbo;
    }

    @Override
    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

}
