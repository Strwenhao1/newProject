package HomeWork;

public class TestCar extends Car{
    public static void main(String[] args){
        Car c = new Car();
        System.out.println("我叫"+c.name);
        System.out.println("我有"+c.boli+"块玻璃");
        System.out.println("我有"+c.chelun+"个轮子");
        c.Carpao();
    }

}
