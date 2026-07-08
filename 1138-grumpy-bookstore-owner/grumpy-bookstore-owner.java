class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxSum=0,n=grumpy.length;
        for(int i=0;i<=n-minutes;i++){
            int sum=0;
            for(int j=i;j<i+minutes;j++){
                if(grumpy[j]==1)
                    sum+=customers[j];
                }
            maxSum=Math.max(maxSum,sum);
        }
        for(int i=0;i<n;i++){
            if(grumpy[i]==0) maxSum+=customers[i];
        }
        return maxSum;
    }
}