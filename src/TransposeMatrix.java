public class TransposeMatrix {
    /*
    给定一个矩阵 A， 返回 A 的转置矩阵。
    矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
    示例 1：
        输入：[[1,2,3],[4,5,6],[7,8,9]]
        输出：[[1,4,7],[2,5,8],[3,6,9]]
    示例 2：
        输入：[[1,2,3],[4,5,6]]
        输出：[[1,4],[2,5],[3,6]]
     */
    public static void main(String[] args){
        int[][] A = new int[][]{{1,2,3},{4,5,6}};
            int[][] B = new int[A[0].length][A.length];
            for (int p = 0;p<A[0].length;p++){
                for (int q = 0 ; q < A.length; q++){
                    B[p][q] =  A[q][p];
                }
            }
//        System.out.print(A[0][0]);
        for ( int i = 0 ; i < B.length;i++){
            for(int j = 0 ; j < B[0].length;j++){
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
//        123   369
//        456   258
//        789   147

    }
}
