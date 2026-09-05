class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
         if(map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
            return num;
         }
         else map.put(num, 1);
       } 
       return 534;
    }
}