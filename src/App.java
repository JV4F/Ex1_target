import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInforme um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, temp = b;

        while (b < num) {
            temp = b;
            b = a + b;
            a = temp;
        }

        return b == num || num == 0; // 0 é o primeiro número de Fibonacci
    }
}
