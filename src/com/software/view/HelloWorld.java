package com.software.view;


public class HelloWorld {


    public static void main(String[] args) {
        Test test =new Test();
        test.add(2,3);

        int sum=0;


        for (int i = 1; i <= 100; i++) {
            if(i%2==0) sum=sum +i;

        }
        System.out.println(sum);

    }
}
