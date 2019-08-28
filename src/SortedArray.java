public class SortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        // 123000
        //256
        int tab = 0;
        for (int j = 0 ; j < n; j++){
            for (int i = tab ; i < m+n ;i++){
                if(nums1[i]>nums2[j]){
                    int tmp = 0;
                    tmp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = tmp;
                    tab = i+1;

                    break;
                }
            }
        }
    }
}
