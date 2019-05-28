package ZXD_2018_11_28;

/**
 * 单链表逆序
 * @author zhoujie
 * Created on 2018-11-19 11:34
 */
public class ReverseListJiaoBuChong {

    private static class Node<E> {
        final E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void display(Node<Character> header) {
        Node<Character> p = header;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }

    }

    /**
     * 单链表逆序
     *
     * @param header
     */
    public static Node<Character> reverseList(Node<Character> header) {
        Node<Character> p = header.next;
        header.next = null;
        Node<Character> temp;
        while (p != null) {
            temp = p.next;
            p.next = header;
            header = p;
            p = temp;
        }
        return header;
    }

    public static void main(String[] args) {
        String a = "abcdefghijk";
        char[] charArray = a.toCharArray();
        Node<Character> header = new Node<>(charArray[0], null);
        Node<Character> p = header;
        for (int i = 1; i < charArray.length; i++) {
            Node<Character> node = new Node<>(charArray[i], null);
            p.next = node;
            p = node;
        }
        display(header);
        System.out.println();
        // 链表逆序
        display(reverseList(header));
        System.out.println();
        display(header);
    }
}
