import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task_1 {
    static int sum(int a) {

        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        return result;

    } 

    static long factorial(int a) {
        long result;

        if (a == 0)
            return 1;
        result = a * factorial(a - 1);
        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Integer.parseInt(scan.nextLine());
        System.out.printf("Triangular sum is: %d\n", sum(number));
        System.out.printf("Factorial is: %d\n", factorial(number));

        scan.close();

    }
}
