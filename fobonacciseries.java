package com.ayush;

import java.util.Scanner;

public class fibonaciseries {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
//        int temp=0;
        
        for (int i = 2; i <n; i++) {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;





        }
    }
}
