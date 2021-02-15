package com.juan.basics;

class Basic {
    public static void main(String[] args){
        for(int i=0; i<=255; i++){
            System.out.println(i);
        }
        for(int i=0; i<=255; i++){
        if(i % 2 != 0)
            System.out.println(i);
        }
        int num1 = 5, num2 = 5, sum;
        sum = num1 + num2;
        System.out.println(sum);
        
        int[] myArray = {1,3,5,7,9,13};
        System.out.println(myArray);
        
        
    }
}
