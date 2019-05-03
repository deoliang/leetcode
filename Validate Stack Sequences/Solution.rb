# @param {Integer[]} pushed
# @param {Integer[]} popped
# @return {Boolean}
def validate_stack_sequences(pushed, popped)
    test = Array.new
    pop_index = 0
    pushed.each{|i|
        test.push(i)
        until test.empty?
            if (popped[pop_index]==test.last)
                test.pop()
                pop_index+=1
            else
                break
            end
        end
    }
    for i in pop_index...popped.length
        if (popped[pop_index]==test.last)
                test.pop()
        else
            return false
        end
    end
    return test.empty?
end