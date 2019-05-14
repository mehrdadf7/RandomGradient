package com.github.mehrdadf7.randomGradient;

import android.graphics.Color;

import java.util.Random;

public class ColorRangePicker {

    private String[] firstRange = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    private String[] secondRange = {
            "#3079ab",
            "#39add1",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
            "#c25975",
            "#51b46d",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
    };

    public int[] getColors() {
        Random r = new Random();
        int randomNumber = r.nextInt(firstRange.length);
        return new int[] {
                Color.parseColor(firstRange[randomNumber]),
                Color.parseColor(secondRange[randomNumber])
        };
    }

}
