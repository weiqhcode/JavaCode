/*@Time : 2020/9/19 19:33
 *@Author : 韦佗
 *@File : calculatorTest.java
 *@Software : IntelliJ IDEA
 */
package jUnit.calculatorTest;

import jUnit.calculator.calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

    //初始化方法，用于资源申请
    //所有测试方法在执行方法之前都会执行该方法
    @Before
    public void init(){
        System.out.println("Before");
    }

    @After
    public void close(){
        System.out.println("After");
    }

    //测试add方法
    @Test
    public void testAdd(){
        calculator c = new calculator();

        int reselt = c.add(8,9);

        Assert.assertEquals(17,reselt);
    }

    //测试sub方法
    @Test
    public void testSub(){
        calculator c = new calculator();

        int reselt = c.sub(8,5);

        Assert.assertEquals(3,3);

    }
}
