/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
        ListNode listNode1 = removeNthFromEnd(listNode, 2);
        print(listNode1);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //找到这个节点 以及这个节点的前置节点和后置节点
        //得到这个链表的长度
        int lenth = getLenth(head);
        //得到这个倒数的n的正数
        int index = lenth - n + 1;
        if (index == 1){
            return head.next;
        }

        int temp = 1;
        ListNode listNode = head;
        while (temp < index - 1) {
            listNode = listNode.next;
            temp++;
        }
        listNode.next = listNode.next.next;
        return head;
    }

    private static int getLenth(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    private static void print(ListNode head) {
        System.out.print(head +"->");
        while (head != null) {
            head = head.next;
            System.out.print(head +"->");

        }
        System.out.println();
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }
}
