class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length,i=0,j=0,size=0,zero=0;
        while(j<n){
            if(nums[j]==0) zero++;
            if(zero>k){
                if(nums[i]==0) zero--;
                i++; 
            }
            size=Math.max(size,j-i+1);
            j++;
        }
        return size;
    }
}