package com.study.chap01;

public class Ex4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(sum <= 100){
            if (i %  2 == 0) sum -= i;
            else sum += i;
//            System.out.println(i + "+ sum = " + sum);
            i++;
        }

        System.out.println(i);
    }
}

// 202