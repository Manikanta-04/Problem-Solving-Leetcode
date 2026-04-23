class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length-1;
        int pc=0,nc=0;
        int l=0;
        int r=n;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==0) l=mid+1;
            if(nums[mid]>0) r=mid-1;
            else if(nums[mid]<0) l=mid+1;
        }
        if(l==nums.length) pc+=0;
        else pc+=nums.length-l;
        l=0;
        r=n;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==0) r=mid-1;
            if(nums[mid]<0) l=mid+1;
            else if(nums[mid]>0) r=mid-1;
        }
        if(l==0) nc+=0;
        else nc+=l;
        return Math.max(pc,nc);

        
    }
}