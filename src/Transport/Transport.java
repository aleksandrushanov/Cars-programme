package Transport;

import Driver.Driver;

public  abstract class Transport implements Сompeting{
    final private String brand;

    final private String model;

    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
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


    @Override
    public abstract String toString();
}

