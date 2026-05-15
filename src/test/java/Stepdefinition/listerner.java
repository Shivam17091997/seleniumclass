package Stepdefinition;

import org.testng.annotations.Test;

public class listerner {

    @Test(retryAnalyzer = RetryAnalyzer.class, alwaysRun = true)//jis tarika ka analyzer hooga us tarika ka analyer use kare ga jaise ke yaha retry analyzer hai es liya humne uska use kiya
    public void pass(){
        System.out.println("hello");
        //System.out.println();
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void fail(){
        assert false;//hardcoded
    }


}
