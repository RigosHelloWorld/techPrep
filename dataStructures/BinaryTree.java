package dataStructures;

public class BinaryTree {
    Node root = null;

    private class Node {
        int data;
        Node left;
        Node right;

        private Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void add(int data) {
        if(root == null){
            root = new Node(data);
        }else add(root, data);

    }

    private void add(Node root, int data) {
        if(root == null){
            Node newNode = new Node(data);
            root = newNode;
            System.out.println("Root value is: " + root.data);
        }else{

            if(data < root.data){
                if(root.left != null) add(root.left,data);
                else{
                    Node newNode = new Node(data);
                    root.left = newNode;
                    System.out.println("Inserted value: " + data + "to the left of " +root.left );

                }
            }else if(data> root.data){
                if(root.right != null) add(root.right,data);
                else{
                    Node newNode = new Node(data);
                    root.right = newNode;
                    System.out.println("Inserted value: " + data + "to the right of " + root.right );

                }
            }
        }
    }

}
