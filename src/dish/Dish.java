/*@Time : 2020/4/12 17:48
 *@Author : 韦佗
 *@File : Dish.java
 *@Software : IntelliJ IDEA
 */
package dish;

import java.util.*;
public class Dish {

        static Date date = new Date();

        //设置菜品名称
        static String Dish_1;
        static String Dish_2;

        //记录点菜总数
        static int Dish_sum;

        //记录各菜品被点的次数
        static int Dish_1_Count ;
        static int Dish_2_Count ;

        //记录点菜的总价格
        static int Dish_CountPrice;

        //菜品价格
        static int Dish_1_Price;
        static int Dish_2_Price;

        //蒜头王八的原材料数量
        //制作一份蒜头王八，需要一份蒜头，一份王八
        static int Dish_1_tortoise = 6;
        static int Dish_1_garlic = 9;

        //老八秘制小憨包的原材料数量
        //制作一份老八秘制小憨包，需要两份酱汁，一份憨包
        static int Dish_2_sauce = 5;
        static int Dish_2_hamburger = 9;

        //显示菜名与单价，及情况
        public static void Dish_Show(){

                //蒜头王八的库存的计算
                int Stock_1 = Dish_1_tortoise < Dish_1_garlic? Dish_1_tortoise:Dish_1_garlic;

                //老八秘制小憨包的库存计算
                int Dish_2_sauce_2 = Dish_2_sauce/2;
                int Stock_2 = Dish_2_sauce_2 < Dish_2_hamburger ? Dish_2_sauce_2:Dish_2_hamburger;

                //给菜品赋值
                Dish_1 = "蒜头王八";
                Dish_2 = "老八秘制小憨包";

                //给菜品价格赋值
                Dish_1_Price = 666;
                Dish_2_Price = 888;

                System.out.println("序号\t\t菜品\t\t\t\t\t\t价格\t\t\t数量\t\t库存");

                //Dish_1的输出
                System.out.print("1\t\t"+Dish_1+"\t\t\t\t\t"+Dish_1_Price+"\t元\t\t "+Dish_1_Count+"\t\t　"+Stock_1+"\n");

                //Dish_2的输出
                System.out.print("2\t\t"+Dish_2+"\t\t\t\t"+Dish_2_Price+"\t元\t\t "+Dish_2_Count+"\t\t　"+Stock_2+"\n");

        }

}
