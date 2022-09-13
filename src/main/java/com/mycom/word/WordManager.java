package com.mycom.word;

import java.util.Scanner;

// controls WordCRUD class to manage CRUD Operations of the program.
public class WordManager {

    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD; // A WordCRUD Object to do CRUD Operations.

    //Constructor
    WordManager(){
        wordCRUD = new WordCRUD(s);
    }

    public int selectMenu(){
        System.out.print("*** 영단어 마스터 ***\n"
                + "********************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "********************\n"
                + "==> 원하는 메뉴는? ");
        return s.nextInt();
    }

    //Starting point of WordManager()
    public void start(){

        wordCRUD.loadFile();
        while(true){ // true until input 0 is given
            int menu = selectMenu();
            if(menu == 0) {
                System.out.println("\n프로그램 종료!, 다음에 만나요~");
                break;
            }
            else if(menu == 1){
                //show list
                wordCRUD.listAll();
            }
            else if(menu == 2){
                //search words by level
                wordCRUD.searchLevel();
            }
            else if(menu == 3){
                //search words (by embedded letters/words)
                wordCRUD.searchWord();
            }

            else if(menu == 4){
                //create WORD data
                wordCRUD.addItem();
            }

            else if(menu == 5){
                //update WORD data
                wordCRUD.updateItem();
            }
            else if(menu == 6){
                //delete WORD data
                wordCRUD.deleteItem();
            }
            else if(menu == 7){
                //save data (file)
                wordCRUD.saveFile();
            }


        }
    }
}
