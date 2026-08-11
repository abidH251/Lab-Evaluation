class HourlyEmployee extends Employee {
    double hours;
    double rate;

    HourlyEmployee(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double computeSalary() {
        return hours * rate;
    }
}