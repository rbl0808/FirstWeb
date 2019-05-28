package ZXD_2018_11_28;

import org.junit.platform.commons.util.StringUtils;

class Node {
    private int Data;// 数据域
    private Node Next;// 指针域【链域】，存储下一个节点
    public Node(int Data) {
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }
}

public class ReverseListRbl {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }

        //  head = Reverse1(head);
        head = Reverse3(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

    /**
     *
     * @param head
     * @return
     */
    public static Node Reverse3(Node head) {
        //少于两个节点没有反转的必要。
        if(head == null || head.getNext() == null)
            return head;

        Node p,q,r;
        //上一节点
        p = head;
        //当前节点
        q = head.getNext();
        //旧的头指针是新的尾指针，next需要指向NULL
        //head.setNext(null);

        while (q != null){
            //先保留下一个step要处理的指针
            r = q.getNext();
            //然后p q交替工作进行反向
            q.setNext(p);
            p = q;
            q = r;
        }
        //当循环结束时 q指向null 把头节点指向q 插入队尾
        head.setNext(q);
        return p;

    }

    /**
     * 递归反转法，从尾结点开始，逆向反转各个结点的指针域指向。
     */
    public static Node Reverse1(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = Reverse1(head.getNext());// 先反转后续节点head.getNext()
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
        head.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

    /**
     * 遍历反转法：从前往后反转各个结点的指针域的指向。
     *
     * @param head
     * @return
     */
    public static Node Reverse2(Node head) {
        if (head == null) return head;
        Node pre = head;// 上一结点
        Node cur = head.getNext();// 当前结点
        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
        while (cur != null) {// 当前结点为null，说明位于尾结点
            tmp = cur.getNext();
            cur.setNext(pre);// 反转指针域的指向
            pre = cur; // 指针往下移动
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }
}
