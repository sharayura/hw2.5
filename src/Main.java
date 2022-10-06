public class Main {
    public static void main(String[] args) {

        var lanos = new PassengerCar("Daewoo", "Lanos", 1.5);
        var honda = new PassengerCar("Honda", "Civic", 2.0);
        var bmw = new PassengerCar("BMW", "X5", 3.6);
        var kia = new PassengerCar("Kia", "Rio", 1.6);

        var kamazTruck = new Truck("Камаз", "5320", 10.8, Truck.LoadCapacity.N2);
        var volvoTruck = new Truck("Volvo", "FH 2012", 12.7, Truck.LoadCapacity.N2);
        var belazTruck = new Truck("Белаз", "75600", 77.5, Truck.LoadCapacity.N3);
        var mercedesTruck = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N1);
        System.out.println(volvoTruck.getCapacityType().getInfo());

        var ikarusBus = new Bus("Икарус", "250", 10.3);
        var volvoBus = new Bus("Volvo", "B10M", 9.6);
        var bogdanBus = new Bus("Богдан", "А750", 6.7);
        var neoplanBus = new Bus("Neoplan", "Tourliner", 12.4);

        lanos.pitStop();
        lanos.bestCircleTime(20.3, 36.8, 45.5, 25.4);
        lanos.maxSpeed();

        honda.pitStop();
        honda.bestCircleTime(18.3, 26.8, 15.5, 25.4);
        honda.maxSpeed();

        bmw.pitStop();
        bmw.bestCircleTime(20.3, 16.8, 12.5, 22.4);
        bmw.maxSpeed();

        kia.pitStop();
        kia.bestCircleTime(43.5, 36.8, 26.5, 29.4);
        kia.maxSpeed();

        kamazTruck.pitStop();
        kamazTruck.bestCircleTime(30.3, 36.8, 45.5, 29.4);
        kamazTruck.maxSpeed();

        volvoTruck.pitStop();
        volvoTruck.bestCircleTime(40.3, 39.8, 45.5, 60.4);
        volvoTruck.maxSpeed();

        belazTruck.pitStop();
        belazTruck.bestCircleTime(48.3, 56.8, 55.5, 65.4);
        belazTruck.maxSpeed();

        mercedesTruck.pitStop();
        mercedesTruck.bestCircleTime(50.3, 46.8, 65.5, 45.4);
        mercedesTruck.maxSpeed();

        ikarusBus.pitStop();
        ikarusBus.bestCircleTime(60.3, 56.8, 65.5, 65.4);
        ikarusBus.maxSpeed();

        volvoBus.pitStop();
        volvoBus.bestCircleTime(61.5, 66.8, 65.5, 65.4);
        volvoBus.maxSpeed();

        bogdanBus.pitStop();
        bogdanBus.bestCircleTime(30.3, 36.8, 55.5, 45.4);
        bogdanBus.maxSpeed();

        neoplanBus.pitStop();
        neoplanBus.bestCircleTime(70.3, 66.8, 75.5, 65.4);
        neoplanBus.maxSpeed();
        System.out.println();

        var petya = new DriverB("Петя", 10);
        petya.competingMessage(honda);

        var vasya = new DriverC("Вася", 15);
        vasya.competingMessage(kamazTruck);

        var vanya = new DriverD("Ваня", 13);
        vanya.competingMessage(volvoBus);



    }
}