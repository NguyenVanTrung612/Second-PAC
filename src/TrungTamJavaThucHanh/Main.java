package TrungTamJavaThucHanh;

import java.util.Scanner;

import TrungtamJava.NhanVien;

public class Main {
   
    public String ten;
    public int tuoi;
     public Test(String ten){
         this.ten = ten;
     }
      public void setTuoi(int tuoi){
          this.tuoi = tuoi;
      }
       public void showStuden(){
           System.out.println("Ten : " + ten);
            System.out.println("Tuoi : " + tuoi);
       }
        public static void main(String[] args) {
            Test t = new Test("Nguyen Van Trung");
             t.setTuoi(19);
             t.showStuden();
        }
   
}
