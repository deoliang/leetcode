class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int index = -1;
        int max = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
                index = i;
            }
        }
        return index;
    }
}