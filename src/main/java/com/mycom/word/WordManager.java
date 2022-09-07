package com.mycom.word;

import java.util.Scanner;

// controls WordCRUD class to manage CRUD Operations of the program.
public class WordManager {

    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD; // A WordCRUD Object to do CRUD Operations.

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
}
