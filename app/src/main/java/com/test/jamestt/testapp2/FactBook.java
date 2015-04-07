package com.test.jamestt.testapp2;

import java.util.Random;

/*
  Created by jamestt on 07/04/15.
 */

public class FactBook {

    //Create and Initialise String Array
    public String[] mFacts = {
                                "Ants Strech when they wake up in the morning",
                                "Ostriches can run faster than horses",
                                "Olympic gold medals are made mostly of silver",
                                "Sadly there was an error producing the random number"};


    public String getFact(){
        String fact;
        //Generate Random Number
        Random NumberGenerator = new Random();
        int RandomNumber = NumberGenerator.nextInt(3);



        fact = mFacts[RandomNumber];

        return fact;
    }
}

