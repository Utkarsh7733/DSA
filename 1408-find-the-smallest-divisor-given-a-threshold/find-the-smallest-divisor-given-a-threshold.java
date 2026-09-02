class Solution {

    public int smallestDivisor(int[] nums, int t) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max = nums[i];
        }
        int low=1,high=max,d=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
               if(nums[i]%mid==0) sum+=nums[i]/mid;
               else sum+=nums[i]/mid+1;
            }
            if(sum<=t){
                d=mid;
                high = mid-1;
            } 
            else low=mid+1;
        }
        return d;
    }
}