# @param {Integer[]} a
# @return {Integer[]}
def sort_array_by_parity(a)
    even = Array.new
    odd = Array.new
    a.each {|i|
        if i%2==0
            even.push(i)
        else
            odd.push(i)
        end
    }
    return even.concat(odd)
end