package BaiTap;

public class HinhChuNhat {
    public static float chuVi(float chieuDai, float chieuRong){
        return chieuDai + chieuRong * 2;
    }
     public static float dienTich(float chieuDai, float chieuRong){
          return chieuDai * chieuRong;
     }
      public static void main(String[] args) {
          float chieuDai = 7.5f;
          float chieuRong = 4.6f;
          System.out.println("Chu vi va Dien tich hinh chu nhat");
           System.out.println(HinhChuNhat.chuVi(chieuDai, chieuRong));
            System.out.println(HinhChuNhat.dienTich(chieuDai, chieuRong));
      }
    
}
