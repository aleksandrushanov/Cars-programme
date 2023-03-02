package Mechanic;

public enum MechanicSkills{
    BUS_MECHANIC("автобус"),
    TRUCK_MECHANIC("грузовик"),
    CAR_MECHANIC("легквовой автомобиль"),
    ALL_MECHANIC("все типы техники");
    private final String MechanicSkills;
    MechanicSkills(String mechanicSkills) {
        MechanicSkills = mechanicSkills;
    }

    public String getMechanicSkills() {
        return MechanicSkills;
    }

    @Override
    public String toString() {
        return " механик работает с " + MechanicSkills;
    }
}
