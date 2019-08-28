import java.util.ArrayList;
import java.util.List;

public class AddDigits {
    public static void main(String[] args){
        int key = 138;


        while(key >= 10){
            List<Integer> list = new ArrayList<>();
            int i ;
            for(i = key; i >= 10 ;){
                int j =i%10;
                list.add(j);
                i = i/10;
            }
            list.add(i);
            key = 0;
            for (int j = 0 ; j < list.size();j++){
                key = key + list.get(j);
            }

        }
        System.out.println(key);
    }
}
