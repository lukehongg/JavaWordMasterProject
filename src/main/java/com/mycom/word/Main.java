package com.mycom.word;

public class Main {

    public static void main(String[] args){
        //System.out.println("Hello World!! 안녕"); //test for Korean Language support.

        new WordManager().start();
    }
}

/* Project Flow
* Run Java APP
* main method from Main Class is invoked
* Word Manager is invoked from main method and invokes start method.
* Word Manager Class Starts! => Shows output (prompt)
* */
