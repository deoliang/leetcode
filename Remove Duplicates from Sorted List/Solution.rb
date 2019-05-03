# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @return {ListNode}
def delete_duplicates(head)
    move = head
    while (move!=nil && move.next != nil)
        if(move.val==move.next.val)
            move.next=move.next.next
        else
            move = move.next
        end
    end
    return head
end