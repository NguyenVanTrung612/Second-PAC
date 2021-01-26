package TrungtamJava;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args){
        int[] mang = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println(" Vui long nhap vao gia tri cua mang ");
        for ( int i =0; i < mang.length ; i++){
            mang[i] = scan.nextInt();
        }
        System.out.println(" mang duoc nhap vao la ");
        for ( int x : mang) { System.out.println(x);
        }
        System.out.println(" Vui long nhpa phan tu muon tim kiem ");
        int k = scan.nextInt();
        for ( int i = 0; i < mang.length - 1 ; i++){
            if (k==mang[i]){
                System.out.println(" Tim thay phan tu o vi tri " + i );
            }
        }
        for ( int i =0; i < mang.length - 1 ;i++){
            int temp=mang[i];
            for (int j = i + 1; j < mang.length ; j++ ){
                if (temp > mang[j]){
                    mang[i] = mang[j];
                    mang[j] = temp;
                    temp = mang[i];
                }
            }
        }
        System.out.println(" Mang duoc sap xep tang dan ");
        for ( int x : mang ){
            System.out.println(x);
        }
        for ( int i =0; i < mang.length - 1 ;i++){
            int temp=mang[i];
            for (int j = i + 1; j < mang.length ; j++ ){
                if (temp < mang[j]){
                    mang[i] = mang[j];
                    mang[j] = temp;
                    temp = mang[i];
                }
            }
        }
        System.out.println(" Mang duoc sap xep tang dan ");
        for ( int x : mang ){
            System.out.println(x);
    }
}
}
    