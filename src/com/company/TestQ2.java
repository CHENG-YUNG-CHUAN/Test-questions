package com.company;

import java.util.Scanner;

public class TestQ2 {
    //Q2:一字串:"a,b,c,d,e,f..."
    //拆分成a1、b1、c1、d1、e1、f1.....
    public static void main(String[] args) {
        String A = "a,b,c,d,e,f";
        String[] AA = A.split(",");//訓練split及陣列應用
        for (String s : AA) {
            System.out.print(s + "1" + "、");
        }


    }

}
