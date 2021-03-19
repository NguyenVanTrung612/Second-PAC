package CayNhiPhan;

// Author: Nvt //
public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree - BST\n");

        BsTree tree = new BsTree();

        tree.insecrt(new Node(new Student("Nguyen Van Trung", 20, "Nam", "754 Le Quang Sung", 564791)));
        tree.insecrt(new Node(new Student("NguyeN Tien Bach", 20, "Nam", "25/462 Luy Ban Bich", 361498)));

        tree.printPreOrder();
    }

}
