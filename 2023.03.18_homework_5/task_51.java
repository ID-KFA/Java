import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class task_51 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Press '1' to input name");
            System.out.println("Press '2' to show phonebook");
            System.out.println("Press '3' to quit");

            char menu = scan.nextLine().charAt(0);
            if (menu == '1') {
                System.out.println("Input name: ");
                String name = scan.nextLine();

                System.out.println("Input phone: ");
                String phone = scan.nextLine();
                if (phonebook.containsKey(name)) {
                    String ph = phonebook.get(name) + ", " + phone;
                    phonebook.put(name, ph);
                } else
                    phonebook.put(name, phone);
            } else if (menu == '2') {
                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            } else if (menu == '3')
                break;
        }
    }

}
