/*@Time : 2021/3/24 18:30
 *@Author : 韦佗
 *@File : Text.java
 *@Software : IntelliJ IDEA
 */
package test;

import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("D:\\zm\\mysql.csv");
//        BufferedReader br=new BufferedReader(fr);
//
//        FileOutputStream out = new FileOutputStream("D:\\zm\\mysql8.csv");
//        OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");
//        BufferedWriter bufWrite = new BufferedWriter(outWriter);
//
//        String line="";
//        String[] arrs=null;
//        int count = 0;
//        while ((line=br.readLine())!=null) {
//            arrs=line.split(",");
//            for (String str:arrs){
//                if(str.equals("NULL")){
//                    count++;
//                }
//            }
//
//            if(count<=3){
//                bufWrite.write(line+"\r\n");
//            }
//            count = 0;
//        }
//
//        br.close();
//        fr.close();
//        bufWrite.close();
//        outWriter.close();
//        out.close();
//        String str = "[{ui}],[{wef}],[{wefw}],[{fhjrtyj}]";
//        String[] relut = str.split(",");
//        for(String i:relut){
//            String q = i.substring(1, i.length()-1);
//            System.out.println(q);
//
//        }
//
//        System.out.println(relut);

//        int index = (int)Math.random();
//
//        System.out.println(index);



//        String[] arrays = new String[]{};
//        System.out.println(arrays);
//        arrays[0] = "{\"one\":\"1\"}";
//        arrays[1] = "{\"two\":\"2\"}";
//
//        for(String array:args){
//            System.out.println(array);
//        }
        int num = 1 + (int)(Math.random() * (99999999-1+1));

        System.out.println(num);
    }

}
