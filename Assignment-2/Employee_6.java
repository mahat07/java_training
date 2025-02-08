package com.celcom.javalabassignment;

class Employee_6 {
    private String name;
    private String jobTitle;
    private double salary;
    private double hra;
    private double ta;
    private double da;

    // Constructor
    public Employee_6(String name, String jobTitle, double salary, double hra, double ta, double da) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hra = hra;
        this.ta = ta;
        this.da = da;
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println(name + "'s salary updated successfully to " + newSalary);
        } else {
            System.out.println("Oops! That salary amount isn't valid.");
        }
    }

    // Method to calculate yearly bonus (10% of salary)
    public double calculateBonus() {
        return this.salary * 0.10;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Base Salary: $" + salary);
        System.out.println("HRA: $" + hra);
        System.out.println("TA: $" + ta);
        System.out.println("DA: $" + da);
        System.out.println("Total Compensation: $" + (salary + hra + ta + da));
    }

    public static void main(String[] args) {
        Employee_6 emp = new Employee_6("John Doe", "Software Engineer", 60000, 5000, 2000, 3000);
        emp.displayEmployeeInfo();
        
        System.out.println("\nAnnual Bonus for " + emp.name + ": $" + emp.calculateBonus());
        
        emp.updateSalary(65000);
        emp.displayEmployeeInfo();
    }
}
