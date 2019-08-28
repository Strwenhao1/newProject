import java.util.ArrayList;
import java.util.List;

public class SelfDivideNumber {
    public static void main(String[] args){
        int left = 1 ;
        int right  = 22;
        List<Integer> nums = new ArrayList();

        for(int i = left ; i <+ right ;i++){
            int count = i;
            int p = 0 ;
            int q = 0 ;
            for(int j = i;j > 0;j=j/10){
                if(((j%10)!=0)&&(i%(j%10)==0)){
                    p++;
                }
                q++;

            }
            if(p==q){
                nums.add(i);
            }
        }
        nums.add(right);

    }
}



