class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;

            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {

            arr[k] = nums2[j];
            j++;
            k++;
        }
        if((n+m)%2 == 0){
            return (arr[(n+m)/2] + arr[((n+m)/2) - 1])/2.0 ;
        }

        return arr[(n+m)/2];
    }
}