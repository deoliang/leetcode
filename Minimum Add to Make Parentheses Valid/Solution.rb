# @param {String} s
# @return {Integer}
def min_add_to_make_valid(s)
    left = 0
    right = 0
    s.each_char {|c|
        if c == '('
            left+=1
        elsif c == ')'
            right+=1
            if left!=0
                left-=1
                right-=1
            end
        end
    }
    return left+right
end