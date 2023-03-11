
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
        float result = 0;
        float number_1 = 0;
        float number_2 = 0;
        try {
            Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");

       
      
        number_1 = Float.parseFloat(scan.nextLine());
        
        System.out.print("Enter operation + - / *: ");
        char operation = scan.nextLine().charAt(0);

        System.out.print("Enter the second number: ");
        
        number_2 = Float.parseFloat(scan.nextLine());
        
        scan.close();

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


        }catch (Exception e) {
            System.out.println("Wrong input!");
            System.exit(0);
            
        }
        
    }

}
