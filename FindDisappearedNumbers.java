package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	       int n = nums.length;
		 List<Integer> l= new ArrayList<>();
		 for(int i = 0;i<n;++i)
		 {
			 int val = Math.abs(nums[i]);
		//	 if(val<=nums.length)
			 {
				 if(nums[val-1]>0)
					 nums[val-1]=0- nums[val-1];
			 }
		 }
		 for(int i = 0;i<n;++i)
		 {
			 if(nums[i]>0)
			 {
				 l.add(i+1);
				 System.out.print((i+1)+",");
			 }
		 }
		 
		 return l;
		 
	    }
	 public static void main(String[] args) {
		 int[] nums ={1,1};
		 findDisappearedNumbers(nums);
	}
}
