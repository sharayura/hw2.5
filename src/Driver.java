import java.util.Objects;

public abstract class Driver {
    private final String name;
    private char driverLicense;
    private int experience;

    public Driver(String name, int experience) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Noname";
        }
        this.experience = Math.abs(experience);
    }

    public String getName() {
        return name;
    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriverLicense(char driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void start() {

    }

    public void stop() {

    }

    public void refill() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience);
    }
}
