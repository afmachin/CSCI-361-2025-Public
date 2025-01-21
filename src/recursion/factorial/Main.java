package recursion.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        System.out.println("Loop implementation: " + Factorial.factorialWithLoop(n));
        System.out.println("Recursive implementation: " + Factorial.factorial(n));
    }
}
