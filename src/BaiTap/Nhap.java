package BaiTap;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        int n;
       Scanner sc = new Scanner(System.in);
       System.out.println(" nhap vao mot so ");
       n = sc.nextInt();
       if (n>=0) {
           System.out.println("day la so nguyen duong");
       }else {
           System.out.println("day la so nguyen am");
       }



    }
    
}
