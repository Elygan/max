package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();

             // if (values==null || values.length==0) {
       // return 0; }
int arr [] = values ;
int maxNum = arr[0];

        for (int i: arr ) {

            if (i>maxNum)
                maxNum=i;
            }
        return maxNum ;
        }

        }

