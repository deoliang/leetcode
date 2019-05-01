public class Solution {
    public String reverseWords(String s) {
       String [] words = s.trim().split("\\s+");
        String build = "";
        for(int i=words.length-1;i>=0;i--){
            build+=words[i];
            if(i>0){
            build+=" ";
            }
        }
        return build;
    }
}