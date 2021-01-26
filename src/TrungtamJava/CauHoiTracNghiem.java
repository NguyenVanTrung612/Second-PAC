package TrungtamJava;

import java.util.Scanner;

public class CauHoiTracNghiem {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      while(true){
         System.out.println("Lenh tiep tuc trong java la gi ");
         System.out.println(" 1. continue ");
         System.out.println(" 2. break ");
         System.out.println(" Bam q de thoat ");
         String LuaChon = scan.nextLine();
         if (LuaChon.equals("1")){
            System.out.println(" Ban tra loi dung ");
            break;
         }else if (LuaChon.equals("2")){
            System.out.println(" Ban lua chon sai");
            break;
         }else if (LuaChon.equals("q")){
            break;
         }else{
            System.out.println(" Vui long chon dap an !");
         }
         }
      }
   }
   

    

