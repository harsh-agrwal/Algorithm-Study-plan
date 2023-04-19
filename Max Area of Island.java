class Solution 
{
    int area=0;
    public void dfs(int row,int col,int n,int m,int grid[][],int vis[][])
    {
        vis[row][col]=1;
         area+=1;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nrow=delrow[i]+row;
            int ncol=delcol[i]+col;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
            {
                dfs(nrow,ncol,n,m,grid,vis);
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    area=0;
                    dfs(i,j,n,m,grid,vis);
                    //System.out.print(area);
                    max=Math.max(area,max);
                }
            }
        }
        return max;
    }
}
