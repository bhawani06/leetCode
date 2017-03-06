package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FindTheDifference {
	  public static char findTheDifference(String s, String t) {
	        int i,ls=s.length(),lt=t.length();
	        HashMap<Character, Integer> hm = new HashMap<>();
	        for(i=0;i<lt;++i)
	        {
	        	if(hm.containsKey(t.charAt(i)))
	        		hm.put(t.charAt(i), hm.get(t.charAt(i))+1);
	        	else
	        		hm.put(t.charAt(i), 1);
	        }
	        char res = ' ';
	        for(i=0;i<ls;++i)
	        {
	        	if(hm.containsKey(s.charAt(i))) //, 1);
	        	{
	        		hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
	        	}
	        }
	        Set<Character> keyset = hm.keySet();
	        
	        Iterator<Character> it= keyset.iterator();
	       while( it.hasNext())
	        {
	    	   res= it.next();
	        	if(hm.get(res)==1)
	        	{
	        		break;
	        	}
	        }
	        
	        System.out.println(res);
	        return res;
	    }
	  public static void main(String[] args) {
		  findTheDifference("a","aa");
	}
}
