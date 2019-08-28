package HomeWork;

public class TestFuction {
    public static int late(int lateTime , double salary){
        int fakuan = 0 ;
        if (lateTime <=10){
            System.out.println("您已迟到，请下次注意");
        }else if (lateTime<=20){
            fakuan  = 100;
        }else if (lateTime<=30){
            fakuan = 200;
        }else if (lateTime<=60){
            fakuan = (int)(salary/21.5*2);
        }else {
            fakuan = (int)(salary*2/21.5);
        }
        System.out.println("罚款："+fakuan+"元");
        return fakuan;
    }
    public static void main(String[] args) {
        late(80,21000);
    }
}
