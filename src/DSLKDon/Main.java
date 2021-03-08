package DSLKDon;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList - Java");
        LinkedList list = new LinkedList();
        list.insecrtAt(new Node(new Student("Nguyen Van Trung", 20, "Nam", "486 Le Quang Sung")), 1);
        list.insecrtAt(new Node(new Student("Nguyen Tien Bach", 21, "Nam", "74/16 Le Dai Hanh")), 2);
        list.insecrtAt(new Node(new Student("Van Trung Nghia", 22, "Nam", "36B/22 Hoang Hoa Tham")), 3);

        list.printList();
    }
}
