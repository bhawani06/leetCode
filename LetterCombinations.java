package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
	public static List<String> letterCombinations(String digits) {
		  List<String>  rs=new ArrayList<>();
		 HashMap<String,String> hm = new HashMap<>();
		 if(digits.length()==0)
			 return rs;
	        hm.put("1",null);
	        
	        hm.put("2","abc");
	        hm.put("3","def");
	        hm.put("4","ghi");
	        hm.put("5","jkl");
	        hm.put("6","mno");
	        hm.put("7","pqrs");
	        hm.put("8","tuv");
	        hm.put("9","wxyz");
	        hm.put("0",null);

	       String s1= hm.get(digits.charAt(0)+""),s2="",temp;
	//       System.out.println(s1);
	       if(digits.length()>1)
	       {   
	    	   s2= hm.get(digits.charAt(1)+"");
	//       System.out.println(s2);
	       }
	       
	       
	       if(s2.length()==0)
	       {
	    	   for(int i =0;i<s1.length();++i)
	    	   {

    			   temp=s1.charAt(i)+"";
    			   rs.add(temp);
	    	   }
	       }
	       else
	       {
	    	   for(int i =0;i<s1.length();++i)
	    	   {	
	    		   for(int j =0;j<s2.length();++j)
	    		   {
	    			   temp=s1.charAt(i)+""+s2.charAt(j)+"";
	    			   rs.add(temp);
	    	   		}
	    	   }		
	       }
	        return rs;
        
    }
	public static void main(String[] args) {
		List<String> rl = letterCombinations("");
		for(String s:rl)
			System.out.println(s);
	}
}
