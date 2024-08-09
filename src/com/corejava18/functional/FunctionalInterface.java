package com.corejava18.functional;

public class FunctionalInterface {

    /**
     * anonumus class
     */

    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hi Welcoome to Java1.8 features:::");
        }
    };
    /**
     * This is functaional
     */
    Runnable rf=()->System.out.println("welcome to lamda expressions");

    Runnable rf1= () ->{
        System.out.println("welcome to lamda expression1");
    };


    public static void main(String[] args){

        FunctionalInterface fi= new FunctionalInterface();
        fi.r.run();
        fi.rf.run();
        fi.rf1.run();

    }
}
