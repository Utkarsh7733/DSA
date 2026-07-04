class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length,count=0;
       for (int i = 0; i < n; i++) {
              int flip = 0;
         for (int j = i; j < n; j++) {
                 if (arr[j] == 0) flip++;
                 if (flip > k) break;
                 count = Math.max(count, j - i + 1);
            }
       }
        return count;
    }
}