/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nguye
 */
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set hs=new HashSet();
        String tmp=sc.next();
        for (int i = 0; i < tmp.length(); i++) {
            hs.add(tmp.charAt(i));
        }
        System.out.println(hs.size());
    }
}
