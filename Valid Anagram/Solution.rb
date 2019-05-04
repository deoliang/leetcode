# @param {String} s
# @param {String} t
# @return {Boolean}
def is_anagram(s, t)
    return false if s.length!=t.length
    test = Hash.new(0)
    s.each_char{|c|
        keysym = c.to_sym
        if test.include?(keysym)
            test[keysym]+=1
        else
            test[keysym]=1
        end
    }
     test.each {|k,v|
        puts k
        puts v
    }
    t.each_char{|c|
        keysym = c.to_sym
        if test.include?(keysym)
            test[keysym]-=1
            test.delete(keysym) if(test[keysym]==0)
        else
            return false
        end
    }  
    return true
end