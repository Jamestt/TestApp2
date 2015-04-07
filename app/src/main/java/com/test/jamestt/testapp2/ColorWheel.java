package com.test.jamestt.testapp2;

import android.graphics.Color;

import java.util.Random;

/*
  Created by jamestt on 07/04/15.
 */
public class ColorWheel {

    //Create and Initialise String Array
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    public int getColor(){
        String color;
        //Generate Random Number
        Random NumberGenerator = new Random();
        int RandomNumber = NumberGenerator.nextInt(mColors.length);

        color = mColors[RandomNumber];
        return Color.parseColor(color);

    }



}
