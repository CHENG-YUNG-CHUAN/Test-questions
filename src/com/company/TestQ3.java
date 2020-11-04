package com.company;

public class TestQ3 {
        //Q3:副程式傳回兩字串數值相加
        public int addsum(String a, String b) {
        int n, x, y;
        x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        n = x + y;
        return n;
    }
        public static void main(String [] args){
        String ha, hb;
        ha = "845694";
        hb = "543975";
        TestQ3 t = new TestQ3();
        //addsum in= new addsum(); 副程式是否為static狀態,否的話必須加
        int hr = t.addsum(ha, hb);
        System.out.print(hr);
        }
}
