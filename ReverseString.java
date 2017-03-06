package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
public static String reverseString(String s) {

	if(s==null)
		return null;
	int i =0,j,n=s.length()-1;
    StringBuilder res=new StringBuilder(s);
    //res.append("");
    for(i=0,j=n;i<j;--j,++i)
    {
     	res.setCharAt(i, s.charAt(j));
     	res.setCharAt(j, s.charAt(i));
    }
    return res.toString();
}
	public static void main(String[] args) {
		System.out.println(reverseString("asdfggf"));
	}
}
