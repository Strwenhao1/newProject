public class ShortestDistance {
    public static void main(String[] args){
        String S = "aaba";
        char C = 'e';
        int[] key = new int[S.length()];
        for (int p= 0 ;p < key.length;p++){
            key[p]=10000;
        }
        for (int i = 0 ; i < S.length();i++){
            for(int j = i;j < S.length();j++){
                if(S.charAt(j)=='b'){
                    key[i] = j-i;
                    break;
                }
            }
        }
        for(int i = S.length()-1;i>=0;i--){
            for(int j = i;j>=0;j--){
                if(S.charAt(j)=='b'&&(key[i]>i-j)){
                    key[i] = i-j;
                    break;
                }
            }
        }

        for(int p:key){
            System.out.println(p);
        }
    }
}
