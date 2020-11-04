package com.company;

import java.util.Scanner;

public class TestQ4 {
    //Q4:ex:鍵入4 輸出
    //(1)1=1
    //(2)2+2=4
    //(3)4+4+4=12
    //(4)8+8+8+8=32
    //以此類推...
    //讀取字元
    //Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 2;
        int y;
        int x;
        int i;
        int j;
        double c, t;
        for (i = 1; i <= a; i++) {
            t = 0;
            c = Math.pow(b, i - 1);
            y = (int) c;
            String ch = "(" + i + ")";
            System.out.print(ch);
            for (j = 0; j < i; j++) {//原來while(j>0)
                System.out.print(y);
                if (j + 1 != i) {
                    System.out.print("+");
                }
                t = t + y;
                //j=j-1;
            }
            x = (int) t;
            System.out.print("=" + x);
            System.out.print("\n");
        }
    }
}
