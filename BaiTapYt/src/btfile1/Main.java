package btfile1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filename = "src/btfile1/ds.txt";
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] s = line.split("\\s");
                for (String i : s) {
                    list.add(Integer.parseInt(i));
                }
                boolean c1 = true;
                int i = 0;
                for (; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        c1 = false;
                        break;
                    }
                }
                if (c1) {
                    System.out.println("Day tang");
                    list.clear();
                } else {
                    boolean c2 = true;
                    for (int j = 0; j < list.size() - 1; j++) {
                        if (list.get(j) < list.get(j + 1)) {
                            c2 = false;
                            break;
                        }
                    }
                    if (c2) {
                        System.out.println("Day giam");
                        list.clear();
                    } else {
                        System.out.println("Day lon xon");
                        list.clear();
                    }
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
