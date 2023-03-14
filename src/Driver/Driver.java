package Driver;


import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean availabilityOfRights;
    private int experience;
    private String category;

    public Driver(String name, boolean availabilityOfRights, int experience,String category) {
        this.name = name;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;
        setCategory(category);

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category)  {
        if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriversLicenseExceptions("Driver's licence category have to be specified" +
                        " for the driver " + getName());
            } catch (DriversLicenseExceptions e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailabilityOfRights() {
        return availabilityOfRights;
    }

    public void setAvailabilityOfRights(boolean availabilityOfRights) {
        this.availabilityOfRights = availabilityOfRights;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return availabilityOfRights == driver.availabilityOfRights && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, availabilityOfRights, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Имя " + name + '\'' +
                ", наличие прав=" + availabilityOfRights +
                ", опыт =" + experience +
                ", категория прав ='" + category + '\'' +
                '}';
    }
}
