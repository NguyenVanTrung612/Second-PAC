package BaiTap;

public class DrawingPlusSign {
    public static void main(String[] args) {
        for ( int i = 1; i<=10; i++) {
            for ( int j = 1; i<=10; i++) {
                if((i == 1 && ( j == 4 || j == 7))) {
                    System.out.println("*");
                }
            }

        }
    }
    
}
