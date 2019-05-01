class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> jewels = new HashSet<>();
        for(int i=0;i<J.length();i++){
            jewels.add(J.charAt(i));
        }
        for(int k=0;k<S.length();k++){
            if(jewels.contains(S.charAt(k))){
                count++;
            }
        }
        return count;
    }
}