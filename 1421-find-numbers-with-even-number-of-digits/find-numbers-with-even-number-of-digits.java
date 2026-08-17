class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i=0;i<nums.length;i++){
            if(isEvenDigited(nums[i])) evenCount++;
        }
        return nums.length - evenCount;
    }

    static boolean isEvenDigited(int n){
        int count = 0;
        while(n/10 != 0 ){
            n = n/10;
            count++;
        }
        if(count %2 == 0){
            return true;
        }
        return false;
    }
}