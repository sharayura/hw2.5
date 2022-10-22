
public class Main {
    public static void main(String[] args) {

        var lanos = new PassengerCar("Daewoo", "Lanos", 1.5);
        var honda = new PassengerCar("Honda", "Civic", 2.0);
        var bmw = new PassengerCar("BMW", "X5", 3.6);
        var kia = new PassengerCar("Kia", "Rio", 1.6);

        var vasya = new DriverC("Вася", 15);
        var vasya1 = new DriverC("Вася", 15);
        var vasya2 = new DriverC("Вася", 15);
        var vasya3 = new DriverC("Вася", 15);

        var kamazTruck = new Truck("Камаз", "5320", 10.8, Truck.LoadCapacity.N2, vasya);
        var volvoTruck = new Truck("Volvo", "FH 2012", 12.7, Truck.LoadCapacity.N2, vasya1);
        var belazTruck = new Truck("Белаз", "75600", 77.5, Truck.LoadCapacity.N3, vasya2);
        var mercedesTruck = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N1, vasya3);
        System.out.println(volvoTruck.getCapacityType().getInfo());

        var ikarusBus = new Bus("Икарус", "250", 10.3);
        var volvoBus = new Bus("Volvo", "B10M", 9.6);
        var bogdanBus = new Bus("Богдан", "А750", 6.7);
        var neoplanBus = new Bus("Neoplan", "Tourliner", 12.4);


        var petya = new DriverB("Петя", 10);
        petya.competingMessage(honda);


        vasya.competingMessage(kamazTruck);

        var vanya = new DriverD("Ваня", 13);
        vanya.competingMessage(volvoBus);
        System.out.println();

        System.out.println("******Все автомобили:********");
        for (Car car : Car.getAllCars()) {
            System.out.println(car);
        }

        Sponsor vika = new Sponsor("vika", 1000);
        Sponsor vika1 = new Sponsor("vika1", 1000);

        honda.getSponsors().add(vika1);
        honda.getSponsors().add(vika);
        honda.getSponsors().add(vika);

        for (Sponsor current : honda.getSponsors()) {
            System.out.println(current.getName());
        }

        Mechanic<PassengerCar> ivan = new Mechanic<>("Иван Васильевич", "Tecnodrome");
        Mechanic<PassengerCar> oleg = new Mechanic<>("Олег Иванович", "Финкорп");

        honda.getMechanics().add(ivan);
        honda.getMechanics().add(oleg);
        honda.getMechanics().add(ivan);

        for (Mechanic<?> current : honda.getMechanics()) {
            System.out.println(current.getName() + " из " + current.getCompany());
        }

    }
}