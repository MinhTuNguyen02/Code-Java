import java.io.*;
import java.util.*;

public class MainTK2 {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file nhị phân DATA.in
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/codeptit/TAM.in"));
            @SuppressWarnings("unchecked")
            ArrayList<String> data = (ArrayList<String>) ois.readObject();
            ois.close();

            // Khởi tạo một HashMap để đếm số lần xuất hiện của từng từ
            Map<String, Integer> wordCount = new HashMap<>();

            // Duyệt qua từng dòng trong ArrayList<String>
            for (String line : data) {
                // Loại bỏ dấu câu và chuyển tất cả về chữ thường
                String cleanedLine = line.toLowerCase().replaceAll("[.,!?;:/()\\-]", " ");
                
                // Tách các từ và đếm số lần xuất hiện
                String[] words = cleanedLine.trim().split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Chuyển HashMap thành danh sách để sắp xếp
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());
            
            // Sắp xếp theo số lần xuất hiện giảm dần, nếu bằng nhau thì theo thứ tự từ điển
            Collections.sort(wordList, (entry1, entry2) -> {
                if (entry2.getValue().equals(entry1.getValue())) {
                    return entry1.getKey().compareTo(entry2.getKey()); // Theo thứ tự từ điển tăng dần
                }
                return entry2.getValue() - entry1.getValue(); // Số lần xuất hiện giảm dần
            });

            // In ra kết quả
            for (Map.Entry<String, Integer> entry : wordList) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
