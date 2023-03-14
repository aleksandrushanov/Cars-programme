package Transport;

import Driver.Driver;
import Driver.DriverD;
import Mechanic.Mechanic;

import java.util.List;

public class Bus extends Transport {
    private TypeCapacity typeCapacity;

    public Bus(String brand, String model, double engineVolume, int mechanicQuantity, DriverD driver, TypeCapacity typeCapacity, Mechanic mechanic) {
        super(brand, model, engineVolume, mechanicQuantity, driver);
        this.typeCapacity = typeCapacity;
        setDriver(driver);

    }
    public Bus(String brand, String model, double engineVolume, List<Driver> drivers, List<Mechanic> mechanics, int mechanicQuantity, Driver driver) {
        super(brand,model,engineVolume,drivers,mechanics,mechanicQuantity,driver);
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }
    public void setTypeCapacity(TypeCapacity typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

    @Override
    public void starMove() {
        System.out.println("Автобус начал движение " + getBrand() + " " + getModel());
    }

    @Override
    public void stopMove() {
        System.out.println("Австобус закончил движение " + getBrand() +" " + getModel());
    }

    @Override
    public void printType() {
        if (typeCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeCapacity);
        }
    }

    @Override
    public void passDiagnostics() {
       throw new UnsupportedOperationException("Автобус  "+getBrand() +getModel()+" не можжет пройти диагностику");
    }


    @Override
    public String toString() {
        return "Бернед " + getBrand() + '\'' +
                ", Модель'" + getModel() + '\'' + ",  Объём двигтаеля '" + getEngineVolume() + " " +getTypeCapacity()  ;
    }

    @Override
    public void pitStop() {
        System.out.println("pit-stop " + getModel() + " " + getBrand());
    }

    @Override
    public void bestTime() {
        int minTime = 10;
        int maxTime = 30;
        int time = (int) ((Math.random()*((maxTime-minTime)+1))+minTime);
        System.out.println("Лучшее время : "  + time + " минут ");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 80;
        int maxSpeed = 150;
        int speed= (int) ((Math.random()*((maxSpeed-minSpeed)+1))+minSpeed);
        System.out.println("Максимальная скорость автобуса " + speed + " км/ч");
    }
}
