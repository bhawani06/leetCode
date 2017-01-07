package leetCode;
/**
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of 
 rows like this: (you may want to display this pattern in a fixed font for better 
 legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number 
of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author bselvaga
 https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZag {
	
	 public static String convert(String s, int numRows) {
		 String result="";
	        if(numRows==1)
				return s;
	        int step1,step2;
	        int len=s.length();
	        for(int i=0;i<numRows;++i){
	            step1=(numRows-i-1)*2;
	            step2=(i)*2;
	            int pos=i;
	            if(pos<len)
	                result+=s.charAt(pos);
	            while(true){
	                pos+=step1;
	                if(pos>=len)
	                    break;
					if(step1>0)
						result+=s.charAt(pos);
	                pos+=step2;
	                if(pos>=len)
	                    break;
					if(step2>0)
						result+=s.charAt(pos);
	            }
	        }
	        return result;
	        
	    }
	 public static void main(String[] args) {
		System.out.println(convert("abcd", 2));
	}

}
