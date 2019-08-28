public class TestJishu {
    public static  void main(String[] args){
        int[] heights = new int[]{1,1,4,2,1,3};
        int[] arr = new int[100];
        for(int height : heights){
            arr[height]++;
        }
        for(int i = 0 ;i < 6;i++){
            System.out.println(arr[i]);
        }
        int count = 0 ;
        for (int i = 1,j=0;i < arr.length;i++){
            while (arr[i]-- >0){
                if(heights[j++]!=i)
                    count++;
            }
        }

        System.out.println(count);
    }
}

