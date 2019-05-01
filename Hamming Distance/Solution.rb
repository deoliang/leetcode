# @param {Integer} x
# @param {Integer} y
# @return {Integer}
def hamming_distance(x, y)
    dist = (x^y).to_s(2)
    count  = 0
    dist.each_char {|c|
           count +=1 if c == '1'      
    }
    return count
end