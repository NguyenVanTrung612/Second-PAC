package BaiTap;

public class HinhVuong {
    public static float chuVi(float canhHinhVuong){
        return canhHinhVuong * 4;
    }
     public static float dienTich(float canhHinhVuong){
          return canhHinhVuong *canhHinhVuong;
     }
      public static void main(String[] args) {
        float chieuDai =4.5f;
         System.out.println("Chui vi va Dien tich hinh vuong");
          System.out.println(HinhVuong.chuVi(chieuDai));
           System.out.println(HinhVuong.dienTich(chieuDai));
         
     }
    
}
