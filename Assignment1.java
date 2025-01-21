import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        int multiplication = num1 * num2;
        
        System.out.println("The sum is: " + sum);
        System.out.println("The multiplication is: " + multiplication);
        scanner.close();
    }
}
