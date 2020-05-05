class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        char c[] = s.toCharArray();
        int n = c.length;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(c[i])){
                hm.put(c[i],1);
            }
            else{
                int count = hm.get(c[i]);
                hm.put(c[i],count+1);
            }
        }
        int ans =-1;
        for(int i=0;i<n;i++){
            if(hm.get(c[i])==1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
