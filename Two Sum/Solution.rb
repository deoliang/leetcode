# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    differences = Hash.new
    i=0
    nums.each {|n|
       dif = target - n
       if(differences.has_key?(dif))
           return [differences.fetch(dif),i]
       end
       differences[nums[i]] = i
       i+=1
    }
end