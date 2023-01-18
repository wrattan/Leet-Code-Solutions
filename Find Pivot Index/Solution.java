class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i=0; i <nums.length;i++){
            total+= nums[i];
        }

        int lh = 0;

        for(int i=0; i<nums.length;i++){
            if(i!=0){
                lh += nums[i-1];
            }
            if(total - lh - nums[i] == lh){
                return i;
            }
        }
        return -1;
    }
}