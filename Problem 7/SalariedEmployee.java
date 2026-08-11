class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double computeSalary() {
        return salary;
    }
}
