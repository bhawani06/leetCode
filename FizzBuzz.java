package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList<>();
    	int i;
    	for(i=1;i<=n;++i)
    	{
    		if(i%3==0 && i%5==0)
    		{
    			res.add("FizzBuzz");
    		}
    		else if(i%3==0)
    		{
    			res.add("Fizz");
    		}
    		else if(i%5==0)
    		{
    			res.add("Buzz");
    		}
    		else
    			res.add(i+"");
    	}
    	return res;
    }
    public static void main(String[] args) {
    	fizzBuzz(14);
	}
}
