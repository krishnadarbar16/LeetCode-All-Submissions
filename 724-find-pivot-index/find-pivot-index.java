class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        
        for(int  i=0;i<nums.length;i++){
            int sumRight = 0;

            for(int j=i+1;j<nums.length;j++){
                sumRight += nums[j];
            }     

            if(sumLeft == sumRight){
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}