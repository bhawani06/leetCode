package leetCode;

public class HammingDistance {
public static int hammingDistance(int x, int y) {
        
	String xB= Integer.toBinaryString(x),yB=Integer.toBinaryString(y);
	
	int n = (xB.length()>yB.length())? xB.length():yB.length();


	int count=0,i=0,j=0;
	while(xB.length()<yB.length())
	{
		xB="0"+xB;
	}
	while(yB.length()<xB.length())
	{
		yB="0"+yB;
	}

	System.out.println(xB+","+yB);
	i=0;
	while(i<xB.length() )
	{	
		if(xB.charAt(i)!=yB.charAt(i))
		{	++count;
		}
		++i;
	}
	
	return count;
}
	public static void main(String[] args) {
		System.out.println(hammingDistance(3,1));
	}
}
