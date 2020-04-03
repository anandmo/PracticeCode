package com.codethinktank.noteapp;

import java.io.*;
import java.util.Scanner;

class Note  {

    private String note_message;
    private Scanner scanner;
    private int noteLength;

    void addNote() throws ExceededWordCountException,IOException {

        scanner = new Scanner(System.in);
        System.out.println("Enter your note (under 25 letters) :");
        note_message = scanner.nextLine();

        noteLength = note_message.length();

        if(noteLength > 25) {

            throw new ExceededWordCountException("Length Exceeded.");

        } else {

            System.out.println("Saving note .. ");

            FileWriter fileWriter = new FileWriter("note.bin");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(note_message);

            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();


        }

    }

    void showNote() throws IOException{


        FileReader fileReader = new FileReader("note.bin");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String s = bufferedReader.readLine();

      System.out.println(s);
      bufferedReader.close();
      fileReader.close();
    }

}
