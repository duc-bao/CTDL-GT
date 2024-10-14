class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class MergeSortList {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        // Tạo danh sách liên kết B: 4 -> 5 -> 6
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);

        ListNode headC = mergeListSort(headA, headB);
        while (headC != null){
            System.out.println(headC.val + " ");
            headC = headC.next;
        }
    }

    private static ListNode mergeListSort(ListNode headA, ListNode headB) {
        if(headA == null && headB == null){
            return null;
        }
        if(headA == null){
            return  headB;
        }
        if (headB == null){
            return headA;
        }
        if(headA.val < headB.val){
            headA.next = mergeListSort(headA.next, headB);
            return headA;
        }
        else {
            headB.next = mergeListSort(headA, headB.next);
            return headB;
        }

    }
}
