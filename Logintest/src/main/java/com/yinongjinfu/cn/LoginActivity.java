package com.yinongjinfu.cn;
import org.testng.annotations.*;
public class LoginActivity {
    @Test
    public  void loginsucessful(){
        System.out.println("这是测试方法1");
    }
    @Test
    public  void loginsucessful2(){
        System.out.println("这个是测试方法2");
    }
    @BeforeMethod
    public   void beforemethod(){
        System.out.println("这个是测试方法之前运行的");
    }
    @AfterMethod
    public  void  aftermethod(){
        System.out.println("这个是在测试方法运行之后运行的");
    }
    @BeforeClass
    public void beforeclass(){
        //变量赋值
        //一些配置
        System.out.println("这是类运行之前的方法");
    }
    @AfterClass
    public  void afterclass(){
        System.out.println("这是类运行之后需要运行的类");
    }
    @AfterSuite
public void aftersuit(){
    System.out.println("这个是在类运行完之后需要运行的方法");
}
}
