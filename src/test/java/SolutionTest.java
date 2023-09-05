import org.junit.Test;

public class SolutionTest {
    @Test
    public void copyRandoListTest1(){
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.random = head;
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.random = head.next.next;
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.random = head;
        head.next.next.random = head.next.next.next.next;

        Node actual = new Solution().copyRandomList(head);

        while (actual != null){
            System.out.print("val: " + actual.val + " next: ");
            System.out.print (actual.next == null ? "null " : actual.next.val);
            System.out.print(" random: ");
            System.out.print(actual.random == null ? "null " : actual.random.val);
            System.out.println();
            actual = actual.next;
        }

    }

}
