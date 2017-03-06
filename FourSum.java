package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	 public static List<List<Integer>> fourSum(int[] nums, int target) {

			int i,j,k,h;
			List<Integer> l = new ArrayList<>();
			List<List<Integer>> res = new ArrayList<>();
			
			 Arrays.sort(nums);
			 boolean next=false;
		for(h=0;h<nums.length-3;++h)
		{   for(i=h+1;i<nums.length-2;++i)
	        {
	    		
	    		next=false;
	        	for(j=i+1,k=nums.length-1;j<k;)
	        	{
	        		l = new ArrayList<>();
	        		if(nums[h]+nums[i]+nums[j]+nums[k]==target)
	        		{
	        			l.add(nums[h]);
	        			l.add(nums[i]);
	        			l.add(nums[j]);
	        			l.add(nums[k]);
	        			while(j<k && nums[j]==nums[j+1])
	            			++j;

	            		while(k>j && nums[k]==nums[k-1])
	            			--k;
	        		//	if(!hm.containsKey(l))
	        			{	res.add(l);
	        	//			hm.put(l, 1);
	        			}

	        			--k;
	        			++j;
	        		//	break;
	            		
	        		}
	        		else if(nums[h]+nums[i]+nums[j]+nums[k]<target)
	        		{
	        			++j;
	            		
	        		}
	        		else if(nums[h]+nums[i]+nums[j]+nums[k]>target)
	        		{
	        			--k;

	        		}
	        		while(i<nums.length-1 && nums[i]==nums[i+1])
	        			++i;
	        	
	        	}

        		while(h<nums.length-1 && nums[h]==nums[h+1])
        			++h;
	        }
		
		}
	        return res;
	        
	    }
	 
	 public static void main(String[] args) {
			
			int[]nums = {-1,-5,-5,-3,2,5,0,4};
			List<List<Integer>>  res =fourSum(nums,-7);
			for(int i=0;i<res.size();++i)
			{	for(int j = 0;j<res.get(i).size();++j)
				{	System.out.print(res.get(i).get(j)+",");
				}
				System.out.println();
			}
	 }
}
