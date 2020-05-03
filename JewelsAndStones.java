class Solution {
    public int numJewelsInStones(String J, String S) {
        int a[] = new int[256];
        int len = S.length();
        for(int i=0;i<len;i++){
            a[S.charAt(i)-'0']++;
        }
        int ans = 0;
        for(int i=0;i<J.length();i++){
            ans = ans + a[J.charAt(i)-'0'];
        }
        return ans;
    }
}
