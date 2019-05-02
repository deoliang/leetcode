# @param {Integer} left
# @param {Integer} right
# @return {Integer[]}
def self_dividing_numbers(left, right)
    selfDivAr = Array.new
    divisibleAll = true
    (left..right).each {|x|
        iter = x.to_s
        iter.each_char{|c|
            test = c.to_i
            if ((test == 0)||(x%test!=0))
                divisibleAll = false
                break
            end
        }
        selfDivAr.push(x) if divisibleAll
        divisibleAll = true
    }
    return selfDivAr
end