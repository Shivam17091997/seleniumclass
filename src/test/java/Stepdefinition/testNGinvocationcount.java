package Stepdefinition;

import org.testng.annotations.Test;

public class testNGinvocationcount {

    @Test(invocationCount = 5)
    public void testcase(){
        System.out.println("testcase");
    }
}
