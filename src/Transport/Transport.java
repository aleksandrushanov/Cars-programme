package Transport;

import Driver.Driver;
import Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

public  abstract class Transport<T extends Driver> implements Сompeting{
    final private String brand;

    final private String model;

    private double engineVolume;

    protected List<Driver> drivers=new ArrayList<>();
    protected List<Mechanic> mechanics=new ArrayList<>();
    private int mechanicQuantity;
    private Driver driver;
    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, Driver driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        this.mechanicQuantity = mechanicQuantity;
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineVolume, List<Mechanic> mechanics, int mechanicQuantity, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanics = mechanics;
        this.mechanicQuantity = mechanicQuantity;
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineVolume, List<Driver> drivers, List<Mechanic> mechanics, int mechanicQuantity, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.drivers = drivers;
        this.mechanics = mechanics;
        this.mechanicQuantity = mechanicQuantity;
        this.driver = driver;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public void addMechanik(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public int getMechanicQuantity() {
        return mechanicQuantity;
    }

    public void setMechanicQuantity(int mechanicQuantity) {
        if (mechanicQuantity< 0) {
            this.mechanicQuantity = 1;
        } else if (mechanicQuantity >= 4) {
            throw new IndexOutOfBoundsException("Над машиной может работать не больше Механиков  ");
        } else {
            this.mechanicQuantity = mechanicQuantity;
        }


    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (driver != null) {
            this.driver = driver;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void starMove();

    public abstract void stopMove();
    public abstract void printType();

    public abstract void passDiagnostics();

    public abstract void createMechanicTeam(Mechanic... mechanics);

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", drivers=" + getDrivers() +
                ", mechanics=" + getMechanics() +
                ", mechanicQuantity=" + getMechanicQuantity() +
                ", driver=" + getDriver() +
                '}';
    }
}

