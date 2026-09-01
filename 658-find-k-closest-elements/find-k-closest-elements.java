class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>(); 
        int low = 0;
        int high = arr.length - 1;
        int lb = arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                list.add(arr[i]);
            }
            Collections.sort(list);
            return list;
        }
        if(x>arr[arr.length-1]){
            for(int i=arr.length-1;i>=arr.length-k;i--){
                list.add(arr[i]);
            }
            Collections.sort(list);
            return list;
        }
         while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x){
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else low = mid+1;
        }
        int i = lb-1,j=lb;
       while(k>0 && i>=0 && j<arr.length){
        int di = Math.abs(x-arr[i]);
        int dj = Math.abs(x-arr[j]);
        if(di<=dj){
            list.add(arr[i]);
            i--;
        }
        else{
            list.add(arr[j]);
            j++;
        }
        k--;
       }
      while(i<0 && k>0){
        list.add(arr[j]);
        j++;
        k--;
      }
      while(j>=arr.length && k>0){
        list.add(arr[i]);
        i--;
        k--;
      }
      Collections.sort(list);
       return list;
    }
}