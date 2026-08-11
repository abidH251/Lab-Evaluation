abstract class Employee implements Comparable<Employee> 
{
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double computeSalary();

    public int compareTo(Employee e) {
        return Double.compare(e.computeSalary(), this.computeSalary());
    }
}
