package com.company;

public class _07_DiagonalTraversal {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++)
                for (int k = 0; k < arr.length; k++) {
                    if (i == k - j) {
                        System.out.print(" " + arr[j][k]);
                    }
                }

        }

    }
}
