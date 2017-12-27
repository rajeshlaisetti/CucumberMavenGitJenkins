package com.macys;

import org.junit.After;
import org.junit.Before;

public class Hooks  {

    @Before
    public void initializationingTest(){
        System.out.println("To initialize the cucumber selenium test....");


    }

    @After
    public void teardownTest(){
        System.out.println("Close all the browser and test...");


    }

}
