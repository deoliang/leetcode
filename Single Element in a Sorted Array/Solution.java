class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<=nums.length-1;i+=2){
          if((i+1)==nums.length){ 
              return nums[i];
          }else if(nums[i]!=nums[i+1]){
              return nums[i];
          }
        }
        return -1;
    }
}