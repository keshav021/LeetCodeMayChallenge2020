class Solution {
    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        double val = Math.pow(2,len) -1;
        return (int)(val) - num;
    }
}
