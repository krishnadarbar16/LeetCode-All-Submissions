class Solution {
    public int[] resultArray(int[] nums) {
        
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        
        int j = 0;
        int k=0;

        arr1[j] = nums[0];
        arr2[k] = nums[1];
        
        for(int i = 2;i<nums.length;i++){
            if(arr1[j]>arr2[k]){
                arr1[++j] = nums[i];
            }else{
                arr2[++k] = nums[i];
            }
        }

        int[] result = new int[nums.length];
        int i;
        for(i=0;i<nums.length;i++){
            if(arr1[i] != 0){
                result[i] = arr1[i]; 
            }else{
                break;
            }
        }
        for(int l=0;l<nums.length;l++){
            if(arr2[l]!=0){
                result[i] = arr2[l];
                i++; 
            }else{
                break;
            }
        }
        return result;
    }
}