/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg=0;
        int end = n;
        int mid = beg+(end-beg)/2;
        while(beg<end){
            boolean ans = isBadVersion(mid);
            if(ans){
                end=mid;
            }
            else{
                beg=mid+1;
            }
            mid = beg+(end-beg)/2;
        }
        return beg;
    }
}
