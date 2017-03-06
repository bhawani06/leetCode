package leetCode;

import java.util.Stack;

public class BalanceParanthesis {
	public static boolean balanceParanthesis(String s) {
		Stack<Character> st= new Stack<>();
		Character pop;
		boolean res=true;
		for(Character p:s.toCharArray())
		{
			if(res==false)
				return false;
			switch(p)
			{
			case '{': st.push('{');
					break;

			case '(': st.push('(');
					break;

			case '[': st.push('[');
			break;
			case '}': 
					if(!st.isEmpty())
					{	pop=st.pop();
						if(pop!='{')
							res=false;
					}
					else
						res=false;
					break;
			case ']': 
					if(!st.isEmpty())
					{	pop=st.pop();
						if(pop!='[')
							res=false;
					}
					else
						res=false;
					break;
			case ')':if(!st.isEmpty())
					{
						pop=st.pop();
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
		if(!st.isEmpty())
			res=false;
		return res;
	}
	public static void main(String[] args) {
		String ip="[](){}";
		
		System.out.println(balanceParanthesis(ip));
	}

	
}
