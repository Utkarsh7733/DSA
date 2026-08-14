class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<digits.length;i++){
        int value = digits[i];
        if(map.containsKey(value)) {
              freq = map.get(value);
             map.put(value,freq+1);
        }
        else map.put(value,1);
       }

       int a=0,b=0,c=0;
       for(int i=100;i<1000;i+=2){
        int x=i;
        c=x%10; x/=10; b=x%10; x/=10; a=x;
        if(map.containsKey(a)){
            int afreq=map.get(a);
            map.put(a,afreq-1);
            if(afreq==1) map.remove(a);
            if(map.containsKey(b)){
            int bfreq=map.get(b);
            map.put(b,bfreq-1);
            if(bfreq==1) map.remove(b);
            if(map.containsKey(c)){
             int cfreq=map.get(c);
             map.put(c,cfreq-1);
             if(cfreq==1) map.remove(c);
            list.add(i);
            map.put(c,cfreq);
                }
                map.put(b,bfreq);
            }
            map.put(a,afreq);
        }
       }
        int arr[]= new int[list.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
}