import static org.junit.jupiter.api.Assertions.*;

class LCA_test {

    public BinaryTree tree = tree();

    BinaryTree tree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        return tree;
    }
    /**
    Tree Generated:

            20
           /  \
          8   22
         / \
        4  12
          /  \
         10  14

     */


    @org.junit.jupiter.api.Test
    public void test_LCA_10_14() {
        int n1 = 10;
        int n2 = 14;
        // lca(10, 14) ==> 12

        assertEquals(12, tree.lca(tree.root, n1, n2).data);
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_14_8() {
        int n1 = 14;
        int n2 = 8;
        // lca(14, 8) ==> 8

        assertEquals(8, tree.lca(tree.root, n1, n2).data);
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_10_22() {
        int n1 = 10;
        int n2 = 22;
        // lca(10, 22) ==> 20

        assertEquals(20, tree.lca(tree.root, n1, n2).data);
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_4_12() {
        int n1 = 4;
        int n2 = 12;
        // lca(4, 12) ==> 8

        assertEquals(8, tree.lca(tree.root, n1, n2).data);
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_Empty() {
        int n1 = 0;
        int n2 = 0;
        // lca(0, 0) ==> null

        assertNull(tree.lca(tree.root, n1, n2));
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_NotPresent() {
        int n1 = 6123123;
        int n2 = 237875;
        // lca(6123123, 237875) ==> null

        assertNull(tree.lca(tree.root, n1, n2));
    }

    @org.junit.jupiter.api.Test
    public void test_LCA_emptyroot() {
        int n1 = 4;
        int n2 = 12;
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(0);
        // Root = 0
        // lca(4, 12) ==> null

        assertNull(tree.lca(tree.root, n1, n2));
    }
}