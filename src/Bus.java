import java.util.Random;

public class Bus extends Car implements Competing {

    public enum CapacityType {
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 25"),
        MEDIUM("40–50"),
        LARGE("60–80"),
        ESPECIALLY_LARGE("100–120 мест");
        private final String info;

        CapacityType(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }
    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Автобус " + getBrand() + " на пит-стопе");
    }

    @Override
    public void bestCircleTime(double... times) {
        double bestTime = Double.MAX_VALUE;
        for (double time : times) {
            if (time < bestTime) {
                bestTime = time;
            }
        }
        System.out.println("Лучшее время круга автобуса " + getBrand() + " - " + bestTime + " секунд.");
    }

    @Override
    public void maxSpeed() {
        Random rand = new Random();
        System.out.println("Максимальная скорость автобуса " + getBrand() + " - "
                + (rand.nextInt(90) + 100) + " км/ч.");
    }
}
