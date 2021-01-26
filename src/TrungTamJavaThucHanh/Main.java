package TrungTamJavaThucHanh;

import java.util.Scanner;

import TrungtamJava.NhanVien;

public class Main {
     public static void main(String[] args) {
         int[] mang = new int[5];
        NhanVien[] nhanViens = new NhanVien[3];
        Scanner scan = new Scanner(System.in);
        System.out.println(" Vui long nhap gia tri ");
        for (int i = 0 ; i < nhanViens.length ; i++){
            String ten = scan.nextLine();
            String diaChi = scan.nextLine();
            int tuoi = scan.nextInt();
             nhanViens[i] = new NhanVien( ten , diaChi , tuoi );
             // XOA BO NHO DEM CUA BAN PHIM 
             scan.nextLine();
        }
        for (NhanVien nv : nhanViens){
            System.out.println(nv.ten + " " + nv.getTuoi() + " " + nv.getDiaChi());
        }
        

    }
    
}
