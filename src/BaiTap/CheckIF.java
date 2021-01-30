package BaiTap;

import java.util.Scanner;



public class CheckIF {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
         System.out.println("Nhap vao chuoi ho ten can kiem tra: ");
         var name = Scanner.nextLine();
         // kiem tra va in ra ket luan
         if(name.matches("^[a-zA-Z0-10\\s]+$")) {
             System.out.println("HOP LE");
         }else{
             System.out.println("KHONG HOP LE");
         }

    }
    
}
