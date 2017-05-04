package leetCode;
/*
 * https://leetcode.com/problems/complex-number-multiplication/#/description
 * 
Example:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, 
and you need convert it to the form of 0+2i.
 */
public class complexNumberMultiply {
	 public static String complexNumberMultiply(String a, String b) {
		 int[] Num1 = new int[2],Num2= new int[2];
		 a=a.replaceAll("\\+", "#");
		 String[] splitsA = a.split("#");
		 splitsA[1]=splitsA[1].replace("i", "");
		 Num1[0]=Integer.parseInt(splitsA[0]);
		 Num1[1]=Integer.parseInt(splitsA[1]);
	//	 System.out.println(Num1[0]+"+"+Num1[1]+"i");
		 
		 b=b.replaceAll("\\+", "#");
		 String[] splitsB = b.split("#");
		 splitsB[1]=splitsB[1].replace("i", "");
		 Num2[0]=Integer.parseInt(splitsB[0]);
		 Num2[1]=Integer.parseInt(splitsB[1]);
	//	 System.out.println(Num2[0]+"+"+Num2[1]+"i");
		
		 int real,img,i2;
		  real= Num1[0] * Num2[0];
		 img=Num1[0] * Num2[1]+Num1[1] * Num2[0];
		 i2=-1 * (Num1[1] * Num2[1]);
		 
		 real= real+i2;
		 
		 return real+"+"+img+"i";
		    
	    }
	 public static void main(String[] args) {
		 String num = complexNumberMultiply("1+1i", "1+1i");
		 System.out.println(num);
	}
}
