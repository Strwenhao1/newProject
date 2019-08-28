public class FeiBo {
    /*
    斐波那契数
        通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：

        F(0) = 0,   F(1) = 1
        F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
        给定 N，计算 F(N)。



     */
    public static void main(String[] args){

        //斐波那契数 最常规的做法：递归   但是由于递归重复计算过多 所以在很多情况下都要进行优化或者 选择其它方法
        //  动态规划 新建两个
        int x0 = 0;
        int x1 = 1;
        int x= 0 ;
        for (int i = 0 ; i < 14 ; i++){
            x=x1;
            x1 = x0 + x1;
            x0 = x;
        }
        System.out.println(x1);
    }

    public static int feibo(int x ){
        if(x==2||x==1){
            return 1;
        }
        int p ,q;
        p = feibo(x-1);
        q = feibo(x-2);
        return p+q;
    }
}
