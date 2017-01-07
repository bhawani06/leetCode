package leetCode;

import java.util.List;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a
 *  single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * @author bselvaga
 https://leetcode.com/problems/add-two-numbers/
 */
class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
public class AddTwoNumbers {
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
	ListNode t1 = l1,t2=l2;
	int carry=0,sum;
	ListNode res = null, head = null;;//ew ListNode(0);
	while(t1!=null && t2!=null)
	{
		sum = t1.val+t2.val+carry;
		carry=0;
		if(sum>9)
		{
			sum -=10;
			carry = 1;
		}
		if(res == null)
		{	res=new ListNode(sum);
			head=res;
		}
		else
		{
			res.next=new ListNode(sum);
			res = res.next;
		}

		t1=t1.next;
		t2=t2.next;
	}
	while(t1!=null)
	{
		if(carry>0)
		{	res.next=new ListNode(t1.val+carry);
			carry = 0;
			if(res.next.val>9)
			{
				res.next.val-=10;
				carry=1;
			}
		}
		else
			res.next= t1;
		t1=t1.next;
		res= res.next;
	}	
	while(t2!=null)
	{
		if(carry>0)
		{	res.next=new ListNode(t2.val+carry);
			carry = 0;
			if(res.next.val>9)
			{
				res.next.val-=10;
				carry=1;
			}
		}
		else
			res.next= t2;
		t2=t2.next;
		res= res.next;
	}
	if(carry>0)
	{
		res.next =new ListNode(carry);
	}
	return head;
        
    }
	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
	//	l1.next=new ListNode(8);
	//	l1.next.next=new ListNode(3);

		ListNode l2 = new ListNode(9);
		 l2.next = new ListNode(9);
		// l2.next.next = new ListNode(4);
		
		ListNode res = addTwoNumbers(l1,l2);
		while(res!=null)
		{
			System.out.println(res.val);
			res=res.next;
		}
		
	}
	
	/* SIMPLER SOL
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
	 
	 */
}
