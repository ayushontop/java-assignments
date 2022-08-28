package com.ayush;

import java.util.Scanner;

public class armstrongnumbers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int start =in.nextInt();
//        int end =in.nextInt();
       int f=0;
        int num=in.nextInt();
//        for (int i = start; i <end ; i++) {
           int s=0;
//            while (i>0)
        int n=num;
        while(n>0)
            {
                s=n%10;
                f+=Math.pow(s,3);
                n=n/10;


            }
            if (f==num)
            {
                System.out.println("Armstrong");
                }
            else
                System.out.println("not armstrong");

        }
    }

