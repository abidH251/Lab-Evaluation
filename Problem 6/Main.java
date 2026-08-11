import java.util.Scanner;
public class Main 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Rectangle r = new Rectangle(length, width);

        System.out.printf("Area: %.2f%n", r.area());
        System.out.printf("Perimeter: %.2f%n", r.perimeter());
    }
}