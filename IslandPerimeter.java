package leetCode;

public class IslandPerimeter {
	   public static int islandPerimeter(int[][] grid) {
		   int p=0,i=0,j=0,r=grid.length,c=grid[0].length;
		   for(i=0;i<r;++i)
	        {
	        	for(j=0;j<c;++j)
	        	{
	        		if(grid[i][j]==1)
	        		{	p+=4;

                    if (i > 0 && grid[i-1][j] == 1) p -= 2;
                    if (j > 0 && grid[i][j-1] == 1) p -= 2;
	        		}
	        	/*	if(grid[i+1][j]==1)
	        			p-=2;
	        		if(grid[i][j+1]==1)
	        			p-=2;
	        			*/
	        	}
	        }
	     //   System.out.println(p);
	        return p;
	    }
	   
	   public static void main(String[] args) {
		
		   int[][] grid = {{0,1,0,0},
		                   {1,1,1,0},
		                   {0,1,0,0},
		                   {1,1,0,0}};
		   islandPerimeter(grid);
	}
}
