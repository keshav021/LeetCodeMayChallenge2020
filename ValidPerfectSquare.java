class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        long n = (long)(num);
        long beg=1;
        long end = n/2;
        long mid=0;
        while(beg<=end){
            mid = beg+(end-beg)/2;
            if(mid*mid==n) return true;
            if(mid*mid<n) beg = mid+1;
            else end = mid-1;
        }
        return false;
    }
}
