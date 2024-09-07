/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeperson;

/**
 *
 * @author hp
 */
public class EmployeePerson {
    private String name;
    private int id;
    private double salary;
    private String designation;

    
    public EmployeePerson() {
        this.name = "Babun";
        this.id = 101;
        this.salary = 60000.0;
        this.designation = "Manager";
    }

    
    public EmployeePerson(String name, int id) {
        this(); 
        this.name = name;
        this.id = id;
    }

    
    public EmployeePerson(String name, int id, double salary, String designation) {
        this(name, id); 
        this.salary = salary;
        this.designation = designation;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }

    
    public void promote() {
        this.salary *= 1.1; 
        System.out.println("Promoted! Updated salary: " + this.salary);
    }

    
    public void promote(double percentage) {
        this.salary *= (1 + percentage / 100);
        System.out.println("Promoted! Upadated salary: " + this.salary);
    }

    public static void main(String[] args) {
        EmployeePerson employee1 = new EmployeePerson();
        employee1.displayInfo();

        EmployeePerson employee2 = new EmployeePerson("Babun", 101);
        employee2.displayInfo();

        EmployeePerson employee3 = new EmployeePerson("Taqi", 102, 55000.0, "Designer");
        employee3.displayInfo();

        employee1.promote();
        employee2.promote(20);
    }
}
