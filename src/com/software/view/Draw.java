package com.software.view;

public class Draw {
    public static void main(String[] args) {

//        Test test = new Test();
//        test.draw(3);
        int[] score = new int[5];
        score[0]=89;
        score[1]=90;
        score[2]=86;
        score[3]=93;
        score[4]=95;

        float arg,sum=0,max=0;
        for (int i = 0; i < score.length; i++) {
            sum = sum+score[i];

        }

        arg=sum/5;
        for (int i = 0; i < score.length; i++) {
            if(max<score[i]) max=score[i];

        }
        System.out.println("sum:"+sum);
        System.out.println("arg:"+arg);
        System.out.println("max:"+max);
        }

    }





