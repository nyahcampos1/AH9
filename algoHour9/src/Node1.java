class Node1<T> {
    T val;
    Node<T> next;

    public Node1(T val) {
        this.val = val;
        this.next = null;
    }
}

class ECSource {
    public static <T> boolean isUnivalueList(Node<T> head) {
        Node<T> current = head;
        while (head != null)
        {
            current = current.next;
            if(current == target)
            {
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node<String> z = new Node1<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}