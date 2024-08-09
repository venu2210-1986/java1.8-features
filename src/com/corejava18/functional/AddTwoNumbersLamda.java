package com.corejava18.functional;

@java.lang.FunctionalInterface
interface HelloInterface{
    public void helloMethod();
}

@java.lang.FunctionalInterface
interface HelloInterfaceAdd{
    public int helloMethodAdd(int a, int b);
}

public class AddTwoNumbersLamda {

    public static int addTwoNumbers(HelloInterfaceAdd add){
       return add.helloMethodAdd(100,200);
    }

    public static void main(String[] args){
        HelloInterface hf=()->System.out.println("Hello World ");
        hf.helloMethod();
        HelloInterfaceAdd add =(int a,int b) ->{
            System.out.println("Method Implementations");
            int sum= a+b;
            return sum;
        };
        System.out.println("Method execution start");
        int sum= addTwoNumbers(add);
        System.out.println(sum);
    }
}
