public class Main {
    public static void main(String[] args) {


        leetcode_2 l =new leetcode_2();

        ListNode q = new ListNode();
        ListNode w = new ListNode();
        ListNode e = new ListNode();
       ListNode r = new ListNode();
       ListNode t = new ListNode();
       ListNode y = new ListNode();
        q.next=w;
        w.next=e;
        r.next=t;
        t.next=y;
        q.val = 2;
        w.val=4;
        e.val=3;
        r.val=5;
        t.val=6;
        y.val=4;
        ListNode res  = l.addTwoNumbers(q,r);
        System.out.println(res.val);
        res=res.next;
        System.out.println(res.val);
        res=res.next;
        System.out.println(res.val);










    }
}
