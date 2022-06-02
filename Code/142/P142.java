package yajha.solution;

public class P142 {

    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode p1=head,p2=head;
        ListNode mid=null;
        while (p2!=null){
            if (p2.next==null || p2.next.next==null){
                return null;
            }
            p1=p1.next;
            p2=p2.next.next;
            if (p1==p2) {
                mid=p1;
                break;
            }
        }

        p1=head;
        p2=mid;
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;

    }

}
