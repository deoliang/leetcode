class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen_sum = new HashSet<Integer>();
        int sum = 0;     
        while(sum!= 1) {
          String str = Integer.toString(n);
          String [] splitStr = str.split("");

          for(int i = 0; i < splitStr.length; i++) {
           Integer aa = new Integer(Integer.parseInt(splitStr[i]));
           sum += (int)(Math.pow(aa.intValue(),2));  
          }
           
          if(sum == 1) {return true;}
          else if(seen_sum.contains(sum))  {return false;}
          else seen_sum.add(sum);
          n = sum;
          sum = 0;
        }

        return false;
    }
}