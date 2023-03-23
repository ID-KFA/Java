import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class task_53 {
        public static void main(String[] args) {

                ArrayList<Object> board = new ArrayList<Object>(
                                Arrays.asList("a 1", "a 2", "a 3", "a 4", "a 5", "a 6", "a 7", "a 8",
                                                "b 1", "b 2", "b 3", "b 4", "b 5", "b 6", "b 7", "b 8",
                                                "c 1", "c 2", "c 3", "c 4", "c 5", "c 6", "c 7", "c 8",
                                                "d 1", "d 2", "d 3", "d 4", "d 5", "d 6", "d 7", "d 8",
                                                "e 1", "e 2", "e 3", "e 4", "e 5", "e 6", "e 7", "e 8",
                                                "f 1", "f 2", "f 3", "f 4", "f 5", "f 6", "f 7", "f 8",
                                                "g 1", "g 2", "g 3", "g 4", "g 5", "g 6", "g 7", "g 8",
                                                "h 1", "h 2", "h 3", "h 4", "h 5", "h 6", "h 7", "h 8"));

                ArrayList<String> row_a = new ArrayList<String>(
                                Arrays.asList("a 1", "a 2", "a 3", "a 4", "a 5", "a 6", "a 7", "a 8"));
                ArrayList<String> row_b = new ArrayList<String>(
                                Arrays.asList("b 1", "b 2", "b 3", "b 4", "b 5", "b 6", "b 7", "b 8"));
                ArrayList<String> row_c = new ArrayList<String>(
                                Arrays.asList("c 1", "c 2", "c 3", "c 4", "c 5", "c 6", "c 7", "c 8"));
                ArrayList<String> row_d = new ArrayList<String>(
                                Arrays.asList("d 1", "d 2", "d 3", "d 4", "d 5", "d 6", "d 7", "d 8"));
                ArrayList<String> row_e = new ArrayList<String>(
                                Arrays.asList("e 1", "e 2", "e 3", "e 4", "e 5", "e 6", "e 7", "e 8"));
                ArrayList<String> row_f = new ArrayList<String>(
                                Arrays.asList("f 1", "f 2", "f 3", "f 4", "f 5", "f 6", "f 7", "f 8"));
                ArrayList<String> row_g = new ArrayList<String>(
                                Arrays.asList("g 1", "g 2", "g 3", "g 4", "g 5", "g 6", "g 7", "g 8"));
                ArrayList<String> row_h = new ArrayList<String>(
                                Arrays.asList("h 1", "h 2", "h 3", "h 4", "h 5", "h 6", "h 7", "h 8"));

                ArrayList<String> line_1 = new ArrayList<String>(
                                Arrays.asList("a 1", "b 1", "c 1", "d 1", "e 1", "f 1", "g 1", "h 1"));
                ArrayList<String> line_2 = new ArrayList<String>(
                                Arrays.asList("a 2", "b 2", "c 2", "d 2", "e 2", "f 2", "g 2", "h 2"));
                ArrayList<String> line_3 = new ArrayList<String>(
                                Arrays.asList("a 3", "b 3", "c 3", "d 3", "e 3", "f 3", "g 3", "h 3"));
                ArrayList<String> line_4 = new ArrayList<String>(
                                Arrays.asList("a 4", "b 4", "c 4", "d 4", "e 4", "f 4", "g 4", "h 4"));
                ArrayList<String> line_5 = new ArrayList<String>(
                                Arrays.asList("a 5", "b 5", "c 5", "d 5", "e 5", "f 5", "g 5", "h 5"));
                ArrayList<String> line_6 = new ArrayList<String>(
                                Arrays.asList("a 6", "b 6", "c 6", "d 6", "e 6", "f 6", "g 6", "h 6"));
                ArrayList<String> line_7 = new ArrayList<String>(
                                Arrays.asList("a 7", "b 7", "c 7", "d 7", "e 7", "f 7", "g 7", "h 7"));
                ArrayList<String> line_8 = new ArrayList<String>(
                                Arrays.asList("a 8", "b 8", "c 8", "d 8", "e 8", "f 8", "g 8", "h 8"));

                ArrayList<String> mdiag_1 = new ArrayList<String>(Arrays.asList("h 1"));
                ArrayList<String> mdiag_2 = new ArrayList<String>(Arrays.asList("g 1", "h 2"));
                ArrayList<String> mdiag_3 = new ArrayList<String>(Arrays.asList("f 1", "g 2", "h 3"));
                ArrayList<String> mdiag_4 = new ArrayList<String>(Arrays.asList("e 1", "f 2", "g 3", "h 4"));
                ArrayList<String> mdiag_5 = new ArrayList<String>(Arrays.asList("d 1", "e 2", "f 3", "g 4", "h 5"));
                ArrayList<String> mdiag_6 = new ArrayList<String>(
                                Arrays.asList("c 1", "d 2", "e 3", "f 4", "g 5", "h 6"));
                ArrayList<String> mdiag_7 = new ArrayList<String>(
                                Arrays.asList("b 1", "c 2", "d 3", "e 4", "f 5", "g 6", "h 7"));
                ArrayList<String> mdiag_8 = new ArrayList<String>(
                                Arrays.asList("a 1", "b 2", "c 3", "d 4", "e 5", "f 6", "g 7", "h 8"));
                ArrayList<String> mdiag_9 = new ArrayList<String>(
                                Arrays.asList("a 2", "b 3", "c 4", "d 5", "e 6", "f 7", "g 8"));
                ArrayList<String> mdiag_10 = new ArrayList<String>(
                                Arrays.asList("a 3", "b 4", "c 5", "d 6", "e 7", "f 8"));
                ArrayList<String> mdiag_11 = new ArrayList<String>(Arrays.asList("a 4", "b 5", "c 6", "d 7", "e 8"));
                ArrayList<String> mdiag_12 = new ArrayList<String>(Arrays.asList("a 5", "b 6", "c 7", "d 8"));
                ArrayList<String> mdiag_13 = new ArrayList<String>(Arrays.asList("a 6", "b 7", "c 8"));
                ArrayList<String> mdiag_14 = new ArrayList<String>(Arrays.asList("a 7", "b 8"));
                ArrayList<String> mdiag_15 = new ArrayList<String>(Arrays.asList("a 8"));

                ArrayList<String> rdiag_1 = new ArrayList<String>(Arrays.asList("a 1"));
                ArrayList<String> rdiag_2 = new ArrayList<String>(Arrays.asList("a 2", "b 1"));
                ArrayList<String> rdiag_3 = new ArrayList<String>(Arrays.asList("a 3", "b 2", "c 1"));
                ArrayList<String> rdiag_4 = new ArrayList<String>(Arrays.asList("a 4", "b 3", "c 2", "d 1"));
                ArrayList<String> rdiag_5 = new ArrayList<String>(Arrays.asList("a 5", "b 4", "c 3", "d 2", "e 1"));
                ArrayList<String> rdiag_6 = new ArrayList<String>(
                                Arrays.asList("a 6", "b 5", "c 4", "d 3", "e 2", "f 1"));
                ArrayList<String> rdiag_7 = new ArrayList<String>(
                                Arrays.asList("a 7", "b 6", "c 5", "d 4", "e 3", "f 2", "g 1"));
                ArrayList<String> rdiag_8 = new ArrayList<String>(
                                Arrays.asList("a 8", "b 7", "c 6", "d 5", "e 4", "f 3", "g 2", "h 1"));
                ArrayList<String> rdiag_9 = new ArrayList<String>(
                                Arrays.asList("b 8", "c 7", "d 6", "e 5", "f 4", "g 3", "h 2"));
                ArrayList<String> rdiag_10 = new ArrayList<String>(
                                Arrays.asList("c 8", "d 7", "e 6", "f 5", "g 4", "h 3"));
                ArrayList<String> rdiag_11 = new ArrayList<String>(Arrays.asList("d 8", "e 7", "f 6", "g 5", "h 4"));
                ArrayList<String> rdiag_12 = new ArrayList<String>(Arrays.asList("e 8", "f 7", "g 6", "h 5"));
                ArrayList<String> rdiag_13 = new ArrayList<String>(Arrays.asList("f 8", "g 7", "h 6"));
                ArrayList<String> rdiag_14 = new ArrayList<String>(Arrays.asList("g 8", "h 7"));
                ArrayList<String> rdiag_15 = new ArrayList<String>(Arrays.asList("h 8"));

                List<ArrayList<String>> all = new ArrayList();
                all.add(row_a);
                all.add(row_b);
                all.add(row_c);
                all.add(row_d);
                all.add(row_e);
                all.add(row_f);
                all.add(row_g);
                all.add(row_h);
                all.add(line_1);
                all.add(line_2);
                all.add(line_3);
                all.add(line_4);
                all.add(line_5);
                all.add(line_6);
                all.add(line_7);
                all.add(line_8);
                all.add(mdiag_1);
                all.add(mdiag_2);
                all.add(mdiag_3);
                all.add(mdiag_4);
                all.add(mdiag_5);
                all.add(mdiag_6);
                all.add(mdiag_7);
                all.add(mdiag_8);
                all.add(mdiag_9);
                all.add(mdiag_10);
                all.add(mdiag_11);
                all.add(mdiag_12);
                all.add(mdiag_13);
                all.add(mdiag_14);
                all.add(mdiag_15);

                all.add(rdiag_1);
                all.add(rdiag_2);
                all.add(rdiag_3);
                all.add(rdiag_4);
                all.add(rdiag_5);
                all.add(rdiag_6);
                all.add(rdiag_7);
                all.add(rdiag_8);
                all.add(rdiag_9);
                all.add(rdiag_10);
                all.add(rdiag_11);
                all.add(rdiag_12);
                all.add(rdiag_13);
                all.add(rdiag_14);
                all.add(rdiag_15);

                ArrayList possible = (ArrayList) board.clone();

                for (int i = 0; i < board.size(); i++) {
                        String queen = board.get(i).toString();
                        queens(queen, possible, all);
                        if (queencount(possible) == 8)
                                printboard(possible);

                        possible = (ArrayList) board.clone();
                }

        }

        public static Integer queencount(ArrayList<String> board) {
                int j = 0;
                for (int index = 0; index < board.size(); index++) {
                        if (board.get(index).equals("[Q]"))
                                j++;

                }
                return j;

        }

        public static void printboard(ArrayList<String> board) {
                int j = 1;
                for (int index = 0; index < board.size(); index++) {
                        if (!(board.get(index).equals("[x]") || board.get(index).equals("[Q]")))
                                System.out.print("[ ]");

                        else
                                System.out.print(board.get(index));
                        j++;
                        if (j == 9) {
                                System.out.println();
                                j = 1;
                        }

                }

        }

        public static void queens(String place, ArrayList<String> board, List<ArrayList<String>> variants) {
                String queen = "";

                board.set(board.indexOf(place), "[Q]");

                for (int index = 0; index < variants.size(); index++) {

                        for (int i = 0; i < variants.get(index).size(); i++) {

                                if (variants.get(index).get(i).equals(place)) {

                                        for (int j = 0; j < board.size(); j++) {
                                                for (int k = 0; k < variants.get(index).size(); k++) {
                                                        if (board.get(j).equals(variants.get(index).get(k))) {
                                                                board.set(j, "[ ]");
                                                        }
                                                }
                                        }
                                }
                        }

                }

                for (int ind = 0; ind < board.size(); ind++) {
                        if (!(board.get(ind).equals("[ ]") || board.get(ind).equals("[Q]"))) {
                                queen = board.get(ind).toString();

                                board.set(ind, "[Q]");

                                for (int index = 0; index < variants.size(); index++) {

                                        for (int i = 0; i < variants.get(index).size(); i++) {

                                                if (variants.get(index).get(i).equals(queen)) {

                                                        for (int j = 0; j < board.size(); j++) {
                                                                for (int k = 0; k < variants.get(index)
                                                                                .size(); k++) {
                                                                        if (board.get(j).equals(variants
                                                                                        .get(index)
                                                                                        .get(k))) {
                                                                                board.set(j, "[ ]");
                                                                        }
                                                                }

                                                        }
                                                }

                                        }

                                }

                        }
                }

        }

}