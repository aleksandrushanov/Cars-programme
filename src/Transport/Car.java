package Transport;

import Driver.DriverB;
import Mechanic.Mechanic;



public class Car extends Transport {
    private  BodyType typeBody;

    public Car(String brand, String model, double engineVolume, int mechanicQuantity, DriverB driver, BodyType typeBody, Mechanic mechanic) {
        super(brand, model, engineVolume, mechanicQuantity, driver);
        this.typeBody = typeBody;

    }
    public BodyType getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(BodyType typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public void starMove() {
        System.out.println("Автомобиль начал движение " + getBrand() + " " + getModel());
    }

    @Override
    public void stopMove() {
        System.out.println("Автобиль закончил движение " + getBrand() +" " + getModel());
    }

    @Override
    public void printType() {
        if (typeBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeBody);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль "+getBrand() +getModel()+" проходит диагностику");
    }

    @Override
    public void createMechanicTeam(Mechanic... mechanics) {

    }

    @Override
    public void pitStop() {
        System.out.println("pit-stop " + getModel() + " " + getBrand());
    }

    @Override
    public void bestTime() {
        int minTime = 5;
        int maxTime = 10;
        int time = (int) ((Math.random()*((maxTime-minTime)+1))+minTime);
        System.out.println("Лучшее время : "  + time + " минут ");

    }

    @Override
    public void maxSpeed() {
        int minSpeed = 120;
        int maxSpeed = 200;
        int speed= (int) ((Math.random()*((maxSpeed-minSpeed)+1))+minSpeed);
        System.out.println("Максимальная скорость автобуса " + speed + " км/ч");
    }
    @Override
    public String toString() {
        return "Бернед " + getBrand() + '\'' +
                ", Модель'" + getModel() + '\'' + ",  Объём двигтаеля '" + getEngineVolume() + " " +getTypeBody()  ;
    }


}











