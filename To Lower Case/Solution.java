class Solution {
    public String toLowerCase(String str) {
        char [] manip = str.toCharArray();
        for(int i=0;i<manip.length;i++){
            if((int)manip[i]<91&&(int)manip[i]>64){
                manip[i]+=32;
            }else{
                continue;
            }
        }
        return String.valueOf(manip);
    }
}