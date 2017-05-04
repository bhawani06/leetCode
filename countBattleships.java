package leetCode;
/*
 * https://leetcode.com/problems/battleships-in-a-board/#/description
 */
public class countBattleships {
	 public static int countBattleships(char[][] board) {
		 int count =0,i=0,j=0,row = board.length,col = board[0].length;
	     int[] res = new int[col];
	 	for(j=0;j<col;++j)
	 	{
	 		res[j]=0;
	 	}
		 for(i=0;i<row;++i)
	     {
	       	for(j=0;j<col;++j)
	       	{
	        	if(board[i][j]=='X')
	        	{
	        		if(j==0 && res[j]!=1 )
	        		{
	        			++count;
	        			res[j]=1;
	        		}
	        		
	        		if(res[j]!=1 && res[j-1]!= 1 && j!=0)
	        		{
	        			
	        			++count;
	        			res[j]=1;
	        		}
	        		if(res[j]!=1 )
	        		{
	        			res[j]=1 ;
	        		}
	        	}
	        	
	        	else if(board[i][j]!='X')
	        	{
	        		res[j]=0;
	        	}
	       	}
	     }
		 
		 return count;
	    }

	 public static void main(String[] args) {
		char[][] board ={{'.','.','.','.','.'},
				{'X','X','X','.','.'},
				{'.','.','.','X','X'},
				{'.','X','.','.','.'},
				{'.','X','.','.','.'}};
		System.out.println(countBattleships(board));
	}
}
