package BaiTap;

public class DrawingPlusSign {
    public static void main(String[] args) {
        for ( int i = 1; i<=10; i++) {
            for ( int j = 1; i<=10; i++) {
                if(((i == 1 || i == 10 || i == 4 || i == 7) && (j == 4 || j == 7))
                || ((j == 1 || j == 10) && (i == 4 || i == 7))) {
                    System.out.println("*");
                }else if ((i == 1 || j == 10) && (i == 5 || i == 6)
                 || (i == 2 || i == 3) && (j == 4 || j == 7)) {
                    System.out.println("|");
                }
            }
        

        }
    }
}


