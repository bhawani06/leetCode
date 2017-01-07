package leetCode;

public class IsPalindrome {

	  public static boolean isPalindrome(int x) 
	  {
		  if(x<0)
			  return false;
		  boolean res = true;
		  String s=Math.abs(x)+"";
		 // System.out.println(s);
		  int i,j,l=s.length();
		  for(i=0,j=l-1;i<l/2;++i,--j)
		  {
			  if(s.charAt(i)!=s.charAt(j))
			  {
				  res=false;
				  break;
			  }
		  }
		  return res;
		  
	  }
	  public static void main(String[] args) {
		  System.out.println(isPalindrome(-2147447412));
	}
}
