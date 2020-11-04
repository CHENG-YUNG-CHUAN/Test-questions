package com.company;

public class TestQ1 {
        /*Q1:印出     *
                    **
                   ***
                  ****
                 *****
            ＊一開始為４個空格
         */
        public static void main(String[] args) {
            int i;
            int j;
            String s ="*";
            String ch=" ";
            for (i = 5; i > 0; i--) {
                for (j = 1; j < i; j++) {
                    System.out.print(ch);
                }
                for (j = 5; j > i; j--) {
                    System.out.print(s);
                }
                System.out.println(s);
            }
            int f;
            f=1;
            System.out.print(f);
    }

}
