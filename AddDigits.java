package leetCode;

public class AddDigits {

	 public static int addDigits(int num) {
		    
		 int sum=0;
		 while(num>0)
		 {
			 sum+=num%10;
			 num=num/10;
			 if(num==0)
			 {
				 if(sum>=10)
				 {	 num=sum;
				 	sum=0;
				 }
			 }
		 }
		return sum;
	    } 
	 public static void main(String[] args) {
		System.out.println(addDigits(19));
	}
}
