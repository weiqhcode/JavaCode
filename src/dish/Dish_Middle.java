/*@Time : 2020/4/14 15:14
 *@Author : 韦佗
 *@File : Dish_Middle.java
 *@Software : IntelliJ IDEA
 */
package dish;

import java.util.*;

public class Dish_Middle extends Dish{
        private static Scanner scanner = new Scanner(System.in);

        /*
        * 用于界面菜单的选择
        * 该方法读取键盘，如果用户键入‘1’-‘4’中的任意字符，则方法返回。
        *返回值为用户键入的字符
        * */
        public static char readMenuSelection(){
            char a;

            for(;;){

                //将readKeyBoard()方法的值赋给str
                String str = readKeyBoard(1);

                //将str转化为字符
                a = str.charAt(0);

                //判断字符是否在1-4间，如果不是跳出判断，重新进入循环，让用户再次输入
                if (a != '1' && a != '2' && a != '3' && a != '4' && a != '5'){
                    System.out.println("\t\t\t选择错误，请重新输入:");
                }else {
                    break;
                }
            }

            //返回a，给Dish_Test类判断用户输入了那个值
            return  a;

        }

        //用于实现点菜，计算总价，计算被点情况，计算价格
        public  void OrderDish(){
            System.out.println("\t\t\t\t\t本店特色菜");
            System.out.println("\t\t\t\t(请输入序号进行点菜)\n");
            Dish_Show();
            char b;

            for(;;){

                //将readKeyBoard()方法的值赋给str并用.toUpperCase()转化为大写
                String str = readKeyBoard(1).toUpperCase();

                //将str转化为字符
                b = str.charAt(0);

                //判断用户输入的值
                if (b == '1'){

                    if(Dish_1_tortoise >= 1 && Dish_1_garlic >=1 ){

                        //满足条件该菜品以被点数量加一
                        Dish_1_Count += 1;

                        //点菜的同时，扣去相应的原材料数量
                        Dish_1_tortoise -= 1;
                        Dish_1_garlic -= 1;

                        //如果用户此时的菜的总数是否超过99，如果不是显示点菜成功
                        if(Dish_1_Count <= 99){
                            System.out.println("\t\t\t\t"+Dish_1+"\t点菜成功！\n\t\t\t\t 您可以继续点菜:");
                        }

                        //如果用户此时的菜的总数是否大于99，如果是显示点菜已经到了上限，并且将多增加的1减回
                        if(Dish_1_Count >99){
                            Dish_1_Count -= 1;
                            System.out.println("\t\t抱歉！"+Dish_1+"的点菜上限只能为:3个!\n\t\t\t\t\t请重新输入:");

                        }else{

                        }

                    }else{

                        System.out.println("\t\t\t  仓库原材料不足....");
                        System.out.println("\t\t\t\t点菜失败！");
                        System.out.println("\t\t\t请选择其他菜品序号输入:\n");

                    }

                }else if (b == '2'){

                    if(Dish_2_sauce >= 1 && Dish_2_hamburger >=1 ){

                        //满足条件该菜品以被点数量加一
                        Dish_2_Count += 1;

                        //点菜的同时，扣去相应的原材料数量
                        Dish_2_sauce -= 2;
                        Dish_2_hamburger -= 1;

                        //如果用户此时的菜的总数是否超过99，如果不是显示点菜成功
                        if(Dish_2_Count <= 99){
                            System.out.println("\t\t\t\t"+Dish_2+"\t点菜成功！\n\t\t\t\t 您可以继续点菜:");
                        }

                        //如果用户此时的菜的总数是否大于99，如果是显示点菜已经到了上限，并且将多增加的1减回
                        if(Dish_2_Count >99){
                            Dish_2_Count -= 1;
                            System.out.println("\t\t抱歉！"+Dish_2+"的点菜上限只能为:3个!\n\t\t\t\t\t请重新输入:");
                        }else{

                        }

                    }else{

                        System.out.println("\t\t\t  仓库原材料不足....");
                        System.out.println("\t\t\t\t点菜失败！");
                        System.out.println("\t\t\t请选择其他菜品序号输入:\n");

                    }

                }else if ( b == 'Y'){//如果是y则退出该方法

                    break;

                }else if ( b == 'N'){//如果是n则继续该方法

                    System.out.println("\t\t\t\t  您可以继续点菜:");

                }else{

                    //如果全都不是，就为数值错误
                    System.out.println("\t\t\t您输入的数值有误，请重新输入:");

                }

                //判断完成后，计算点菜个数，总价，总数
                Dish_sum = Dish_1_Count+Dish_2_Count;
                Dish_CountPrice = Dish_1_Count * Dish_1_Price + Dish_2_Count * Dish_2_Price;

                //显示菜品情况
                Dish_Show();
                System.out.println("\n\t(\t总计:"+"\t\t\t"+Dish_CountPrice+" 元\t\t"+Dish_sum+" 个菜品\t)");
                DishPrompt_1();
            }

        }

