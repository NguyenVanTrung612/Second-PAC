package BaiTap;

public class Tost {
    public String ten;
    public int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public static void main(String[] args) {
        Tost t = new Tost();
        t.setTen("Trung");
        t.setTuoi(10);
        System.out.println(t.getTen() + " " + t.getTuoi());

    }

    
}
