package com.dsa.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int[] arr = new int[7];

        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        arr[4] =50;
        arr[5] =60;
        arr[6] =70;

        Arrays.stream(arr).forEach(e -> System.out.println(e + ""));
        System.out.println("sum is " + Arrays.stream(arr).sum());

        }
    }

