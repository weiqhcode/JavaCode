/*@Time : 2020/4/18 18:16
 *@Author : 韦佗
 *@File : SparseArray.java
 *@Software : IntelliJ IDEA
 */
package DateStructures.SparseArray;

public class SparseArray {

    public static void main(String[] args){
        //创建一个原始的二维数组11*11
        //0:表示没有棋子，1表示黑子 2表示蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出原始的二维数组
        System.out.println("原始的二维数组~~");
        for(int[] row : chessArr1){
            for (int date : row){
                System.out.printf("%d\t",date);
            }
            System.out.println();
        }

        //将二维数组转稀疏数组的思路
        //1.先将二维数组遍历 得到非0数据的个数
        int sum = 0;
        for (int i=0;i < chessArr1.length;i++){
                for (int j = 0;j < chessArr1.length;j++){
                    if (chessArr1[i][j] != 0){
                        sum++;
                    }
                }
        }
        System.out.println(sum);


    }

}
