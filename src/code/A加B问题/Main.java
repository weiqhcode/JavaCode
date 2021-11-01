/*@Time : 2020/10/26 11:37
 *@Author : 韦佗
 *@File : A加B问题.java
 *@Software : IntelliJ IDEA
 */
package code.A加B问题;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        while(b != 0) {
//            int a1 = a ^ b;
//            int b1 = (a & b) << 1;
//            a = a1;
//            b = b1;
//        }
//        System.out.println(a);



//        int a = input.nextInt();
//
//        System.out.println(a);




//        int a = input.nextInt();
//        if ((a & 1) == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }

//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        int c = a ^ b;
//
//        if (c == 0){
//            return ;
//        }
//
//        c |= c >> 1;
//        c |= c >> 2;
//        c |= c >> 4;
//        c |= c >> 8;
//        c |= c >> 16;
//        c ^= c >> 1;
//
//        int t = a & c;
//
//        t = a?:;
//        System.out.println(t);

//        int m = input.nextInt();
//        int n = input.nextInt();
//        int i=0,k=0;
//        while (m != 0)
//        {
//            if (m>=1<<i)
//            {
//                k+=n<<i;
//                m-=1<<i;
//                i++;
//            }
//            else
//            {
//                i=0;
//            }
//        }
//        System.out.println(k);



        //箱子归位
        //就是一个二维数组，判断1到中间的0有多少位
//        int[][] arr = new int [5][5];
//        for(int i = 0;i <= arr.length-1;i++){
//            for (int j = 0;j <= arr.length-1;j++){
//                int line = input.nextInt();
//                int height = input.nextInt();
//
//            }
//        }


        //四舍五入
//        int number = input.nextInt();
//        int single_digit = number%10;
//        int single_digit2 = number%100;
//
//        if(single_digit >= 5){
//            int temp = 10 -  single_digit;
//            number = temp + number;
//
//            System.out.println(number);
//        }else{
//            number = number - single_digit;
//
//            System.out.println(number);
//        }

        //计算机内存
//        int n = input.nextInt();
//        long temp = (1024 * 1024 * n )/4;
//        System.out.println(temp);


        //一大一小
//        int x = input.nextInt();
//        int y = input.nextInt();
//        if(x >= y){
//            System.out.println(x);
//            System.out.println(y);
//        }else{
//            x=x^y;
//            y=y^x;
//            x=x^y;
//            System.out.println(x);
//            System.out.println(y);
//        }

        //牛妹数
//        int number = input.nextInt();
//        if((number & 1)!=1 && number >50){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }


        //牛可乐数
//        int number = input.nextInt();
//        if((number & 1) != 1){
//            System.out.println("yes");
//        }else if(number > 50){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }

        //判断闰年
        //该题重点为，&3的操作，其意为输入的year与3的进制相比较，
//        int year = input.nextInt();
//        if((year & 3) == 0 && (year % 100) != 0 || (year % 400) == 0){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }


        //判断奇偶
//        int a = input.nextInt();
//        if ((a & 1) == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }

        //吃瓜群众
//        int weight = input.nextInt();
//        input.close();
//        if((weight & 1) != 1){
//            System.out.println("YES, you can divide the watermelon into two even parts.");
//        }else{
//            System.out.println("NO, you can't divide the watermelon into two even parts.");
//        }


        //&
//        int a = input.nextInt();
//        System.out.println((a&3));

        //牛牛数列
//        int number = input.nextInt();
//        input.close();
//        int i = 1,he = 0;
//        for(;i < number;i++){
//            if((i & 1) == 0){
//                he = he + i;
//                System.out.println(i);
//                System.out.println(he);
//            }else{
//                he = he -i;
//                System.out.println(he);
//                System.out.println(i);
//            }
//        }
//        System.out.println(i);
//        System.out.println(he);

        //牛牛数列2
//        double number = input.nextInt();
//        input.close();
//        DecimalFormat format =new DecimalFormat("0.00");
//        String he ;
//        for(int i = 1;i < number;i ++){
//            System.out.println(i);
//            String format = new DecimalFormat("0.000000").format(he + (1/number));
//
//        }

        //牛牛数列4
//        int number = input.nextInt();
//        input.close();
//        int i = 1;
//        int count = 0;
//        int zong = 0;
//        for(;i <= number;i ++){
//            count = count + i;
//            zong = count + zong;
//        }
//        System.out.println(zong);

        //计算a+b


        //数字三角形
//        int number = input.nextInt();
//        int k = 0;
//        for(int i = 1;i <= number;i++) {
//
//            for(int j = 1;j <= i;j++) {
//                k++;
////                System.out.print(k);
//                if(k >= 1000){
//                    System.out.print(""+k);
//                }else if(k >= 100){
//                    System.out.print(" "+k);
//                }else if(k >= 10){
//                    System.out.print("  "+k);
//                }else if(k < 10){
//                    System.out.print("   "+k);
//                }
//            }
//            System.out.println();
//        }
        //最大最小值

//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        int number3 = input.nextInt();
//        int temp = 0;
//
//        temp = Math.max(number1, number2);
//        temp = Math.max(temp, number3);
//
//        System.out.println("The maximum number is : "+temp);
//
//        temp = Math.min(number1, number2);
//        temp = Math.min(temp, number3);
//        System.out.println("The minimum number is : "+temp);

        //阶乘

//        for(int i=1;i<=num; i++) {
//            result = result *i;
//        }

        //一个整数的所有位数之和
//        int number = input.nextInt();
//        int num = 0;
//        for(int temp = 0;number > 0;){
//            temp = number % 10;
//            num = temp + num;
//            number = number / 10;
//        }
//        System.out.println(num);

        //求一个整数的十位
//        int number = input.nextInt();
//        number = number / 10;
//        int temp = 0;
//        for(int i = 1;i <= 2;i++){
//            temp = number % 10;
//        }
//        System.out.println(temp);

        //3和5和7
//        int number = input.nextInt();
//        for(int i = 1;i <= number;i++){
//            if((i & (2^3 - 1)) == 2){
//                if((i & (2^5 - 1)) == 3){
//                    System.out.println(i);
//                }
//            }
//        }


        //3和5
//        int number = input.nextInt();
//        for(int j = number;j > 0;j++){
//
//        }


        //我们知道第一个质数是 2、第二个质数是 3、第三个质数是 5……请你计算 第 2020个质数是多少？
//        for(int i = 3;i <= 100;i++){
//
//        }

        BigDecimal b1 = new BigDecimal(input.next());
        System.out.println(b1.stripTrailingZeros());








        //现已知A值为1，Z值为26；AA值为27，AZ值为52；LQ值为329，请问：2020对应的字符是什么？









        //有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，问第19个月的兔子总数为多少？






        //一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个29级的台阶总共有多少种跳法？










        //请计算：9210654754847310623632552和48216108297275139335868的乘法结果
//        BigDecimal b1 = new BigDecimal("9210654754847310623632552");
//        BigDecimal b2 = new BigDecimal("48216108297275139335868");
//        String result = String.valueOf(b1.multiply(b2));
//        System.out.println(result);


    }

}

