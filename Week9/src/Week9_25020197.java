class Node {
    String name;
    int firstChild;
    int nextSibling;
    public Node(String name, int firstChild, int nextSibling) {
        this.name = name;
        this.firstChild = firstChild;
        this.nextSibling = nextSibling;
    }

    @Override
    public String toString() {
        return "Node[" + name + "]";
    }
}

public class Week9_25020197 {
    public static int findParentIndex(Node[] tree, int targetIndex) {
        if (targetIndex <= 0) return 0;

        for (int i = 1; i < tree.length; i++) {
            Node parent = tree[i];

            if (parent == null) continue;

            int currentChildIndex = parent.firstChild;

            while (currentChildIndex != 0) {
                if (currentChildIndex == targetIndex) {
                    return i;
                }
                currentChildIndex = tree[currentChildIndex].nextSibling;
            }
        }

        return 0;
    }
}