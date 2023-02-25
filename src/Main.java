import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("lada", "Grants", 1.6, BodyType.SEDAN);
        System.out.println(car);
        Car car1 = new Car("BMW", "x6", 3.0,BodyType.COPE);
        System.out.println(car1);
        Car car2 = new Car("Toyota", "supra", 3.0,BodyType.COPE);
        System.out.println(car2);
        Car car3 = new Car("nissan", "skyline", 3.0,BodyType.COPE);
        System.out.println(car3);
        car1.passDiagnostics();
        System.out.println("----------------------------------------");

        Bus bus = new Bus("nefaz", "150", 3.0,TypeCapacity.AVERAGE);
        System.out.println(bus);
        Bus bus1 = new Bus("volvo", "c250", 4.0,TypeCapacity.MINI);
        System.out.println(bus1);
        Bus bus2 = new Bus("Maz", "450", 4.0,TypeCapacity.BIG);
        System.out.println(bus2);
        Bus bus3 = new Bus("Man", "rx", 2.0,TypeCapacity.ESPECIALLY_SMALL);
        System.out.println(bus3);
        /*bus.passDiagnostics();*/
        System.out.println("----------------------------------------");

        Truck truck = new Truck("scania", "rbx", 5.0, LoadCapacity.N1);
        System.out.println(truck);
        Truck truck1 = new Truck("volvo", "prp", 6.0,LoadCapacity.N2);
        System.out.println(truck1);
        Truck truck2 = new Truck("man", "pit", 6.0,LoadCapacity.N3);
        System.out.println(truck2);
        Truck truck3 = new Truck("Freightliner", "Cascadia", 10.0,null);
        System.out.println(truck3);

        System.out.println("----------------------------------------");

        DriverB<Car> driverB = new DriverB<Car>("Ivan", true, 5,"B");
        driverB.drive(car);
        DriverC<Truck> driverC = new DriverC<Truck>("Andrei", true, 8,"C");
        driverC.drive(truck1);
        DriverD<Bus> driverD = new DriverD<Bus>("Viktor", true, 6,"D");
        driverD.drive(bus1);
    }
}