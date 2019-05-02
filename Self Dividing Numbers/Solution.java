class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivList = new ArrayList<>();
        boolean divisibleAll = true;
        for(int i=left;i<=right;i++){
            String iter = Integer.toString(i);
            for(char c:iter.toCharArray()){
               int test = Character.getNumericValue(c);
               if(test==0||i%test!=0){
                   divisibleAll = false;
                   break;
               }
            }
            if(divisibleAll){
                selfDivList.add(i);
            }
            divisibleAll = true;
        }
        return selfDivList;
    }
}