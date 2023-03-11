// Вывести все простые числа от 1 до 1000

public class task_2 {

    public static void main(String[] args) {
        int k = 0;

        for (int i = 2; i <= 1000; i++) {

            k = 0;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    k++;
                    break;
                }

            }
            if (k == 0)
                System.out.println(i);

        }

    }
}
