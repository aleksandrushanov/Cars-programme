package Transport;

import Driver.DriverC;
import Mechanic.Mechanic;

public class Truck extends Transport {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, int mechanicQuantity, DriverC driver, LoadCapacity loadCapacity, Mechanic mechanic) {
        super(brand, model, engineVolume, mechanicQuantity, driver);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void starMove() {
        System.out.println("Грузовик начал движение " + getBrand() + " " + getModel());
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик закончил движение " + getBrand() + " " + getModel());
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовик "+getBrand() +getModel()+" проходит диагностику");
    }




    @Override
    public void pitStop() {
        System.out.println("pit-stop " + getModel() + " " + getBrand());
    }

    @Override
    public void bestTime() {
        int minTime = 10;
        int maxTime = 20;
        int time = (int) ((Math.random() * ((maxTime - minTime) + 1)) + minTime);
        System.out.println("Лучшее время : " + time + " минут ");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 100;
        int maxSpeed = 150;
        int speed = (int) ((Math.random() * ((maxSpeed - minSpeed) + 1)) + minSpeed);
        System.out.println("Максимальная скорость автобуса " + speed + " км/ч");
    }

    @Override
    public String toString() {
        return "Бернед " + getBrand() + '\'' +
                ", Модель'" + getModel() + '\'' + ",  Объём двигтаеля '" + getEngineVolume() + " " +getLoadCapacity()  ;
    }
}