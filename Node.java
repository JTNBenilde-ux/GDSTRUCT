public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node() { }

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public Node getMin() {
        Node current = this;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current;
    }

    public Node getMax() {
        Node current = this;
        while (current.rightChild != null) {
            current = current.rightChild;
        }
        return current;
    }

    public void traverseInOrderDescending() {
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }
        System.out.print(data + " ");
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }
    }

    public int getData() { return data; }
    public void setData(int data) { this.data = data; }

    public Node getLeftChild() { return leftChild; }
    public void setLeftChild(Node leftChild) { this.leftChild = leftChild; }

    public Node getRightChild() { return rightChild; }
    public void setRightChild(Node rightChild) { this.rightChild = rightChild; }
}
