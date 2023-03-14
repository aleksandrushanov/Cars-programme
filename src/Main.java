import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Mechanic.Mechanic;
import Transport.*;
import Mechanic.STO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Mechanic.MechanicSkills.*;

public class Main {
    public static void main(String[] args) {

        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic = new Mechanic("Andrei", "VVK", BUS_MECHANIC);
        Mechanic mechanic1 = new Mechanic("Viktor", "BBK", ALL_MECHANIC);
        Mechanic mechanic2 = new Mechanic("Petya", "FitServis", CAR_MECHANIC);
        Mechanic mechanic3 = new Mechanic("Sasha", "Avto Profi", TRUCK_MECHANIC);
        Mechanic mechanic4 = new Mechanic("Evgenei", "VVK", BUS_MECHANIC);
        Mechanic mechanic5 = new Mechanic("Marina", "BBK", ALL_MECHANIC);
        Mechanic mechanic6 = new Mechanic("Ira", "FitServis", CAR_MECHANIC);
        Mechanic mechanic7 = new Mechanic("Vika", "Avto Profi", TRUCK_MECHANIC);
        mechanics.add(mechanic);
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);
        mechanics.add(mechanic5);
        mechanics.add(mechanic6);
        mechanics.add(mechanic7);

        System.out.println("----------------------------------------");

        List<Driver> drivers = new ArrayList<>();
        DriverB<Car> driver = new DriverB<Car>("Ivan", true, 5,"B");
        DriverC<Truck> driver1 = new DriverC<Truck>("Andrei", true, 8,"C");
        DriverD<Bus> driver2 = new DriverD<Bus>("Viktor", true, 6,"D");
        DriverB<Car> driver3 = new DriverB<Car>("Elena", true, 5,"B");
        DriverC<Truck> driver4 = new DriverC<Truck>("Yaroslav", true, 8,"C");
        DriverD<Bus> driver5 = new DriverD<Bus>("Petr", true, 6,"D");
        drivers.add(driver);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        drivers.add(driver5);

        System.out.println("----------------------------------------");


        List<Transport> transports = new ArrayList<>();
        Car car = new Car("Lada","granta",1.6,2,driver,BodyType.SEDAN,mechanic);
        System.out.println(car);
        Car car1 = new Car("BMW", "x6", 3.0,1,driver3,BodyType.COPE,mechanic4);
        System.out.println(car1);
        Car car2 = new Car("Toyota", "supra", 3.0,3,driver,BodyType.COPE,mechanic);
        System.out.println(car2);
        Car car3 = new Car("nissan", "skyline", 3.0,4,driver,BodyType.SEDAN,mechanic);
        System.out.println(car3);
        car1.passDiagnostics();
        System.out.println("----------------------------------------");

        Bus bus = new Bus("nefaz", "150", 3.0,2,driver2,TypeCapacity.BIG,mechanic);
        System.out.println(bus);
        Bus bus1 = new Bus("volvo", "c250", 4.0,4,driver2,TypeCapacity.ESPECIALLY_SMALL,mechanic4);
        System.out.println(bus1);
        Bus bus2 = new Bus("Maz", "450", 4.0,2,driver2,TypeCapacity.AVERAGE,mechanic);
        System.out.println(bus2);
        Bus bus3 = new Bus("Man", "rx", 2.0,1,driver2,TypeCapacity.ESPECIALLY_SMALL,mechanic4);
        System.out.println(bus3);
        /*bus.passDiagnostics();*/


        System.out.println("----------------------------------------");

        Truck truck = new Truck("scania", "rbx", 5.0,2,driver1,LoadCapacity.N1,mechanic);
        System.out.println(truck);
        Truck truck1 = new Truck("volvo", "prp", 6.0,2,driver4,LoadCapacity.N1,mechanic);
        System.out.println(truck1);
        Truck truck2 = new Truck("man", "pit", 6.0,2,driver1,LoadCapacity.N3,mechanic4);
        System.out.println(truck2);
        Truck truck3 = new Truck("Freightliner", "Cascadia", 10.0,1,driver1,LoadCapacity.N2,mechanic5);
        System.out.println(truck3);


        System.out.println("----------------------------------------");


        transports.add(car);
        transports.add(bus);
        transports.add(truck1);
        transports.add(car1);



        car.addMechanik(mechanic1);
        bus.addMechanik(mechanic);
        truck.addMechanik(mechanic3);
        car.addMechanik(mechanic2);

        for (Transport<?> transport : transports) {
            System.out.println(transport + "\n водитель:   " + transport.getDrivers() + "\n Механик: "+ transport.getMechanics());

        }
        System.out.println("----------------------------------------");

        STO sto = new STO();

        sto.addTransport(car);
        sto.addTransport(bus);
        sto.addTransport(truck);

        sto.runTo();

        Map<Transport<?>, List<Mechanic>> transportAndMechanic = new HashMap<>();
        for (Transport<?> transport : transports) {
            transportAndMechanic.put(transport, transport.getMechanics());
        }
        System.out.println(transportAndMechanic);


    }
}