package DSLKDon;

public class Node {
    private Student student;
    public Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }

    public void printData() {
        student.printInfor();

    }
}
