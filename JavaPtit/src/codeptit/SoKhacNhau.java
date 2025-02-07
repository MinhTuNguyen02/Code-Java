package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SoKhacNhau {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file DATA1.in
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("src/codeptit/DATA1.in"));
            @SuppressWarnings("unchecked")
            ArrayList<Integer> data1 = (ArrayList<Integer>) ois1.readObject();
            ois1.close();

            // Đọc dữ liệu từ file DATA2.in
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("src/codeptit/DATA2.in"));
            @SuppressWarnings("unchecked")
            ArrayList<Integer> data2 = (ArrayList<Integer>) ois2.readObject();
            ois2.close();

            // HashMap để đếm số lần xuất hiện của các số trong mỗi file
            Map<Integer, Integer> primeCount1 = new HashMap<>();
            Map<Integer, Integer> primeCount2 = new HashMap<>();

            // Đếm số lần xuất hiện của các số nguyên tố trong file DATA1.in
            for (int num : data1) {
                if (isPrime(num)) {
                    primeCount1.put(num, primeCount1.getOrDefault(num, 0) + 1);
                }
            }

            // Đếm số lần xuất hiện của các số nguyên tố trong file DATA2.in
            for (int num : data2) {
                if (isPrime(num)) {
                    primeCount2.put(num, primeCount2.getOrDefault(num, 0) + 1);
                }
            }

            // Tập hợp kết quả là các số nguyên tố xuất hiện trong cả hai file
            Set<Integer> commonPrimes = new TreeSet<>(primeCount1.keySet());
            commonPrimes.retainAll(primeCount2.keySet()); // Lấy giao của hai tập số nguyên tố

            // In kết quả
            for (int prime : commonPrimes) {
                System.out.println(prime + " " + primeCount1.get(prime) + " " + primeCount2.get(prime));
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
