package com.company;

import java.util.Scanner;

public class Fibonacci {

    public void calc(){
        Scanner input = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;

        System.out.println("Digite um número limite: ");
        int limit = input.nextInt();

        while (f2 < limit){
            int fn = f1 + f2;
            if (fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
