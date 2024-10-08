// Định nghĩa class ListNode
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionLinkedList {

    // Phương thức để tìm node giao nhau
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // Nếu một trong hai danh sách rỗng, không có giao điểm
        }

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        // Di chuyển hai con trỏ
        while (ptrA != ptrB) {
            // Khi ptrA đến cuối danh sách A, chuyển nó sang đầu danh sách B
            ptrA = (ptrA == null) ? headB : ptrA.next;

            // Khi ptrB đến cuối danh sách B, chuyển nó sang đầu danh sách A
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        // Khi ptrA == ptrB thì đó là điểm giao nhau, hoặc cả hai đều là null
        return ptrA;
    }

    // Phương thức để in danh sách liên kết
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Phương thức chính để thử nghiệm
    public static void main(String[] args) {
        IntersectionLinkedList solution = new IntersectionLinkedList();

        // Tạo danh sách liên kết A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        // Tạo danh sách liên kết B: 4 -> 5 -> 6
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);

        // Tạo điểm giao nhau: 3 -> 7 -> 8
        ListNode intersection = new ListNode(7);
        intersection.next = new ListNode(8);

        // Kết nối danh sách A và B tại điểm giao nhau
        headA.next.next.next = intersection; // A: 1 -> 2 -> 3 -> 7 -> 8
        headB.next.next.next = intersection; // B: 4 -> 5 -> 6 -> 7 -> 8

        // In ra danh sách A và B
        System.out.print("List A: ");
        solution.printList(headA);
        System.out.print("List B: ");
        solution.printList(headB);

        // Tìm node giao nhau
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
