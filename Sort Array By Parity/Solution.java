class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i: A){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        even.addAll(odd);
        return even.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}