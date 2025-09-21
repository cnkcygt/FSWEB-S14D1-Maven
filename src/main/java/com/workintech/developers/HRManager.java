package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] JuniorDevelopers;
    private MidDeveloper[] MidDevelopers;
    private SeniorDeveloper[] SeniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(80000);
    }

    public void addEmployee(int index, JuniorDeveloper employee) {
        System.out.println("Junior çalıştı");
        if (JuniorDevelopers.length > index) {
            if (JuniorDevelopers[index] == null) JuniorDevelopers[index] = employee;
            else System.out.println("Index for the JuniorDeveloper Array is not empty.");
        } else System.out.println("There is not enough space in the JuniorDeveloper Array.");
    }

    public void addEmployee(int index, MidDeveloper employee) {
        System.out.println("Mid çalıştı");
        if (MidDevelopers.length > index) {
            if (MidDevelopers[index] == null) MidDevelopers[index] = employee;
            else System.out.println("Index for the MidDeveloper Array is not empty.");
        } else System.out.println("There is not enough space in the MidDeveloper Array.");
    }

    public void addEmployee(int index, SeniorDeveloper employee) {
        System.out.println("Senior çalıştı");
        if (SeniorDevelopers.length > index) {
            if (SeniorDevelopers[index] == null) SeniorDevelopers[index] = employee;
            else System.out.println("Index for the SeniorDeveloper Array is not empty.");
        } else System.out.println("There is not enough space in the SeniorDeveloper Array.");
    }
}
