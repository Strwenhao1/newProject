import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        switch (c){
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println('b');
                break;
            default:
                System.out.println("cccc");
        }
    }
}
