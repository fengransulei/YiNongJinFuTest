package com.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {
    //配置
    @BeforeSuite
    public void beforesuit(){
        System.out.println("beforesuit运行了");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("aftersuit运行了");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aftertest");
    }
}
