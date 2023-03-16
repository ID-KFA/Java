// 3. В калькулятор добавьте возможность отменить последнюю операцию. 
// ***Дополнительно*** каскадная отмена - отмена нескольких операций ***Дополнительно*** каскадная отмена - отмена нескольких операций
// Пример

// 1 
// + 
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3

import java.util.Scanner;
import java.util.Stack;

public class task_43 {

    public static void main(String[] args) {
        float result = 0;
        float number_1 = 0;
        float number_2 = 0;

        Scanner scan = new Scanner(System.in);
        Stack<Float> memory = new Stack();

        try {
            memory.push(result);
            System.out.print("Enter the first number: ");

            number_1 = Float.parseFloat(scan.nextLine());

            System.out.print("Enter operation (+ - / *): ");
            char operation = scan.nextLine().charAt(0);

            System.out.print("Enter the second number: ");

            number_2 = Float.parseFloat(scan.nextLine());

            if (operation == '+')
                result = number_1 + number_2;
            else if (operation == '-')
                result = number_1 - number_2;
            else if (operation == '*')
                result = number_1 * number_2;
            else if (operation == '/')

                result = number_1 / number_2;

            else
                System.out.println("Wrong operation!");

            System.out.printf("Result is: %f\n", result);
            memory.push(result);

            while (true) {
                System.out.print("Enter operation (+ - / *) or 'c' for Cancel or 'q' for Quit: ");
                operation = scan.nextLine().charAt(0);

                if (operation == 'q')
                    break;
                else if (operation == 'c') {
                    while (true) {
                        if (memory.isEmpty())
                            result = 0;
                        else
                            result = memory.pop();

                        System.out.printf("Result is: %f\n", result);
                        System.out.println("Result was:" + memory);
                        System.out.print("Enter 'c' for Cancel or 'q' for Quit this menu: ");
                        operation = scan.nextLine().charAt(0);

                        if (operation == 'q') {
                            System.out.print("Enter operation (+ - / *): ");
                            operation = scan.nextLine().charAt(0);

                            break;
                        }

                    }

                }
                

                System.out.print("Enter the second number: ");

                number_2 = Float.parseFloat(scan.nextLine());

                if (operation == '+')
                    result += number_2;

                else if (operation == '-')
                    result -= number_2;

                else if (operation == '*')
                    result *= number_2;

                else if (operation == '/')
                    result /= number_2;

                else if (operation == 'q')
                    System.exit(0);

                else
                    System.out.println("Wrong operation!");

                System.out.printf("Result is: %f\n", result);
                memory.push(result);
                System.out.println("Result was:" + memory);

            }

        } catch (Exception e) {
            System.out.println("Quit");
            System.exit(0);

        }

    }

}
