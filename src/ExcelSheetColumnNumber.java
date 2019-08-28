public class ExcelSheetColumnNumber {
    public static void main(String[] args){
        String s = "ZZZ";

        int[] weizhi = new int[s.length()];
        for (int i = 0 ; i < s.length();i++){
            weizhi[i] = s.charAt(i)-64;

        }
        int count = 0;
        for (int j = 0 ; j < weizhi.length ; j++){
            count += weizhi[j]*Math.pow(26,s.length()-j-1);
        }
        System.out.println(count);
    }
}
