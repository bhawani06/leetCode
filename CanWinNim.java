package leetCode;

public class CanWinNim {
	 public static boolean canWinNim(int n) {
		 return canWinNim(n,true);
	    }
	 public static boolean canWinNim(int n,boolean flag) {
	        
		 boolean res;
		 if(n<=0)
			 return false;

		 if((n==1 || n==2 ||n==3 ) && flag ==false)
			 return false;
		 
		 if((n==1 || n==2 ||n==3 ) && flag ==true)
			 return true;
		 flag= !flag;
		 res= canWinNim(n-1,flag);
		 if(res)
			 return res;
		 else
		 {
			 res = canWinNim(n-2,flag);
			 if(res)
				 return res;
			 else
			 {
				 res=canWinNim(n-3,flag);
				 if(res)
					 return res;
			 }
		}
		return false;
		 
	    }

	public static void main(String[] args) {
		
		
		System.out.println(canWinNim(4));
	}

}
