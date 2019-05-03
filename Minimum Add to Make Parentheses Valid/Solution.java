class Solution {
    public int minAddToMakeValid(String S) {
        int left = 0;
        int right = 0;
        for (char c: S.toCharArray()){
            if(c=='('){
                left++;
            }else if(c==')'){
                right++;
                if(left!=0) {
                    left--;
                    right--;
                }
            }
        }
        return left+right;
    }
}