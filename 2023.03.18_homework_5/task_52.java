// // Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.


import java.util.*;
import java.util.TreeMap;

import java.util.ArrayList;
import java.util.Arrays;


public class task_52 {

    public static void main(String[] args) {
        int count = 1;

        ArrayList<String> fullnames = new ArrayList<String>(
                Arrays.asList("Ivan Ivanov", "Svetlana Petrova", "Kristina Belova", "Anna Musina",
                        "Anna Krutova", "Ivan Jurin", "Pyotr Lykov", "Pavel Chernov", "Pyotr Chernyshov",
                        "Maria Fedorova", "Marina Svetlova", "Maria Savina", "Maria Rykova",
                        "Marina Lugova", "Anna Vladimirova", "Ivan Mechnikov", "Pyotr Petin", "Ivan Ezhov"));

        Map<String, Integer> names = new TreeMap<String, Integer>();
        LinkedHashMap<String, Integer> sortednames = new LinkedHashMap<String, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int index = 0; index < fullnames.size(); index++) {
            String[] name = fullnames.get(index).split(" ");

            if (names.containsKey(name[0])) {
                count = names.get(name[0]) + 1;
                names.put(name[0], count);
            } else
                names.put(name[0], 1);

        }
        for (Map.Entry<String, Integer> entry : names.entrySet())
            list.add(entry.getValue());
        Collections.sort(list, Collections.reverseOrder());
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : names.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortednames.put(entry.getKey(), num);
                }
        
            }
        }

        for (Map.Entry<String, Integer> entry : sortednames.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}
