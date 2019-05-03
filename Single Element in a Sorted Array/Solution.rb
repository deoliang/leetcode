# @param {Integer[]} nums
# @return {Integer}
def single_non_duplicate(nums)
    return nums[0] if nums.length==1
    for i in (0..nums.length-1).step(2)
        return nums[i] if (i+1==nums.length)
        return nums[i] if(nums[i]!=nums[i+1])
    end
    return -1
end