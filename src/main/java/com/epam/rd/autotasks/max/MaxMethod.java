package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
             int max =Integer.MIN_VALUE;
        for (int i = 0; i < values.length ; i++) {
            if (max<values[i])
                max=values[i];
        }
return max;

        }

        }

