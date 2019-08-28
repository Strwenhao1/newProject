import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public static void main(String[]  args){
      //        System.out.println(morse.length);
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        int p =uniqueMorseRepresentations(words);
        System.out.println(p);
    }

        public static int uniqueMorseRepresentations(String[] words) {
            final String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            Set<String> set = new HashSet<>();
            for(int i = 0 ; i < words.length;i++){
                String str = "";
                for (int j = 0 ;j < words[i].length();j++){
                    int c = words[i].charAt(j)-97;
                    str = str.concat(morse[c]);
                }
                set.add(str);
            }
                return set.size();
        }

}
