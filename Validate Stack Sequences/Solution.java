class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> test = new Stack<>();
        int pop_index = 0;
        for(int x: pushed){
            test.push(x);
            while(!test.empty()){
                if(popped[pop_index]==test.peek()){
                    test.pop();
                    pop_index++;
                }else{
                    break;
                }
            }
        } 
        for(int i = pop_index;i<popped.length;i++){
            if(popped[i]==test.peek()){
                test.pop();
            }else{
                return false;
            }
        }
        return test.empty();
    }
}