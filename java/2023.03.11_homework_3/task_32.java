import java.util.ArrayList;
import java.util.Arrays;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task_32 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList (23, 4, 2, 65, 3, 4, 7, 5, 1, 2, 65, 3, 45, 56, 32, 2, 18));
        System.out.println(list);
        for (int index = list.size() - 1; index >= 0; index--) {
            if (list.get(index)%2==0){
                list.remove(index);
            }

        }
        System.out.println(list);

    }

}
