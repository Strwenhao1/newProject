package HomeWork;

public class SxtStu {
    int id;
    String sname;
    int age;
    void study(){
        System.out.println("我正在学习，正在敲代码，正在听课！！！！不要打扰我学习");
    }
    SxtStu(){

    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "高淇";
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.study();
        System.out.println("==============");
        SxtStu s2 = new SxtStu();
        s2.id = 1002;
        s2.sname = "张三";
        s2.study();

    }
}
