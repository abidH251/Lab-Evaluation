import java.util.*;
 
public class Main 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String department = sc.next();
            double salary = sc.nextDouble();

            list.add(new Employee(name, department, salary));
        }

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.name + " - " + e.department + " - " + e.salary);
        }

    }
}