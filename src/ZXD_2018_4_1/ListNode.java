/**
 * FileName: ReverseList
 * Author: rbl
 * Date:
 **/
package ZXD_2018_4_1;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

class solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = pre;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
}
