class Solution {
    public int[] searchRange(int[] nums, int t) {
         int low=0,high=nums.length-1,lb=nums.length,lb2=Integer.MIN_VALUE;
         int arr []= {-1,-1};
         int ans[] = new int[2];
         boolean flag = false;
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(nums[mid]>=t){
        //        if(nums[mid]==t){
        //         arr[0]=mid;
        //        }
        //         high = mid-1;
        //     }
        //     else low=mid+1;
        // }
        //   low=0; high=nums.length-1;
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(nums[mid]<=t){
        //         if(nums[mid]==t){
        //         arr[1]=mid;
        //         }
        //         low=mid+1;
        //     }
        //     else  high = mid-1;
        // }
        // return arr;

        lb = nums.length;
        // checking if no is present or not 
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==t) {
                flag = true;
                break;
            }
            if(nums[mid]>t)  high = mid-1;
            else if(nums[mid]<t) low = mid+1;
        }
       if(flag == false) return arr;
       // lower bound 
       low=0;
       high=nums.length-1;
       while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]>=t){
            lb = Math.min(lb,mid);
            high = mid-1;
        }
        else low = mid+1;
       }
       ans[0] = lb;
    // upper bound
    low=0;
    high=nums.length-1;
    int ub = nums.length;
     while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]>t){
            ub = Math.min(ub,mid);
            high = mid-1;
        }
        else low = mid+1;
       }
       ans[1] = ub-1;
    return ans;
    }
}