import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Car {
    private final String brand;
    private final String model;
    private double engineVolume;

    private Set<Sponsor> sponsors = new HashSet<>();
    private Set<Driver> drivers = new HashSet<>();
    private Set<Mechanic> mechanics = new HashSet<>();

    private static Set<Car> allCars = new HashSet<>();

    public static Set<Car> getAllCars() {
        return allCars;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

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
        allCars.add(this);
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

    @Override
    public String toString() {
        return brand + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    // Все лишние параметры и методы, которые не указаны в данном задании
}
