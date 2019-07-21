class Solution {
    public void sortColors(int[] nums) {
        int [] colors = new int[3];
        for(int i:nums){
            switch(i){
                case 0:
                    colors[0]++;
                    break;
                case 1:
                    colors[1]++;
                    break;
                case 2:
                    colors[2]++;
                    break;
            }
        }
        int num = 0;
        int index = 0;
        for(int k:colors){
            while(k>0){
                nums[index++] = num;
                k--;
            }
            num++;
        }
    }
}