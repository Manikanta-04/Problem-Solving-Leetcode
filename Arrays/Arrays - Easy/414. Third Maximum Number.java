class Solution {
    public int thirdMax(int[] nums) {
     int n=nums.length;
     if(n==1) return nums[0];
     if(n==2) return Math.max(nums[0],nums[1]);
     long m1=Long.MIN_VALUE;
     long m2=Long.MIN_VALUE;
     long m3=Long.MIN_VALUE;
     for(int i : nums){
        if(i==m1 || i==m2 || i==m3 ) continue;
        else if(i >m1){
            m3=m2;
            m2=m1;
            m1=i;
        }
        else if(i >m2){
            m3=m2;
            m2=i;
        }
        else if(i>m3){
            m3=i;
        }
     }
     if(m3==Long.MIN_VALUE){
        return (int) m1;
     }
     return (int) m3;



    }
}