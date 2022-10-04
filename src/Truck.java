import java.util.Random;

public class Truck extends Car implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " на пит-стопе");
    }

    @Override
    public void bestCircleTime(double... times) {
        double bestTime = Double.MAX_VALUE;
        for (double time : times) {
            if (time < bestTime) {
                bestTime = time;
            }
        }
        System.out.println("Лучшее время круга грузовика " + getBrand() + " - " + bestTime + " секунд.");
    }

    @Override
    public void maxSpeed() {
        Random rand = new Random();
        System.out.println("Максимальная скорость грузовика " + getBrand() + " - "
                + (rand.nextInt(100) + 100) + " км/ч.");
    }
}
