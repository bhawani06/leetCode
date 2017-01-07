package leetCode;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two 
 * numbers such that they add up to a specific target.
You may assume that each input would have exactly one 
solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * @author bselvaga
 https://leetcode.com/problems/two-sum/ 
 
 */
public class TwoSums {

	public static int[] twoSum(int[] nums, int target) 
	{
	
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] res = new int[2];
		for(int i =0;i<nums.length;++i)
		{
			if(hm.containsKey(target - nums[i]))
			{
				res[0]=hm.get(target-nums[i]);
				res[1]=i;
				break;
			}
			else
			{
				hm.put(nums[i], i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] ip = {2, 7, 11, 15};
		int[] res = twoSum(ip,18);
		for(int i:res)
		{
			System.out.print(i+",");
		}
		
	}
}
