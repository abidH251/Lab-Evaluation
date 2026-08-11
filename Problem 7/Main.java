import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();

            if (type.equals("SALARIED")) {

                double salary = sc.nextDouble();

                list.add(new SalariedEmployee(name, salary));

            } else if (type.equals("HOURLY")) {

                double hours = sc.nextDouble();
                double rate = sc.nextDouble();

                list.add(new HourlyEmployee(name, hours, rate));
            }
        }

        Collections.sort(list);

        for (Employee e : list) {

            if (e instanceof SalariedEmployee) {
                System.out.printf("SALARIED %s %.2f%n",
                        e.name, e.computeSalary());

            } else {
                System.out.printf("HOURLY %s %.2f%n",
                        e.name, e.computeSalary());
            }
        }
    }
}