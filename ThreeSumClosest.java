package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

public static int threeSumClosest(int[] nums, int target) {
	int i,j,k;
	int prev =Integer.MAX_VALUE-2,temp=0,res = 0;
	 Arrays.sort(nums);
    for(i=0;i<nums.length-2;++i)
    {
    	for(j=i+1,k=nums.length-1;j<k;)
    	{

			temp = (nums[i])+(nums[j])+(nums[k]);
		//	res = isCloser(temp,prev,target);
			if(temp==target)
			{
			//	while(j<k && nums[j]==nums[j+1])
        	//		++j;

        	//	while(k>j && nums[k]==nums[k-1])
        	//		--k;
				++j;--k;
			}
			if(temp<target)
    		{
    			++j;
        		
    		}
    		else if(temp>target)
    		{
    			--k;

    		}
			while(i<nums.length-1 && nums[i]==nums[i+1])
    			++i;
			if (Math.abs(temp - target) < Math.abs(res - target)) 
				res = temp;
    	prev=res;
    	}
    	
    }
    return res;
	
    }
 static int isCloser(int temp, int prev,int target) {
	// TODO Auto-generated method stub
	if(Math.abs(prev-target) > Math.abs(temp-target))
		return temp;
	else
		return prev;

//	 return Integer.min(Math.abs(prev+target), Math.abs(temp+target));
	 
 }
public static void main(String[] args) {

	int[]nums ={4,0,5,-5,3,3,0,-4,-5};
	System.out.println(threeSumClosest(nums, -2));
	
}

}
