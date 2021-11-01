/*@Time : 2020/4/14 14:33
 *@Author : 韦佗
 *@File : Dish_Test.java
 *@Software : IntelliJ IDEA
 */
package dish;

public class Dish_Test {
    public static void main(String[] args){

        //实例化对象
        Dish_Middle Dish_living = new Dish_Middle();

        //进入主方法的欢迎提示
        System.out.println("\t\t\t\t\t欢迎,光临!");

        //通过控制isFlag的值，控制程序是否退出
        boolean isFlag = true;

        //控制菜单显示的循环
        while(isFlag) {

            //用户交互提示

            Dish_living.MainPromt();

            //调用同包内类的方法，来接收键盘输入的值
            char selection = Dish_Middle.readMenuSelection();

            //提供菜单选择的功能
            switch (selection) {

                case '1':

                    //退出提示
                    Dish_living.DishPrompt_1();

                    //调用方法，完成接收点菜菜品，算总数，价格
                    Dish_living.OrderDish();

                    break;

                case '2':

                    //退菜提示
                    Dish_living.DishPrompt_2();

                    //调用对象的的点菜方法
                    Dish_living.RejectDish();

                    break;

                case '3':

                    //显示菜品情况
                    Dish_living.Dish_Show();
                    System.out.println("\n\t(\t总计:"+"\t\t\t"+Dish_living.Dish_CountPrice+" 元\t\t"+Dish_living.Dish_sum+" 个菜品\t)");
                    break;

                case '4':

                    //退出提示
                    Dish_living.ExitPrompt();

                    //通过接收用户键入的返回值，更改是否退出循环
                    char isExit = Dish_Middle.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }

                    break;

                case '5':

                    //提示
                    System.out.println("\t\t\t\t功能开发中.....");
                    break;

            }

        }

    }

}
