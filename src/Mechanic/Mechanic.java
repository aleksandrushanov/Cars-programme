package Mechanic;

import Transport.Transport;

import java.util.Objects;

public class Mechanic {

    private String name;
    private String company;
    private final MechanicSkills mechanicSkills;

    public Mechanic(String name, String company, MechanicSkills mechanicSkills) {
        setName(name);
        setCompany(company);
        this.mechanicSkills = mechanicSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            name = "Ivanov Ivan";
        }
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null && company.isEmpty()) {
            company = "FitServis";
        }
        this.company = company;
    }

    public MechanicSkills getMechanicSkills() {
        return mechanicSkills;
    }
    public void performMaintenance(Transport transport) {
        System.out.println("Механик " + getName() + " из компании '" + getCompany() + "' проводит тех облуживания "
                + transport.getBrand()+ " " + transport.getModel());
    }
    public void fixCar(Transport transport) {
        System.out.println("Механик " + getName() + " c компании '" + getCompany() + "' имеет категорию "
                + getMechanicSkills() + " производит ремонт " + transport.getModel() + transport.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && mechanicSkills == mechanic.mechanicSkills;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, mechanicSkills);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", mechanicSkills=" + mechanicSkills +
                '}';
    }
}
