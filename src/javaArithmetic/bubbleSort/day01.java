/*@Time : 2020/6/3 17:11
 *@Author : 韦佗
 *@File : day01.java
 *@Software : IntelliJ IDEA
 */
package javaArithmetic.bubbleSort;

public class day01 {

    public static void main(String[] args){

        int[] list = new int[]{5,48,1,2,7,15};

        System.out.println(list.length);
        for(int i =0;i <= list.length;i++){
            System.out.println(i);
            for(int j = 0;j <=i-1;j++){
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];

                }
            }
        }
    }

}
