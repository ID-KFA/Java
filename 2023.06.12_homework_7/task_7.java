
// Необходимо написать проект, для розыгрыша в магазине игрушек. Функционал
// должен содержать добавление новых игрушек и задания веса для выпадения
// игрушек.
// Как сдавать проект
// Для сдачи проекта необходимо создать отдельный общедоступный
// репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
// репозитории, использовать пул реквесты на изменения. Программа должна
// запускаться и работать, ошибок при выполнении программы быть не должно.
// Программа, может использоваться в различных системах, поэтому необходимо
// разработать класс в виде конструктора
// Задание
// 1) Напишите класс-конструктор у которого принимает минимум 3 строки,
// содержащие три поля id игрушки, текстовое название и частоту выпадения
// игрушки
// 2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
// массива.
// 3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
// коллекцию
// 4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в
// файл
// Подсказка:
// В метод put передаете последовательно несколько строк
// 1 2 конструктор;
// 2 2 робот;
// 3 6 кукла.
// Метод Get должен случайно вернуть либо “2”, либо “3” и соответствии с весом.
// В 20% случаях выходит единица
// В 20% двойка
// И в 60% тройка.
// Критерии оценки
// Приложение должно запускаться, записывать значения в файл.

import java.util.*;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class task_7 {

    public static void main(String[] args) {

        Toy Toy1 = new Toy();
        Toy1.id = 1;
        Toy1.frequency = 2;
        Toy1.name = "Bear";

        Toy Toy2 = new Toy();
        Toy2.id = 2;
        Toy2.frequency = 2;
        Toy2.name = "Fox";

        Toy Toy3 = new Toy();
        Toy3.id = 3;
        Toy3.frequency = 2;
        Toy3.name = "Cat";

        HashSet<Toy> toys = new HashSet<Toy>();
        toys.add(Toy1);
        toys.add(Toy2);
        toys.add(Toy3);
        menu(toys);

    }

    public static void menu(HashSet<Toy> toys) {

        while (true) {
            System.out.println();
            System.out.println("Press '1' - to start the raffle");
            System.out.println("Press '2' - to add the toy");
            System.out.println("Press '0' - to exit");

            Scanner scan = new Scanner(System.in);
            char operation = scan.nextLine().charAt(0);

            if (operation == '0')
                System.exit(0);

            else if (operation == '2') {
                System.out.println("Enter Id: ");
                int id = Integer.parseInt(scan.nextLine());
                for (Toy entry : toys) {
                    if (entry.getID() == id) {
                        System.out.println("This Id is taken");
                        menu(toys);
                    }
                }

                System.out.println("Enter the proportion: ");
                int frequency = Integer.parseInt(scan.nextLine());
                System.out.println("Enter the toy name: ");
                String name = scan.nextLine();
                Toy toy = new Toy();
                toy.id = id;
                toy.frequency = frequency;
                toy.name = name;
                toys.add(toy);
            }

            else if (operation == '1') {
                ArrayList<Integer> array = new ArrayList();

                for (Toy entry : toys) {
                    for (int i = 0; i < entry.getFrequency(); i++) {
                        array.add(entry.getID());
                    }
                }

                PriorityQueue<String> prizes = new PriorityQueue();

                int min = 0;
                int max = array.size();
                int maxprize = 10;

                for (int i = 0; i < maxprize; i++) {
                    int r = new Random().nextInt(max - min) + min;

                    for (Toy entry : toys) {
                        if (entry.getID() == array.get(r))
                            prizes.add(entry.getName());
                    }

                }
                

                try {
                    FileWriter fw = new FileWriter("Java/2023.06.12_homework_7/prize.txt", false);
                    while (!prizes.isEmpty()) {

                        fw.write(prizes.remove());
                        fw.write('\n');
                        fw.flush();
                        
                    }

                    fw.close();
                    System.out.println("File saved");

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }

        }

    }
}
