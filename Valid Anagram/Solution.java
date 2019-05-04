class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> test = new HashMap<>();
        for(char c: s.toCharArray()){
            if(test.containsKey(c)){
                test.put(c,test.get(c)+1);
            }else{
                test.put(c,1);
            }
        }
        for(char c: t.toCharArray()){
            if(test.containsKey(c)){
                test.put(c,test.get(c)-1);
                if(test.get(c)==0){
                    test.remove(c);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}