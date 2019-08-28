public class Test {
    /*
        给定字符串内有很多正整数，要求对这些正整数进行排序，然后返回
        排序后的字符串
        排序要求：按照每个正整数的后三位数字组成的整数进行比较从小到大排序。
     */
    public static void main(String[] args){
        String str = "1223 16 1016 1016 85965 15625 1568 22 3232 14753 1565 9856";
        String[] key = str.split(" ");
        //设置两个数组第一个数组主要是存放正整数后三位
        //第二个数组是为了在数组1排序的同时  跟随移动
        int[] num  = new int[key.length];
        int[] num1 = new int[key.length];
        for(int i = 0 ; i < key.length;i++){
            num[i] = Integer.parseInt(key[i])%1000;
            num1[i] = Integer.parseInt(key[i]);
        }
        for (int j = 0;j < num.length-1;j++){
           for (int p = j+1 ; p < num.length;p++ ){
               if(num[p]<num[j]){
                   int tmp;
                   tmp = num[p];
                   num[p] = num[j];
                   num[j] = tmp;
                   tmp = num1[p];
                   num1[p] = num1[j];
                   num1[j] = tmp;
               }
            }

        }
        for(int d = 0 ; d < num.length;d++){
            System.out.println(num1[d]);
        }
    }
}
