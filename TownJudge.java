class Solution {
    public int findJudge(int n, int[][] trust) {
        int a[] = new int[n+1]; //Total no of trusts on person i
        int b[] = new int[n+1]; // People that person i trusts
        int r = trust.length;
        
        for(int i=0;i<r;i++){
            a[ trust[i][1] ]++;
            b[ trust[i][0]]++;
        }
        for(int i=1;i<=n;i++){
            if(a[i]==n-1 && b[i]==0) return i;
        }
        return -1;
    }
}
