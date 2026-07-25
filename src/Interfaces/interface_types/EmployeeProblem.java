package Interfaces.interface_types;

abstract class AbstractEmployee {

    abstract void calculateSalary();

    void companyName() {
        System.out.println("Company Name: ABC Technologies");
    }
}

class Developer extends AbstractEmployee {

    void calculateSalary() {
        System.out.println("Developer Salary: Rs. 50,000");
    }
}

class Manager extends AbstractEmployee {

    void calculateSalary() {
        System.out.println("Manager Salary: Rs. 80,000");
    }
}

public class EmployeeProblem {

    public static void main(String[] args) {

        AbstractEmployee e;

        e = new Developer();
        e.companyName();
        e.calculateSalary();

        System.out.println();

        e = new Manager();
        e.companyName();
        e.calculateSalary();
    }
}