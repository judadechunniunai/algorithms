public class ReverseList {

    static class Node<T> {
        Node<T> next;
        Node<T> pri;
        T value;

        public Node(Node<T> next, T value) {
            this.next = next;
            this.value = value;
        }

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public static void main(String[] args) {
        //定义一个链表
        Node<Integer> first = new Node<>(1);
        first.next = new Node<>(2);
        first.next.next = new Node<>(3);
        printLinkList(first);
        //翻转链表
//        first = reverseList(first);
        first = reverseDoubleList(first);
        if (first == null) {
            return;
        }
        printLinkList(first);

    }
    //单链表
    private static Node<Integer> reverseList(Node<Integer> head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    //双链表
    private static Node<Integer> reverseDoubleList(Node<Integer> head) {
        Node pre = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            head.pri = next;
            pre = head;
            head = next;
        }
        return pre;
    }





    static void printLinkList(Node node) {
        System.out.print(node);

        while (node.next != null) {
            System.out.print(node.next);

            node = node.next;
        }
        System.out.println(" ");
    }
}
