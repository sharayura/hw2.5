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
}
