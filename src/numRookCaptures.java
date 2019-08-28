public class numRookCaptures {
    /**
     *
     * @param args
     * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
     *
     * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
     *
     * 返回车能够在一次移动中捕获到的卒的数量。
     *  详情见：https://leetcode-cn.com/problems/available-captures-for-rook/
     */
    public static void main(String[] args){
        char[][] board = new char[][]{
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
//        System.out.println(board.length);

//
//        int count = 0;
//        System.out.println("x: "+x+"\ny: "+y);
//        for (int i = 0 ; i < board[0].length ; i++){
//            int j= 10 , q = 10  ;
//            if(board[x][i]=='p'){
//                j=i;
//            }
//            if(board[x][i]=='B'){
//                q=i;
//            }
//
//        }
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if (board[i][j]=='R'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        String key = "";
        for (char j :board[x]){
            key += j;

        }
        for (int p=0 ; p < board[x].length;p++){
            key += board[p][y];
        }
        System.out.println(x);
        System.out.println(key.substring(8,16).indexOf("p"));

//        if((key.substring(0,8).indexOf("p")>y)&&(key.substring(0,8).indexOf("B")))
    }
}
