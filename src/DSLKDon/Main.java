package DSLKDon;

public class Main {
    public static void main(String[] args) {
        System.out.println("DanhSachSinhVien - Java");
        DanhSachSinhVien list = new DanhSachSinhVien();
        list.insecrtAt(new Node(new Student("Nguyen Van Trung", 20, "Nam", "486 Le Quang Sung", 154135)), 2);
        list.insecrtAt(new Node(new Student("Nguyen Tien Bach", 21, "Nam", "74/16 Le Dai Hanh", 324564)), 3);
        list.insecrtAt(new Node(new Student("Van Trung Nghia", 22, "Nam", "36B/22 Hoang Hoa Tham", 253791)), 2);
        list.insecrtAt(new Node(new Student("Nguyen Phi Truong", 22, "Nam", "727 Bau Cat 8", 142693)), 1);

        // TIM DANH SACH SINH VIEN THONG QUA SEARCH ID //
        int id = 1299;
        Node searchNode = list.search(id);
        if (searchNode != null) {
            System.out.println("Student can tim: \n");
            searchNode.student.printInfor();
        } else {
            System.out.println("Student id = " + id + " Khong co trong danh sach: \n");
        }

        // COMMENTS LIST.PRINTLIST() DE SEARCH ID //
        list.printList();
    }
}
