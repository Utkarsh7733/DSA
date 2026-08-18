class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i] = arr[i] % k;
            if(arr[i]<0) arr[i]+=k;
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
         for(int i=0;i<n;i++){
            int ele = arr[i];
            if(map1.containsKey(ele)){
                freq = map1.get(ele);
                map1.put(ele,freq+1);
            }
            else map1.put(ele,1);
         }
         
       if(map1.containsKey(0)){
        if(map1.get(0)%2 != 0) return false;
        map1.remove(0);
       }

         for(int key :map1.keySet()){
            int rem = k - key;
            if(!map1.containsKey(rem)) return false;
            int value1 = map1.get(rem);
            int value2 = map1.get(key);
            if(value1!=value2) return false;
         }
         return true;

    }
}