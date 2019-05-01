# @param {String} s
# @return {String}
def reverse_words(s)
    words = s.strip.split(/\s+/)
    build = ""
    i=0
    words.reverse_each{|w|
        build +=w
        build+= " " unless i==words.length-1
        i+=1
    }
    return build
end