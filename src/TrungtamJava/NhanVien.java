package TrungtamJava;

public class NhanVien {
    public String ten;
    public String diaChi;
    public int tuoi;
    // TAO CONSTRUCTOR O DAY 
    public NhanVien(){
    }
    public NhanVien(String ten, String diaChi, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }



    


    
}
