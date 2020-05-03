class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals(magazine)) return true;
        if(magazine.length()<ransomNote.length()) return false;
        char a[] = ransomNote.toCharArray();
        char b[] = magazine.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<b.length;i++){
            if(!hm.containsKey(b[i])){
                hm.put(b[i],1);
            }
            else{
                int count = hm.get(b[i]);
                hm.put(b[i],count+1);
            }
        }
        for(int i=0;i<a.length;i++){
            if( !hm.containsKey(a[i]) || hm.get(a[i])==0 ){
                return false;
            }
            else{
                int count =  hm.get(a[i]);
                hm.put(a[i],count-1);
            }
        }
        return true;
    }
}
