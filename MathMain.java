import java.util.Scanner;

public class MathMain {

    public static void main(String[] args) {
        System.out.println("Enter a begin number: ");
        Scanner scanner = new Scanner((System.in));
        int begin = scanner.nextInt();
        System.out.println("Enter an end number: ");
        int end = scanner.nextInt();
        scanner.close();

        long sum = getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d : %,d%n ", begin, end, sum);
        long product = getProductBetween(begin,end);
        System.out.printf("Product between %d and %d : %,d%n ", begin, end, product);


        }
    public static long getSumBetween(int a, int b){
        long x = 0;
        while (a<=b) {
            x = x+a;
            a++;
        }
        return x;
    }
    public static long getProductBetween(int a, int b){
        long x = 1;
        while (a<=b) {
            x = x*a;
            a++;
        }
        return x;
    }


}
