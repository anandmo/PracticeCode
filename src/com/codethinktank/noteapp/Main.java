package com.codethinktank.noteapp;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Note note = new Note();

       try {

            note.addNote();
            note.showNote();


        } catch (ExceededWordCountException ew){

            ew.printStackTrace();

        } catch (IOException  ie){

            ie.printStackTrace();
        }


    }

}
