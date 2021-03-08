package DSLKDon;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList - Java");
        LinkedList list = new LinkedList();
        list.insecrtAt(new Node(new Student("Nguyen Van Trung", 20, "Nam", "486 Le Quang Sung")), 0);
        list.insecrtAt(new Node(new Student("Nguyen Tien Bach", 21, "Nam", "74/16 Le Dai Hanh")), 1);
        list.insecrtAt(new Node(new Student("Van Trung Nghia", 22, "Nam", "36B/22 Hoang Hoa Tham")), 2);

        // TIM DANH SACH SINH VIEN THONG QUA SEARCH ID //
        int id = 0;
        Node searchNode = list.search(id);
        if (searchNode != null) {
            System.out.println("Student can tim: \n");
            searchNode.student.printInfor();
        } else {
            System.out.println("Student id = " + id + " Khong co trong danh sach: \n");
        }

        // COMMENTS LIST.PRINTLIST() DE SREACH ID //
        list.printList();
    }
}
