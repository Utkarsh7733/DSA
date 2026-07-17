class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int j=0,i=0,maxlen=0,key2=0;
         HashMap<Integer,Integer> map = new HashMap<>();
       while(j<n){

        int key = fruits[j];
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else map.put(key,1);

         while(map.size()>2){
                key2=map.get(fruits[i]);
                map.put(fruits[i],key2-1);

                 if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }

                i++;
            }
            j++;
            maxlen=Math.max(maxlen,j-i);
       }   

        return maxlen;
    }
}