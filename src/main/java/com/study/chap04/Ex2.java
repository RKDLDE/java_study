package com.study.chap04;

/* 4-2. 1부터 20까지의 정수 중 2또는 3의 배수가 아닌 수의 총합 */
public class Ex2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<= 20; i++){
            if ((i % 2 == 0)||(i % 3 == 0)) continue;
            else{
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("1~20까지의 정수 중 2또는 3의 배수가 아닌 수의 총합 = " + sum);
    }
}

// 73