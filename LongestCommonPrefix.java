package leetCode;

public class LongestCommonPrefix {
	 public static String longestCommonPrefix(String[] strs) {
		 if(strs.length==0)
			 return "";
		 if(strs.length==1)
			 return strs[0];
		 String comp = "";
		 boolean flag=true;
		 int j,i;
 		 for(i=0;i<strs[0].length()+1;++i)
		 {
			 
			 
			 for(j=0;j<strs.length;++j)
			 {
				 if(!strs[j].startsWith(comp))
				 {
					  flag = false;
					  comp=comp.substring(0, comp.length()-1);
					  break;
				 }
			 }
			 if(flag==false)
				 break;
			 if(i>=strs[0].length())
				 break;
			 
			 comp=comp+strs[0].charAt(i);
		 }
	        return comp;
	    }
	 public static void main(String[] args) {
		 String[] strs={"qa","qqab","qasd","qaq"};
		
		 System.out.println(longestCommonPrefix(strs));
	}
}
