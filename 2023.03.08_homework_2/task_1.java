import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;


public class task_1 {

    public static void main(String[] args) {
        int[] list = new int[] { 3, 7, 2, 2, 623, 12, 6, 7, 8, 3, 1 };
        String s = " ";

        try {
            FileWriter fw = new FileWriter("log.txt", false); 
            
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < (list.length) - 1; j++) {
                    if (list[j] > list[j + 1]) {
                        int t = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = t;
                        s = Arrays.toString(list);
                        System.out.println(s);
                        fw.write(s);
                        fw.write('\n');
                        fw.flush();
                        

                    }

                }

            }
            fw.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
