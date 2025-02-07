
package codeptit;

import java.util.Scanner;


public class Hieu1 {
    public static int soSanh(String a, String b) {
        if (a.length() > b.length()){
            return 1;
        }
        if (a.length() < b.length()){
            return -1;
        }
        return a.compareTo(b);
    }
    
    public static String Dao(String s){
        String rs="";
        for (int i = s.length()-1; i >=0; i--) {
            rs += s.substring(i, i+1);
        }
        return rs;
    }
    
    public static String subtractString(String x, String y){
        String rs="";
        int muon=0, kq; 
        String a=Dao(x);
        String b=Dao(y);
        
        for (int i = 0; i < b.length(); i++) {
            kq = (a.charAt(i)-'0') - (b.charAt(i)-'0') - muon;
            if(kq<0){
                kq+=10;
                muon=1;
            }else{
                muon=0;
            }
            rs += String.valueOf(kq);
        }
        
        for (int i = b.length(); i < a.length(); i++) {
            kq = (a.charAt(i)-'0') - muon;
            if(kq<0){
                kq+=10;
                muon=1;
            }else{
                muon=0;
            }
            rs += String.valueOf(kq);
        }
        String ans=Dao(rs);
//        if(muon==1){
//            ans = "1"+Dao(rs);
//        }else{
//            ans = Dao(rs);
//        }
        return ans;
    }
    
    public static String subtract(String X, String Y) {
        if (soSanh(X, Y) >= 0) {
            return subtractString(X, Y); 
        } else {
            return subtractString(Y, X); 
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(Integer.parseInt(subtract(s1,s2)));
        }
    }
}
