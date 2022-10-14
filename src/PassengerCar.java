import java.util.ArrayList;
import java.util.Random;

public class PassengerCar extends Car implements Competing {

    public enum BodyType {
        SEDAN,
        HATCHBACK,
        COUPE,
        UNIVERSAL,
        SUV,
        CROSSOVER,
        PICKUP,
        VAN,
        MINIVAN
    }


    private ArrayList<Sponsor> sponsors;
    private DriverB driver;

    public void setDriver(DriverB driver) {
        this.driver = driver;
    }

    public DriverB getDriver() {
        return driver;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }

    public PassengerCar(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
        this.sponsors = new ArrayList<>();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " на пит-стопе");
    }

    @Override
    public void bestCircleTime(double... times) {
        double bestTime = Double.MAX_VALUE;
        for (double time : times) {
            if (time < bestTime) {
                bestTime = time;
            }
        }
        System.out.println("Лучшее время круга легкового автомобиля " + getBrand() + " - " + bestTime + " секунд.");
    }

    @Override
    public void maxSpeed() {
        Random rand = new Random();
        System.out.println("Максимальная скорость легкового автомобиля " + getBrand() + " - "
                + (rand.nextInt(130) + 100) + " км/ч.");
    }
}
