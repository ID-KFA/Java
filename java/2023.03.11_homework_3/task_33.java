
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_33 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(
                Arrays.asList(23, 4, 2, 65, 3, 4, 7, 5, 1, 2, 65, 3, 45, 56, 32, 2, 18));
        int sum = 0;
        float size = list.size();

        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        float average = sum / size;

        System.out.println("List is: "+list);
        System.out.println("Min number is: "+Collections.min(list));
        System.out.println("Max number is: "+Collections.max(list));
        System.out.printf("Average is: %f \n", average);

    }

}
