package com.suit;
import org.testng.annotations.Test;
public class IgnoreTestActivity {
    @Test
    public void ignore1(){
        System.out.println("ignore1执行");
    }
    @Test(enabled = false)
    public  void  ignore2(){
        System.out.println("ignore2");
    }
    @Test(enabled = true)
    public  void igore3(){
        System.out.println("ignore3");
    }
}
