import java.util.Scanner;
public class TestOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double x = 3.14;
        int nx = (int)x;
        char c = 'a';
        int d = c + 1;
        System.out.println(nx);
        System.out.println(d);
        System.out.println((char)d);
        System.out.println(str);
    }
}
