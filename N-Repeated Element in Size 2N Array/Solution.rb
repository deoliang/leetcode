# @param {Integer[]} a
# @return {Integer}
def repeated_n_times(a)
    occur = Hash.new(0)
    n =  a.length/2
    a.each {|i|
        occur[i] +=1
    }
    occur.each {|k,v|
        return k if v==n
    } 
end