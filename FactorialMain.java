
import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner((System.in));

        int Num1 = scanner.nextInt();
        for(int i = 1; i<=Num1; i++){
            long x = getFactorial(i);
            System.out.println("Factorial of "+i+"="+x);
        }

    }
    public static long getFactorial(final int n){
        long x = 1;
        for(int i = 1; i<=n; i++){
            x = x * i;
        }
        return x;
    }

}
