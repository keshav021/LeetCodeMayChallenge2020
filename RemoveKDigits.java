class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if(len==k){
            return "0";
        }
        
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<len){
            char temp = num.charAt(i);
            while(k>0 && !st.isEmpty() && st.peek() > temp  ){
                k--;
                st.pop();
            }
            st.push(temp);
            i++;
        }
        while(k>0){
            k--;
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append( st.pop() );
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
