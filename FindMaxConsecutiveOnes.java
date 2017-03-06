package leetCode;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] ip ={1};
		System.out.println(findMaxConsecutiveOnes(ip));
		
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		
		int i=0,max=Integer.MIN_VALUE,count=0,n=nums.length;
		for(i=0;i<n;++i)
		{
			if(nums[i]==0)
			{	
				if(count>max)
					max=count;
				count = 0;
			}
			else
				++count;
		}
		if(count>max)
			max=count;
		return max;
		
	}
}
