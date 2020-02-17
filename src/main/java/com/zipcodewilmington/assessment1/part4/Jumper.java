package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int initialJumps = k/j;
        int remainingHeight = k - (initialJumps * j);
        int totalJumps = remainingHeight + initialJumps;

        return totalJumps;
    }
}
