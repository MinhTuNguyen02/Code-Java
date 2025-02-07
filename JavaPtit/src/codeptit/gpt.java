import java.util.*;

class HocSinh implements Comparable<HocSinh> {
    private String maHS;
    private String hoTen;
    private double diemTB;
    private String xepLoai;

    public HocSinh(String maHS, String hoTen, double diemTB, String xepLoai) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.xepLoai = xepLoai;
    }

    public String getMaHS() {
        return maHS;
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public int compareTo(HocSinh other) {
        if (this.diemTB != other.diemTB) {
            return Double.compare(other.diemTB, this.diemTB); // So sánh điểm TB giảm dần
        }
        return this.maHS.compareTo(other.maHS); // Nếu điểm TB bằng nhau, so sánh mã học sinh
    }

    @Override
    public String toString() {
        return maHS + " " + hoTen + " " + String.format("%.1f", diemTB) + " " + xepLoai;
    }
}

public class gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soHocSinh = sc.nextInt();
        sc.nextLine();  

        List<HocSinh> dsHocSinh = new ArrayList<>();
        for (int i = 1; i <= soHocSinh; i++) {
            String hoTen = sc.nextLine();
            String[] diemStr = sc.nextLine().split("\\s");
            double[] diem = new double[10];
            for (int j = 0; j < 10; j++) {
                diem[j] = Double.parseDouble(diemStr[j]);
            }

            // Tính điểm trung bình
            double diemTB = (2 * diem[0] + 2 * diem[1] + diem[2] + diem[3] + diem[4] + diem[5] +
                             diem[6] + diem[7] + diem[8] + diem[9]) / 12.0;

            // Xếp loại
            String xepLoai;
            if (diemTB >= 9) {
                xepLoai = "XUAT SAC";
            } else if (diemTB >= 8) {
                xepLoai = "GIOI";
            } else if (diemTB >= 7) {
                xepLoai = "KHA";
            } else if (diemTB >= 5) {
                xepLoai = "TB";
            } else {
                xepLoai = "YEU";
            }

            // Tạo mã học sinh
            String maHS = "HS" + String.format("%02d", i);

            // Tạo đối tượng học sinh và thêm vào danh sách
            dsHocSinh.add(new HocSinh(maHS, hoTen, diemTB, xepLoai));
        }

        // Sắp xếp danh sách học sinh
        Collections.sort(dsHocSinh);

        // In kết quả
        for (HocSinh hs : dsHocSinh) {
            System.out.println(hs);
        }
    }
}
