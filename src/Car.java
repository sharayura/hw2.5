public abstract class Car {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Noname";
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Noname";
        }
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            engineVolume = 1.5;
        }
    }

    public abstract void start();

    public abstract void stop();

    // Все лишние параметры и методы, которые не указаны в данном задании
}
