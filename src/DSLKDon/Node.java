package DSLKDon;

public class Node {
    public Student student;
    public Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }

    public void printData() {
        student.printInfor();
    }

    public boolean hasStudent(int studentId) {
        return this.student.getId() == studentId;
    }
}
