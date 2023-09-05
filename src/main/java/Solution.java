import java.util.HashMap;
import java.util.Map;


public class Solution {
    public Node copyRandomList(Node head){
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while (node != null){
            map.put(node, new Node(node.val));
            node = node.next;
        }
        Node forCopy = head;
        while (forCopy != null){
            map.get(forCopy).next = map.get(forCopy.next);
            map.get(forCopy).random = map.get(forCopy.random);
            forCopy = forCopy.next;
        }
        return map.get(head);
    }
}
