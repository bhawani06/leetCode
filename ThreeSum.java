package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		
		int i,j,k,target;
		List<Integer> l = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		
		 Arrays.sort(nums);
		 boolean next=false;
        for(i=0;i<nums.length-2;++i)
        {
    		target=0-nums[i];
    		next=false;
        	for(j=i+1,k=nums.length-1;j<k;)
        	{
        		l = new ArrayList<>();
        		if(nums[j]+nums[k]==target)
        		{
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
        		else if(nums[j]+nums[k]<target)
        		{
        			++j;
            		
        		}
        		else if(nums[j]+nums[k]>target)
        		{
        			--k;

        		}
        		while(i<nums.length-1 && nums[i]==nums[i+1])
        			++i;
        	
        	}
        	
        }
        return res;
    }
public static void main(String[] args) {
	
	int[]nums = {0,0,00,0,0};
	List<List<Integer>>  res =threeSum(nums);
	for(int i=0;i<res.size();++i)
	{	for(int j = 0;j<res.get(i).size();++j)
		{	System.out.print(res.get(i).get(j)+",");
		}
		System.out.println();
	}
	}
	
}


