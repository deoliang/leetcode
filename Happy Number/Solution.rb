# @param {Integer} n
# @return {Boolean}
def is_happy(n)
    seen_sum = Set.new
    sum = 0
    
    while sum!=1
        str = n.to_s.split("")
        str.each {|i|
           sum += i.to_i**2
        }
        if (sum==1)  
            return true 
        elsif(seen_sum.include?(sum)) 
            return false 
        else seen_sum.add(sum)
        end
        n=sum
        sum =0
    end
end