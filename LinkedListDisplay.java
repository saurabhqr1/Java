class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class LinkedListDisplay {  
    public static void Display(Node a){         //  Using While Loop to display value of LinkedList
        Node t = a;
        while(t != null){
            System.out.print(t.val + "  ");
            t = t.next;
        }
        System.out.println();
    }
    public static void RecDisplay(Node t){     //Using Recursion for display value of LinkedList
        System.out.print(t.val + "  ");
        if(t.next == null) return;
        RecDisplay(t.next);
    }
    private static int get(Node head, int idx){
        Node temp = head;
        for(int i = 1 ; i<= idx ; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
         Node a = new Node(4);
         Node b = new Node(5);
         Node c = new Node(6);
         Node d = new Node(7);
         Node e = new Node(8);
         a.next = b; b.next = c;
         c.next = d; d.next = e;
         Display(a);
         RecDisplay(a);
         int value = get(a,0);
         System.out.println();
         System.out.println(value);
    }
}
