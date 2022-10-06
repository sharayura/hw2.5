import java.util.Random;

public class Truck extends Car implements Competing{

    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String info;

        LoadCapacity(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }

    private final LoadCapacity capacityType;

    public Truck(String brand, String model, double engineVolume, LoadCapacity capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public LoadCapacity getCapacityType() {
        return capacityType;
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
