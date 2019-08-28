public class SortArray {
    /*
        给定一个非负整数数组A,A中一半整数是奇数，一半数是偶数。
        对数组进行排序，以便当A[i]为奇书时，i也是奇数；当A[i]为偶数时
        ，i也是偶数
        示例：
            输入：[4,2,5,7]
            输出：[4,5,2,7]
            解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
     */
    public static void main(String[] args){
        int[] A = new int[]{4,2,5,7};
        for (int i = 0 ;i < A.length;i++){

            if((i==0)||(i%2==0)){
                for (int j = i ; j < A.length; j++){
                    if(A[j]==0||A[j]%2==0){
                        int tmp;
                        tmp = A[i];
                        A[i] = A[j];
                        A[j] = tmp;
                        break;
                    }
                }

            }else {
                for (int j = i ; j < A.length; j++){
                    if(A[j]!=0&&A[j]%2!=0){
                        int tmp;
                        tmp = A[i];
                        A[i] = A[j];
                        A[j] = tmp;
                        break;
                    }

                }

            }
        }
        for(int a:A){
            System.out.println(a);
        }
    }
}
