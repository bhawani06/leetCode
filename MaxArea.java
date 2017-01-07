package leetCode;

public class MaxArea {

	 public static int maxArea(int[] height) {
	      int i =0,n=height.length-1;
	      int max=0;
	      while(i<n){
	    	  max=Math.max(max, (n-i)*Math.min(height[i], height[n]));
	    	  if(height[i]< height[n])
	    	  	  ++i;
	    	  else
	    		  --n;
	      }
	        return max;
	    }
	 public static void main(String[] args) {
		 int[] height = {1,5,4,11,9,12};
	System.out.println(maxArea(height));	
	}
}
