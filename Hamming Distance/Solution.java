class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0;
        String bin = Integer.toBinaryString(x^y);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                dist++;
            }
        }
        return dist;
    }
}