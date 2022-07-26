package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int max=0;
              if (values==null || values.length==0) {
        return 0; }

        for (int i=0; i<values.length; i++) {

            if (values[i]>max) {
                values[i]=max;
            }
        }
        return max;
        }
    }

