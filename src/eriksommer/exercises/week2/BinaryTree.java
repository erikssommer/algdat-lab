package eriksommer.exercises.week2;

public class BinaryTree {
    public int parent(int id) {
        return id / 2;
    }

    public int sibling(int id) {
        return parent(id) * 2 == id ? id + 1 : id - 1;
    }

    public int uncle(int id) {
        return sibling(parent(id));
    }

    public int grandparent(int id) {
        return parent(parent(id));
    }

    public static void main(String[] args) {
        System.out.println("Binarytrees");
    }
}
