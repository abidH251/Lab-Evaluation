class Employee implements Comparable<Employee> 
{
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) 
    {

        int deptCompare = this.department.compareTo(other.department);

        if (deptCompare != 0) 
        {
            return deptCompare;
        }
        return Double.compare(other.salary, this.salary);
    }
}