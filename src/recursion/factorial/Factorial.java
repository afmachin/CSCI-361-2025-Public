package recursion.factorial;

public class Factorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static int factorialWithLoop(int n) {
        int answer = 1;
        for (int i = n; i > 0; i--) {
            answer = i * answer;
        }

        return answer;
    }
}
