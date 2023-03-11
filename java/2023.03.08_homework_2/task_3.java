// К калькулятору из предыдущего ДЗ добавить логирование

import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

public class task_3 {

    public static void main(String[] args) throws IOException {
        float result = 0;
        float number_1 = 0;
        float number_2 = 0;

        FileWriter fw = new FileWriter("Calc.txt", true);
        fw.write('\n');
        try{
            Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        number_1 = Float.parseFloat(scan.nextLine());
        fw.write(Float.toString(number_1));

        System.out.print("Enter operation + - / *: ");
        char operation = scan.nextLine().charAt(0);
        fw.write(operation);

        System.out.print("Enter the second number: ");

        number_2 = Float.parseFloat(scan.nextLine());
        fw.write(Float.toString(number_2));

        scan.close();

        if (operation == '+')
            result = number_1 + number_2;
        else if (operation == '-')
            result = number_1 - number_2;
        else if (operation == '*')
            result = number_1 * number_2;
        else if (operation == '/')
            result = number_1 / number_2;

        else {
            String error = " Wrong operation! ";
            System.out.println(error);
            fw.write(error);
        }

        System.out.printf("Result is: %f\n", result);
        fw.write(" = ");
        fw.write(Float.toString(result));

        
        }catch (Exception e) {
            String error = "Wrong input!";
            System.out.println(error);
            fw.write(error);

                       
        } finally{
            fw.flush();
            fw.close(); 
            System.exit(0);
        }

        
    }

}
