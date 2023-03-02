package Driver;

import Transport.Transport;

public class DriverD<T extends Transport> extends Driver {
    public DriverD(String name, boolean availabilityOfRights, int experience,String category) {
        super(name, availabilityOfRights, experience,category);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории " +getCategory()+  getName()+ " начал движение ");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории "+getCategory() + getName()+ " закончил движение ");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории "+ getCategory() + getName()+ " заправляет авто");
    }

    public void drive(T transport) {
        System.out.println("Водитель " + getName() + " категории " + getCategory() + " управляет транспортным средством: " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в гонке");
        transport.printType();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
