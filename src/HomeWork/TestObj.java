package HomeWork;
class Cla{
    String clas;
}
public class TestObj {

        int id;
        String name;
        int age;
        Cla cla;
    void study(){
        System.out.println("I am Learing");
    }
    TestObj(){
        System.out.println("I am a student");
        }


    public static void main(String[] args) {
        Cla cla = new Cla();
        cla.clas = "一年级二班";
        TestObj s = new TestObj();
        s.id = 1001;
        s.name = "李小明";
        s.age = 18;
        s.cla = cla;
        System.out.println("我叫"+s.name);
        System.out.println("我"+s.age+"岁");
        System.out.println("我的id是"+s.id+"号");
        System.out.println("我的班级是"+s.cla.clas);
    }
}
