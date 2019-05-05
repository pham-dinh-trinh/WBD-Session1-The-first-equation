import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a : ");
        double a = scanner.nextDouble();
        System.out.println("Input b : ");
        double b = scanner.nextDouble();
        System.out.println("Input c : ");
        double c = scanner.nextDouble();
        if (a != 0){
            double solution = -b/a;
            System.out.printf("The solution is : %f!", solution);
        }
        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
