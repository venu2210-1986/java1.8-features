package com.corejava18.functional;


//Method name should be anything without argument and access modifier
interface MethodReference{
    void methodReference();
}

public class MethodReferenceTest {

     static int methodReference(){
        System.out.println("Method Reference implementation:::");
        return 10;
    }


    public static void main(String[] args){

        MethodReferenceTest mrTest= new MethodReferenceTest();
        MethodReference test = MethodReferenceTest::methodReference;
        test.methodReference();

    }

}