        //用于实现退菜，减钱，退菜时开关是否已点菜
        protected static void RejectDish(){
            System.out.println("\t\t\t(请输入序号退菜)");
            char c;

            //显示菜品情况
            Dish_Show();
            System.out.println("\n\t(\t总计:"+"\t\t\t"+Dish_CountPrice+" 元\t\t"+Dish_sum+" 个菜品\t)");

            for(;;){

                //将readKeyBoard()方法的值赋给str并用.toUpperCase()转化为大写
                String str = readKeyBoard(1).toUpperCase();

                //将str转化为字符
                c = str.charAt(0);

                //判断用户输入的值
                if ( c == '1' ){

                    //满足条件该菜品以被点数量减一
                    Dish_1_Count -= 1;

                    //如果用户此时的菜的总数是否超过0，如果不是显示退菜成功
                    if(Dish_1_Count >= 0) {

                        //退的同时，加回相应的原材料数量
                        Dish_1_tortoise += 1;
                        Dish_1_garlic += 1;
                        System.out.println("\t\t\t  "+Dish_1 + "\t退菜成功！\n\t\t\t\t您可以继续退菜:");
                    }

                    //如果用户此时的菜的总数是否大于0，如果是显示退菜已经到了下限，并且将多减少的1加回
                    if(Dish_1_Count <0){
                        Dish_1_Count += 1;
                        System.out.println("\t\t抱歉！"+Dish_1+"的退菜下限只能为:0个!\n\t\t\t\t\t请重新输入:");
                    }

                }else if (c == '2'){

                    //满足条件该菜品以被点数量减一
                    Dish_2_Count -= 1;

                    //如果用户此时的菜的总数是否超过0，如果不是显示退菜成功
                    if(Dish_2_Count >= 0) {

                        //退的同时，加回相应的原材料数量
                        Dish_2_sauce += 2;
                        Dish_2_hamburger += 1;

                        System.out.println("\t\t\t  "+Dish_2 + "\t退菜成功！\n\t\t\t\t您可以继续退菜:");
                    }

                    //如果用户此时的菜的总数是否大于0，如果是显示退菜已经到了下限，并且将多减少的1加回
                    if(Dish_2_Count <0){
                        Dish_2_Count += 1;
                        System.out.println("\t\t抱歉！"+Dish_2+"的退菜下限只能为:0个!\n\t\t\t\t\t请重新输入:");
                    }

                }else if (c == 'Y'){//如果是y或Y则退出该方法

                    break;

                }else if (c == 'N'){//如果是n或N则继续该方法

                    System.out.println("\t\t\t\t  您可以继续退菜:");

                }else{

                    //如果全都不是，就为数值错误
                    System.out.println("\t\t\t您输入的数值有误，请重新输入:");

                }

                //判断完成后，计算点菜个数，总价，总数
                Dish_sum = Dish_1_Count + Dish_2_Count;
                Dish_CountPrice = Dish_1_Count * Dish_1_Price + Dish_2_Count * Dish_2_Price;

                //显示菜品情况
                Dish_Show();
                System.out.println("\n\t(\t总计:"+"\t\t\t"+Dish_CountPrice+" 元\t\t"+Dish_sum+" 个菜品\t)");
                DishPrompt_2();
            }

        }

        //点菜的退出提示
        public static void DishPrompt_1(){
            System.out.println("\t\t\t(完成点菜后，可输入Y/N退出点菜)");
        }

        //退菜的退出提示
        public static void DishPrompt_2(){
            System.out.println("\t\t\t(完成退菜后，可输入Y/N退出点菜)");
        }

        //显示退出提示
        public void ExitPrompt(){
            System.out.println("\t\t  您本次点菜总金额为:"+Dish.Dish_CountPrice+"元");
            System.out.println("\t  确定是否结束点菜,进入结账?(Y/N):");
        }

        //显示主菜单
        public void MainPromt(){
            System.out.println("\t\t+----------王二狗的小地摊--------+");
            System.out.println("\t\t\t\t\t1\t点菜");
            System.out.println("\t\t\t\t\t2\t退菜");
            System.out.println("\t\t\t\t\t3\t查看点菜详情");
            System.out.println("\t\t\t\t\t4\t结账");
            System.out.println("\t\t\t\t\t5\t呼叫服务生");
            System.out.println("\t\t+-----------------------------+");

            System.out.println("\t\t\t\t\t请选择(1-4):");
        }

        /*
        * 用于确认的输入
        * 该方法从键盘读取‘Y’或‘N’,并将其作为方法的返回值
        * */
        public static char readConfirmSelection(){
            char c;
            for (;;){

                //使用的.toUpperCase()的方法，将输入的字母全部转化成大写，并且调用readKeyBoard()方法，判断输入的值是否为一个长度
                String str = readKeyBoard(1).toUpperCase();

                //取str中的第一个字符串
                c = str.charAt(0);

                //判断是否为y或n
                if (c == 'Y' || c == 'N'){
                    break;
                } else {
                    break;
                }

            }

            //返回c的值
            return c;
        }



        /*
        * 实现本方法内的字符长度限制
        * */
        private static String readKeyBoard(int limit){
            String line = "";

            while(scanner.hasNext()){
                line = scanner.next();

                //通过判断数组长度与数组
                if (line.length() < 1 || line.length() > limit){
                    System.out.println("\t\t输入长度（不大于"+limit+")错误,请重新输入:");
                    continue;
                }
                break;
            }

            //返回输入的值，给其他方法接受
            return line;
        }

}
