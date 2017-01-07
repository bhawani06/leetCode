package leetCode;
import static java.lang.Math.toIntExact;
/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class REverseInteger {
public static int reverse(int x) {
	
    long res=0; 
    int ab_val=Math.abs(x);
    
    while(ab_val!=0)
    {
   	 res=res*10;
   	
   	 res+=ab_val%10;
   	 ab_val=ab_val/10;
    }
    if(x<0)
   	 res*=-1;
    if(res >Integer.MAX_VALUE || res <Integer.MIN_VALUE)
    	res =0;
    return (int)(res);
   
  }
public static void main(String[] args) {
	//System.out.println(1%10); 
	System.out.println(reverse(1534236469));
}
}
