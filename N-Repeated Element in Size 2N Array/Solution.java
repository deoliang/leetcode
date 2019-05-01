class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> occur = new HashMap<>();
        int N = A.length/2;
        int test = -1;
        for(int i : A){
            if(occur.containsKey(i)){
                occur.put(i,occur.get(i)+1);
            }else{
                occur.put(i,1);
            }
        }
        Iterator<HashMap.Entry<Integer, Integer>> iter = occur.entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry<Integer, Integer> kv = iter.next();
            if(kv.getValue()==N) return kv.getKey();     
        }
        return -1;
    }
}