class Solution {
    public boolean checkStraightLine(int[][] c) {
        int r = c.length;
        int prev_y = (c[0][1]-c[1][1]);
        int prev_x = ( c[0][0] - c[1][0]);
        
        for(int i=2;i<r;i++){
            int y = c[i-1][1] - c[i][1];
            int x = c[i-1][0] - c[i][0];
            
            if(y==prev_y && x==prev_x || (y==0 && prev_y==y ) || (x==0 && prev_x==x)|| (((float)(prev_y))/prev_x == ((float)(y))/x) ){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
