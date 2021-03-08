package DSLKDon;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList - Java");
        LinkedList list = new LinkedList();
        list.insecrtAt(new Node(new Student("Nguyen Van Trung", 20, "Nam", "486 Le Quang Sung", 123456)), 0);
        list.insecrtAt(new Node(new Student("Nguyen Tien Bach", 21, "Nam", "74/16 Le Dai Hanh", 456454)), 0);
        list.insecrtAt(new Node(new Student("Van Trung Nghia", 22, "Nam", "36B/22 Hoang Hoa Tham", 754382)), 0);

        list.printList();
    }
}
