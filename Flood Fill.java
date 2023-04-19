class Solution {

    static void move( int[][] i , int r , int  c , int nc , int pc ){

        if( r == -1 || r == i.length || c == -1 || c == i[0].length ) return;

        if( i[r][c] != pc ) return;
        
        i[r][c] = nc;

        move( i , r , c + 1 , nc , pc );
        move( i , r - 1 , c , nc , pc );
        move( i , r + 1 , c , nc , pc );
        move( i , r , c - 1 , nc , pc );

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if( image[sr][sc] == color ) return image;
        
        move( image , sr , sc , color , image[sr][sc] );

        return image;

    }
}
