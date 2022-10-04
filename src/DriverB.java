public class DriverB<C extends PassengerCar & Competing> extends Driver {

    public DriverB(String name, int experience) {
        super(name, experience);
        setDriverLicense('B');
    }

    public void competingMessage(C car) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand()
                + " " + car.getModel() + " и будет участвовать в заезде.");
    }
}
