package HomeWork;

/**
 *
 * 年利率  lilv
 */
public class TestHome {
    public static double daikuan(int jine, int nianfen){
        double lilv = 0.0;
        if(nianfen>=40){
            lilv = 1.0135;
        }else if(nianfen >=30){
            lilv = 1.0145;
        }else if(nianfen >= 20){
            lilv = 1.0155;
        }else {
            lilv = 1.018;
        }
        return lilv;
    }
    public static void main(String[] args) {
        int x = 5000000;
        int y = 30;
        double lilv = daikuan(x,y);
        System.out.println("假如你贷款："+x+"元，你需要每年还："+((lilv-1)*x+x/30));
        System.out.println("你总计需要还："+((lilv-1)*x+x/30)*30);
    }
}
