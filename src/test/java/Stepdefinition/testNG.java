package Stepdefinition;

import org.testng.annotations.*;

public class testNG {

    @Test(groups = "smoke")
    public void testcase1(){
        System.out.println("testcase1");
        System.out.println(Thread.currentThread());
    }
    @Test(groups = "smoke")
    public void testcase2()
    {
        System.out.println("testcase2");
        System.out.println(Thread.currentThread());
    }
    @BeforeMethod
    public void testcase3(){
        System.out.println("testcase3");
        System.out.println(Thread.currentThread().getName());

    }
    @AfterClass
    public void testcase4(){
        System.out.println("testcase4");
        System.out.println(Thread.currentThread().getName());
    }
    @AfterMethod
    public void testcase5(){
        System.out.println("testcase5");
        System.out.println(Thread.currentThread().getName());
    }

    public void testcase6(){
        System.out.println("testcase6");
    }

    public void testcase7(){
        System.out.println("testcase7");
    }

    public void testcase8(){
        System.out.println("testcase8");
    }
}
