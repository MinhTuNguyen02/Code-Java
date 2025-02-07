
package demo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        while(true){
            System.out.println("1.lua chon 1");
            System.out.println("2.lua chon 2");
            System.out.println("3.lua chon 3");
            System.out.println("4.lua chon 4");
            System.out.println("5.lua chon 5");
            System.out.println("6.Thoat");
            Scanner in = new Scanner(System.in);
            int luaChon;
            System.out.println("---------------------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = Integer.parseInt(in.nextLine());
            switch(luaChon){
                case 1:
                    System.out.println("ban da chon 1");
                    break;
                case 2:
                    System.out.println("ban da chon 2");
                    break;
                case 3:
                    System.out.println("ban da chon 3");
                    break;
                case 4:
                    System.out.println("ban da chon 4");
                    break;
                case 5:
                    System.out.println("ban da chon 5");
                    break;    
                case 6:
                    System.out.println("Tam biet!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chon tu 1 den 6");
            }
        }
    }
}
