package leetCode;
/**
 * 
 * @author bselvaga
 *Given an array of integers, 
 *every element appears twice except for one. 
 *Find that single one.
 */
public class SingleNumber

{
	 public static int singleNumber(int[] nums) {
	     int xor=0;  
		 for(int i =0;i<nums.length;++i)
	       {
	    	  xor = nums[i]^xor; 
	       }
		
		 
		 //System.out.println(xor);
	 return xor;   
	 }
	public static void main(String[] args) {
		int[] nums={1,2,3,1,2};
		singleNumber(nums);
	}
}
