package leetCode;

import java.util.Stack;

public class BalanceParanthesis {
	public static boolean balanceParanthesis(String ip) {
		Stack<Character> s= new Stack<>();
		Character pop;
		boolean res=true;
		for(Character p:ip.toCharArray())
		{
			switch(p)
			{
			case '{': s.push('{');
					break;

			case '(': s.push('(');
					break;
			case '}': 
					if(!s.isEmpty())
					{	pop=s.pop();
						if(pop!='{')
							res=false;
					}
					else
						res=false;
					break;
			case ')':if(!s.isEmpty())
					{
						pop=s.pop();
						if(pop!='(')
							res=false;
					}
					else
						res=false;
					break;			
			}
			if(res==false)
				break;
		}
		if(!s.isEmpty())
			res=false;
		return res;
	}
	public static void main(String[] args) {
		String ip="(())({)}";
		
		System.out.println(balanceParanthesis(ip));
	}

	
}
