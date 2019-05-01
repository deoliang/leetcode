# @param {String[]} words
# @return {Integer}
def unique_morse_representations(words)
    code = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    count = 0
    trans = Set.new
    temp = ""
    words.each {|w|
        w.each_byte{|i|
            temp+=code[i-97]   
        }
        if(!trans.include?(temp))
            count +=1
            trans.add(temp)
        end
        temp = ""
    }
    return count
end