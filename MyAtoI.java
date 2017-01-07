package leetCode;

public class MyAtoI {
	 public static int myAtoi(String str) {
		 long res=0;
		 boolean neg=false;
		 str=str.trim();
		 char x;
		 int n = str.length(),i=0;

		 if(n==0)
			 return 0;
		 if(str.charAt(0)=='-')
		 {	 neg=true;
		 	str=str.substring(1);
		 	--n;
			 if(n==0)
				 return 0;
		 }
		 if (neg && str.charAt(0)=='+')
		 {
			 return 0;
		 } 
		 if (!neg && str.charAt(0)=='+')
		 {str=str.substring(1);
		 	--n;
		 }
		 
		 for(;i<n;++i)
	        {
	        	
	        	x=str.charAt(i);
	        	if(x=='+'||x=='-')
	        		break;
	        	switch (x)
	        	{
			    	case '1': res=res*10+1; break;
			    	case '2': res=res*10+2;  break;
			    	case '3': res=res*10+3; break;
			    	case '4': res=res*10+4; break;
			    	case '5': res=res*10+5;  break;
			    	case '6': res=res*10+6; break;
			    	case '7': res=res*10+7; break;
			    	case '8': res=res*10+8; break;
			    	case '9': res=res*10+9;  break;
			    	case '0': res=res*10+0; break;
			    	default: 
						 if(neg)
							 res*=-1;
			    		return (int) res; 
	        	
	        	}
	        
	 	        if(neg==false && res >= Integer.MAX_VALUE)
	 	        	return Integer.MAX_VALUE;

	        	 if(neg==true && (res*-1) <= Integer.MIN_VALUE)
	 	        	return Integer.MIN_VALUE;
	        	
	        }
			 if(neg)
				 res*=-1;
		 return (int) res;
	    }
	public static void main(String[] args) {
		System.out.println(myAtoi("-1342dfsfs"));
	}

}
