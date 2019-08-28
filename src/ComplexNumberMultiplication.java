public class ComplexNumberMultiplication {
    /**
     *
     * @param args
     * 给定两个表示复数的字符串。
     *
     * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
     *
     * 示例 1:
     *
     *  输入: "1+1i", "1+1i"
     *  输出: "0+2i"
     *  解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
     * 示例 2:
     *
     *  输入: "1+-1i", "1+-1i"
     *  输出: "0+-2i"
     *  解释: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
     *
     */
    public static void main(String[] args){

        String a = "1+-1i";
        String b = "0+0i";
        String resault = null;
        int[] a1 = new int[]{ Integer.parseInt(a.split("\\+")[0]),Integer.parseInt(a.split("\\+")[1].split("i")[0])};
        int[] a2 = new int[]{Integer.parseInt(b.split("\\+")[0]),Integer.parseInt(b.split("\\+")[1].split("i")[0])};
        for (int i :a1){
            System.out.println(i);
        }
        for (int j :a2){
            System.out.println(j);
        }
        for (String i :a.split("\\+|i")){
            System.out.println(i);
        }
        resault = ""+(a1[0]*a2[0]+a1[1]*a2[1]*(-1))+"+"+(a1[0]*a2[1]+a1[1]*a2[0])+"i";
        System.out.println(resault);
    }
}
