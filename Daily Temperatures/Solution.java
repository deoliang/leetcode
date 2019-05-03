class Solution {
    public int[] dailyTemperatures(int[] T) {
        int [] days = new int[T.length];
        int numDays = 0;
        for(int i=0;i<T.length;i++){
            int temp = T[i];
            if(i+1!=T.length){
                for(int j=i+1;j<T.length;j++){
                    numDays++;
                    if(T[j]>temp){
                        days[i] = numDays;
                        break;
                    }
                    
                }
            }else{
                days[i] = 0;
            }
            numDays =0;
        }
        return days;
    }
}