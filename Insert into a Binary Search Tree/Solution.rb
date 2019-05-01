# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Integer} val
# @return {TreeNode}
def insert_into_bst(root, val)
    saveroot = root
    until root==nil
        if(root.val<val)
            if(root.right==nil)
                root.right= TreeNode.new(val)
                break
            else
                root = root.right
            end
        else
            if root.left==nil
                root.left = TreeNode.new(val)
                break
            else
                root = root.left
            end
        end
    end
    return saveroot
end