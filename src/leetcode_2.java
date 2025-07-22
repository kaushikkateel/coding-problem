public class leetcode_2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode();
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode r = res;
        int rem = 0;
        while(n1!=null || n2!=null){
            int v1, v2;
            v1=n1==null?0:n1.val;
            v2=n2==null?0:n2.val;
            int sum = v1+v2+rem;
            int sum2=sum>=10?sum%10:sum;
            rem = sum>=10?sum/10:0;
            n1=n1!=null?n1.next:null;
            n2=n2!=null?n2.next:null;
            r.val=sum2;
            r.next = new ListNode();
            r = r.next;
        }

        return res;
    }


}
