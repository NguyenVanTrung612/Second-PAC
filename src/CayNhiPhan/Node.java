package CayNhiPhan;

// Author: Nvt //
public class Node {
    public Student student;
    public Node left;
    public Node right;

    public Node(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }

    public void printData() {
        student.printInfor();
    }

    public boolean hasStudent(int studentId) {
        return this.student.getId() == studentId;
    }
}
