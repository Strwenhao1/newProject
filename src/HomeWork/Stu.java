package HomeWork;

import java.lang.reflect.Field;

class Computer{
    String brand;
}
class std{
    int id;
    String sname;
    int age ;
    Computer comp;
    void study(){
        System.out.println("我 正在学习！！！我现在使用的电脑是"+comp.brand+"的");
    }
    std(String name){
        System.out.println("我是一个学生");
        System.out.println("我叫"+name);
    }
    std(){

    }
}
public class Stu {

    public static void main(String[] args) throws IllegalAccessException {
        std student = new std("笨蛋");
        student.age = 18;
        Computer coump = new Computer();

        student.comp = coump;
        student.comp.brand = "dell";
        student.study();
        System.out.println(coump.brand);

//        Field[] fields = student.getClass().getDeclaredFields();
//        String[] fileName = new String[fields.length];
//        for (int i = 0 ; i < fields.length;i++){
//            fileName[i] = fields[i].getName();
//            System.out.println(fields[i].get(student));
//        }




    }
}
