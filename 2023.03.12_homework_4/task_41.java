// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Arrays;

public class task_41 {

    public static Object reverse(LinkedList<Object> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            list.add(list.size() - i, list.get(0));
            list.remove();
        }
        return list;
    }

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<Object>(
                Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));

        System.out.println(list);
        System.out.println(reverse(list));

    }

}
