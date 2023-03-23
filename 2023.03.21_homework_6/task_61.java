import java.util.*;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class task_61 {

    public static void main(String[] args) {
        Notebook Notebook1 = new Notebook();
        Notebook1.memory = 16;
        Notebook1.hdd = 160;
        Notebook1.OS = "Windows";
        Notebook1.color = "Red";

        Notebook Notebook2 = new Notebook();
        Notebook2.memory = 8;
        Notebook2.hdd = 120;
        Notebook2.OS = "Windows";
        Notebook2.color = "Black";

        Notebook Notebook3 = new Notebook();
        Notebook3.memory = 32;
        Notebook3.hdd = 500;
        Notebook3.OS = "MacOS";
        Notebook3.color = "White";

        Notebook Notebook4 = new Notebook();
        Notebook4.memory = 8;
        Notebook4.hdd = 120;
        Notebook4.OS = "Linux";
        Notebook4.color = "Black";

        Notebook Notebook5 = new Notebook();
        Notebook5.memory = 4;
        Notebook5.hdd = 100;
        Notebook5.OS = "Windows";
        Notebook5.color = "Black";

        Notebook Notebook6 = new Notebook();
        Notebook6.memory = 128;
        Notebook6.hdd = 1000;
        Notebook6.OS = "MacOS";
        Notebook6.color = "Gray";

        Notebook Notebook7 = new Notebook();
        Notebook7.memory = 2;
        Notebook7.hdd = 60;
        Notebook7.OS = "Windows";
        Notebook7.color = "Black";

        HashSet<Notebook> notebooks = new HashSet<Notebook>();
        notebooks.add(Notebook1);
        notebooks.add(Notebook2);
        notebooks.add(Notebook3);
        notebooks.add(Notebook4);
        notebooks.add(Notebook5);
        notebooks.add(Notebook6);
        notebooks.add(Notebook7);

        getinfo(notebooks);

    }

    public static void getinfo(HashSet<Notebook> notes) {

        while (true) {
            System.out.println();
            System.out.println("Choose notebook");
            System.out.println("Press '1' - to choose RAM");
            System.out.println("Press '2' - to choose HDD");
            System.out.println("Press '3' - to choose OS");
            System.out.println("Press '4' - to choose color");
            System.out.println("Press '0' - to exit");

            Scanner scan = new Scanner(System.in);
            char operation = scan.nextLine().charAt(0);

            if (operation == '0')
                System.exit(0);

            else if (operation == '1') {
                System.out.println("Choose minimal RAM: ");
                int minmemory = Integer.parseInt(scan.nextLine());
                System.out.println("Choose maximal RAM: ");
                int maxmemory = Integer.parseInt(scan.nextLine());

                for (Notebook entry : notes) {
                    if (entry.getMemory() >= minmemory && entry.getMemory() <= maxmemory)
                        System.out.println(entry.toString());

                }

            } else if (operation == '2') {
                System.out.println("Choose minimal HDD: ");
                int minmemory = Integer.parseInt(scan.nextLine());
                System.out.println("Choose maximal HDD: ");
                int maxmemory = Integer.parseInt(scan.nextLine());

                for (Notebook entry : notes) {
                    if (entry.getHDD() >= minmemory && entry.getHDD() <= maxmemory)
                        System.out.println(entry.toString());

                }

            } else if (operation == '3') {
                while (true) {
                    System.out.println();
                    System.out.println("Choose OS: ");
                    System.out.println("Press '1' for MacOS");
                    System.out.println("Press '2' for Windows");
                    System.out.println("Press '3' for Linux");
                    System.out.println("Press '4' for quit to main menu");

                    operation = scan.nextLine().charAt(0);

                    if (operation == '1') {
                        for (Notebook entry : notes) {
                            if (entry.getOS().equals("MacOS"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '2') {
                        for (Notebook entry : notes) {
                            if (entry.getOS().equals("Windows"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '3') {
                        for (Notebook entry : notes) {
                            if (entry.getOS().equals("Linux"))
                                System.out.println(entry.toString());
                        }
                    } else if (operation == '4')
                        break;

                }

            }

            else if (operation == '4') {
                while (true) {

                    System.out.println();
                    System.out.println("Choose color: ");
                    System.out.println("Press '1' for Black");
                    System.out.println("Press '2' for Gray");
                    System.out.println("Press '3' for White");
                    System.out.println("Press '4' for Red");
                    System.out.println("Press '5' for quit to main menu");

                    operation = scan.nextLine().charAt(0);

                    if (operation == '1') {
                        for (Notebook entry : notes) {
                            if (entry.getColor().equals("Black"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '2') {
                        for (Notebook entry : notes) {
                            if (entry.getColor().equals("Gray"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '3') {
                        for (Notebook entry : notes) {
                            if (entry.getColor().equals("White"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '4') {
                        for (Notebook entry : notes) {
                            if (entry.getColor().equals("Red"))
                                System.out.println(entry.toString());
                        }

                    }

                    else if (operation == '5')
                        break;
                }
            }
        }

    }
}
