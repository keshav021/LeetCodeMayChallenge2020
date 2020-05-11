class Solution {
    int val;
    int r;
    int c;
    int prev_color;
    public void solve(int img[][], int x, int y){
        if(x>=r||x<0||y>=c||y<0||img[x][y]==-1||img[x][y]!=prev_color) return;
        int a[] = {1,-1,0,0};
        int b[] = {0,0,1,-1};
        img[x][y]=-1;
        for(int i=0;i<4;i++){
            int x1= x+a[i];
            int y1 = y+b[i];
            solve(img,x1,y1);
        }
        img[x][y]=val;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        val = newColor;
        r = image.length;
        if(r==0) return image;
        c = image[0].length;
        prev_color = image[sr][sc];
        solve(image,sr,sc);
        return image;
    }
}
