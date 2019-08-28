package HomeWork;

import java.util.Scanner;

public class TestLoop2 {
    public static void main(String[] args){
        //九九乘法表
//        for ( int i = 1 ; i <= 9;i++ ){
//            for (int j = 9 ; j >= i ; j--){
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }

//        for(int i = 0 ; i < 5 ; i++){
//            for (int j = 0 ; j < 5 ; j++){
//              if((i+j)%2==0){
//                  System.out.print("*\t");
//              }else {
//                  System.out.print("#\t");
//              }
//            }
//            System.out.println();
//        }


//        for(int i = 100 ,j=1; i <=150 ;i++){
//            if(i%3==0){
//                continue;
//            }
//            System.out.print(i+"、");
//            if(j%5==0){
//                System.out.println();
//            }
//            j++;
//        }


        //薪水计算器
//        boolean str = true;
//        Scanner scanner = new Scanner(System.in);
//        while (str){
//
//            int xinshui  = 0;
//            int nianshu = 0;
//
//                System.out.println("请输入月薪");
//                String key = scanner.nextLine();
//                if(key.equals("exit") ){
//                    System.out.println("已退出");
//                    str = false;
//                    break;
//                }
//                if (key.equals("next")){
//                    System.out.println("下一位");
//                    continue;
//                }
//                xinshui = Integer.parseInt(key);
//
//                System.out.println("请输入每年几个月薪水");
//                 key = scanner.nextLine();
//                if(key.equals("exit") ){
//                    System.out.println("已退出");
//                    str = false;
//                    break;
//                }
//                if (key.equals("next")){
//                    System.out.println("下一位");
//                    continue;
//                }
//                nianshu = Integer.parseInt(key);
//                System.out.println("您的年薪为："+(nianshu*xinshui)+"\n\n");
//        }


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("请输入月薪");
            int salary = scanner.nextInt();
            int taxes = 0;
            if(salary <= 5000){
                taxes = 0;
            }else if(salary<=8000){
                taxes = (int)((salary-5000)*0.03);
            }else if(salary <= 17000){
                taxes = (int)((salary-8000)*0.1)+90;
            }else if(salary <= 30000){
                taxes = (int)((salary-17000)*0.2)+90+900;
            }else if(salary <= 40000){
                taxes = (int)((salary-8000)*0.25)+90+900+2600;
            }else if(salary <= 60000){
                taxes = (int)((salary-8000)*0.3)+90+900+2600+2500;
            }else if(salary <= 85000){
                taxes = (int)((salary-8000)*0.35)+90+900+2600+2500+6000;
            }else {
                taxes = (int)((salary-8000)*0.45)+90+900+2600+2500+6000+8750;
            }
            System.out.println(taxes);
        }





    }
}
