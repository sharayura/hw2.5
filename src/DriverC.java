public class DriverC<C extends Truck & Competing> extends Driver {

    public DriverC(String name, int experience) {
        super(name, experience);
        setDriverLicense('C');
    }

    public void competingMessage(C car) {
        System.out.println("Водитель " + getName() + " управляет грузовиком " + car.getBrand()
                + " " + car.getModel() + " и будет участвовать в заезде.");
    }
}
