class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set = new HashSet<>();
         if(s.equals("")) return 0;
         int freq=0,i=0,j=0;
         int max = Integer.MIN_VALUE;
         while(j<s.length()){
            char ch = s.charAt(j);
            if(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            else {
                set.add(ch);
                max = Math.max(max,j-i+1);
                j++;
            }
         }
       return max;
    }
}