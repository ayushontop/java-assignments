package com.ayush;

import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int p= in.nextInt();
        int r= in.nextInt();
        int t= in.nextInt();
        System.out.println((p*r*t)/100);

    }
}
