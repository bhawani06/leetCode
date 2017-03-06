package leetCode;

public class FindComplement {
	 public static int findComplement(int num) {
		 
		 String bin = Integer.toBinaryString(num),comp = new String();
		for(int i=0;i<bin.length();++i)
		{
			if(bin.charAt(i)=='0')
				comp+="1";
			else
				comp+="0";
		}
		int res =Integer.parseUnsignedInt(comp, 2);
		return res;
   }
	public static void main(String[] args) {
		System.out.println(findComplement(8));
	}
}
