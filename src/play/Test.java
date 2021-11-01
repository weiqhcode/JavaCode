/*@Time : 2020/6/26 16:07
 *@Author : 韦佗
 *@File : Test.java
 *@Software : IntelliJ IDEA
 */
package play;

public class Test {
    public static void main(String[] args) {
        int arr[] = new int[]{9,6,8,10,3};
        for(int i = 0;i < arr.length - 1;i++){//外层循环控制排序趟数
            for(int j = 0;j<arr.length - 1 - i;j++){//内层循环控制每一趟排序多少次
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0;i <= arr.length - 1;i++){
            if (arr[i] == arr[0]){
                arr[i] = 0;
            }
            if (arr[i] == arr[arr.length - 1]){
                arr[i] = 0;
            }
        }
        for(int i = 0;i <= arr.length - 1;i++){
            System.out.println(arr[i]);
        }
    }
}
