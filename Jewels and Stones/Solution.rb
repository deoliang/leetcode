# @param {String} j
# @param {String} s
# @return {Integer}
def num_jewels_in_stones(j, s)
    count = 0
    s.split("").each {|i|
        count+=1 if j.include?(i)    
    }
    return count
end
