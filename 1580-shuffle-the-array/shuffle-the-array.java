class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[2*n];
        int j = 0;
        for(int i=0;i<n;i++){
            arr[i] = nums[j++];
            arr[++i]=nums[n++];
        }
        return arr;
    }
}