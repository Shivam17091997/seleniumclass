package Hooks;

import Pages.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


//creating a class called Hooks

//extends BaseClass means: Hooks can use everything from BaseClass (like driver, initializeDriver)
public class hooks extends BaseClass {
//run BEFORE every test scenario
    @Before
    public void setup(){
        initializedriver();//initializeDriver() = opens Chrome
    }
//run AFTER every test scenario
    @After
    public void teardown(){
        quitDriver();
    }
}

//@Before runs
//→ Browser opens
//🧪 Test steps execute
//🔴 @After runs
//→ Browser closes