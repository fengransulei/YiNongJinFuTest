package com.suit;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupActivity {
@Test(groups = "server")
    public void test1(){
        System.out.println("这个是服务器1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这个是服务器2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这个是客户端1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这个是客户端2");
    }
    @BeforeGroups(groups = "server")
    public void beforegroup(){
        System.out.println("这个是服务端组运行前运行的方法");
    }
    @AfterGroups(groups = "server")
    public void aftergroup(){

        System.out.println("这个是服务端组后运行的方法");
    }
}
