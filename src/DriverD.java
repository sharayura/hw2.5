public class DriverD<C extends Bus & Competing> extends Driver {

    public DriverD(String name, int experience) {
        super(name, experience);
        setDriverLicense('D');
    }

    public void competingMessage(C car) {
        System.out.println("Водитель " + getName() + " управляет автобусом " + car.getBrand()
                + " " + car.getModel() + " и будет участвовать в заезде.");
    }
}