
package codeptit;

import java.util.Scanner;

public class MainChiaHet {
    
    // Hàm so sánh hai số lớn dưới dạng chuỗi
    public static int compareStrings(String a, String b) {
        if (a.length() > b.length()) return 1;
        if (a.length() < b.length()) return -1;
        return a.compareTo(b);
    }

    // Hàm trừ hai chuỗi số lớn
    public static String subtractStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int borrow = 0, diff;

        // Đảo chuỗi để xử lý từ hàng đơn vị
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        // Trừ từng chữ số
        for (int i = 0; i < b.length(); i++) {
            diff = (a.charAt(i) - '0') - (b.charAt(i) - '0') - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.append(diff);
        }

        // Trừ phần còn lại của a
        for (int i = b.length(); i < a.length(); i++) {
            diff = (a.charAt(i) - '0') - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.append(diff);
        }

        // Loại bỏ các số 0 ở đầu
        String res = result.reverse().toString().replaceAll("^0+", "");
        return res.isEmpty() ? "0" : res;
    }

    public static String modStrings(String a, String b) {
        String current = "";
        for (int i = 0; i < a.length(); i++) {
            current += a.charAt(i);
            current = current.replaceFirst("^0+(?!$)", "");  
            if (compareStrings(current, b) >= 0) {
                current = subtractStrings(current, b);
            }
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số lớn dưới dạng chuỗi
        System.out.print("Nhập số a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập số b: ");
        String b = scanner.nextLine();

        if (modStrings(a, b).equals("0")) {
            System.out.println("YES");
        } else if (modStrings(b, a).equals("0")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

