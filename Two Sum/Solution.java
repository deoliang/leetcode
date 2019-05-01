class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(hm.containsKey(diff)){
                int [] a = new int[2];
                a[0]=hm.get(diff);
                a[1]=i;
                return a;
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}