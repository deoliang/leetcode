class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> trans = new HashSet <>();
        int count  = 0;
        String temp = "";
        for(String word: words){
            for(int i=0;i<word.length();i++){
                temp+=code[word.charAt(i)-'a'];
            }
            if(!trans.contains(temp)){
                count++;
                trans.add(temp);
            }
            temp="";
            
        }
        return count;
    }
}