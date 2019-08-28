package HomeWork;

public class TestForAndWhile {

    public static void main(String[] args) {

        // 10 - 15 中的随机数
//        int i = (int)(Math.random()*6+10);
//        System.out.println(i);

//        骰子游戏
//
//          int i = (int)(6*Math.random())+1;
//          int j = (int)(6*Math.random()+1);
//          int k = (int)(6*Math.random()+1);
//          int count = i + j + k;
//          System.out.println(count);
//          if(count > 15){
//              System.out.println("今天手气不错");
//          }
//          if (count >= 10 && count <=15){
//              System.out.println("今天手气一般");
//
//          }
//          if ( count < 10 ){
//              System.out.println("今天手气不怎么样");
//          }

//            if-else 双分支结构

//            double r = 4 * Math.random();
//            double area = Math.PI*Math.pow(r,2);
//            double circle = 2*Math.PI*r;
//            System.out.println("半径为： "+r);
//            System.out.println("周长为： "+circle);
//            System.out.println("面积为： "+area);
//            if ( area >= circle){
//                System.out.println("面积大于周长");
//            }else {
//                System.out.println("周长大于面积");
//            }

//        生成0-120之间随机的年龄，然后根据不同年龄输出相应的状态
//
//        int age = (int)(121*Math.random());
//        System.out.print("年龄是" + age + "， 属于");
//        if (age < 15) {
//            System.out.println("儿童， 喜欢玩！");
//        } else if (age < 35) {
//            System.out.println("青年， 要学习！");
//        } else if (age < 55) {
//            System.out.println("中年， 要工作！");
//        } else if (age < 75) {
//            System.out.println("中老年， 要补钙！");
//        } else if (age < 85) {
//            System.out.println("老年， 多运动！");
//        } else {
//            System.out.println("老寿星， 古来稀！");
//        }

        //生成[0,100]之间的分数。如果90以上(含90)则输出“A+”，如果80-89输出“A”，如果70-79输出“B”,60-69之间“C”，60以下是“D”。
//            int course = (int) (101*Math.random());
//
//            if (course >= 90){
//                System.out.println("A+");
//            }else if(course >= 80){
//                System.out.println("A");
//            }else if (course >= 70){
//                System.out.println("B");
//            }else if (course >= 60){
//                System.out.println("C");
//            }else {
//                System.out.println("D");
//            }
//
        //使用while循环：计算1-100之间所有数字的和，所有偶数的和，所有奇数的和

//        int i = 1 ;
//        int sum1 = 0; //所有数的和
//        int sum2 = 0; //所有偶数的和
//        int sum3 = 0; //所有奇数的和
//        while (i <= 100){
//            sum1 = sum1 + i ;
//            sum2 = sum2 + ((i%2==0)?i:0);
//            sum3 = sum3 + ((i%2==1)?i:0);
//            i++;
//        }
//        System.out.println("所有数的和："+sum1);
//        System.out.println("所有偶数的和："+sum2);
//        System.out.println("所有奇数的和："+sum3);

        //使用while 循环0-120之间的数字，打印能被5整除

//        int i = 0 ;
//        while (i <= 120){
//            if (i%5==0){
//                System.out.println(i);
//            }
//            i++;
//        }


        //使用while 循环0-130之间的数字，每行显示7个

//        int i = 0 ;
//        while(i <= 130){
//            System.out.print("a="+i+"\t");
//            if((i+1)%7==0){
//                System.out.println();
//            }
//            i++;
//        }

        //使用for 循环 倒序打印1-100间的数字
//        for (int i = 100; i > 0 ; i--){
//            System.out.println(i);
//        }

        //使用for循环打印从a-z之间的字母
//        for (int i = 97 ;i <97+26 ; i++){
//            System.out.println((char)i);
//        }



        //使用for循环 计算1-100 之间所有数字的和  所有偶数的和  所有奇数的和
//        int sum1 = 0 ;
//        int sum2 = 0 ;
//        int sum3 = 0 ;
//
//        for (int i = 0 ; i <= 100 ; i++){
//            sum1 += i;
//            sum2 += (i%2==0)?i:0;
//            sum3 += (i%2==1)?i:0;
//        }
//        System.out.println("所有数的和："+sum1);
//        System.out.println("所有偶数的和："+sum2);
//        System.out.println("所有奇数的和："+sum3);

        //使用for循环 0-120 之间的数字，打印出能被5整除的数字
//        for(int i = 0 ; i <= 120 ; i++){
//            if (i%5==0){
//                System.out.println(i);
//            }
//        }

        //使用for循环 0-130 之间数字，每行显示7个数字

//        for(int i = 0 ; i <= 130 ;i++){
//            System.out.print(i+"\t");
//            if((i+1)%7==0) {
//                System.out.println();
//            }
//        }



    }

}
