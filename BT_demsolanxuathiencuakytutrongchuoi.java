package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class BT_demsolanxuathiencuakytutrongchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ki : ");
        String str = scanner.nextLine();
        System.out.println(str.length());
        System.out.print("Nhap vao ky tu ma ban muon dem : ");
        String x =scanner.nextLine();
        int count=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==x.charAt(0)){
                count++;
            }
        }
        System.out.println("Ky tu \"" +x+ "\" xuat hien " +count+" lan trong mang");
    }
}
