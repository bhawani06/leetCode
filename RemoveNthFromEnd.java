package leetCode;

 // Definition for singly-linked list.

 
public class RemoveNthFromEnd {
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
		 
		 ListNode slow = head, fast=head;
		 if(n<1)
			 return null;
		 int i=0;
		 while(i<n)
		 {
			 if(fast==null)
				 return null;
			fast=fast.next;
			++i;
		 }
		 if(fast==slow)
			 return null;
		 if(fast==null)
		 {
			 head=head.next;
			 return head;
		 }
		 while(fast.next!=null)
		 {
			fast=fast.next;
			slow= slow.next;
		 }
		 slow.next=slow.next.next;
		//System.out.println(slow.val);
		return head;
	    }
	 
	 public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
	//	head.next.next = new ListNode(3);
	//	head.next.next.next = new ListNode(4);
	//	head.next.next.next.next = new ListNode(5);
		
		ListNode t= removeNthFromEnd(head,1);
		while(t!=null)
		{
			System.out.println(t.val);
			t=t.next;
		}
	}
}
