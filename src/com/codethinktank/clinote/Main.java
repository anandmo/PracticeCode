package com.codethinktank.clinote;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Console;

public class Main {

    public static void main(String[] args) {


        int input = 0;
        String title,user_note;

        Scanner option_input = new Scanner(System.in);
        Scanner title_input =  new Scanner(System.in);
        Scanner note_input = new Scanner(System.in);
        Note note;
        NoteLinkedHashMap noteLinkedHashMap = NoteDataUtility.fetchNoteFromStorage();

        do {
          //  clearScreen();
            System.out.println("\nPlease select an action : ");
            System.out.println("1). Add note");
            System.out.println("2). View note");
            System.out.println("3). Delete Note");
            System.out.println("4). Exit");
            System.out.println(" Type your input and press enter : ");

            try {
                input = option_input.nextInt();
            } catch (InputMismatchException inputExp){
                System.out.println("Enter a valid input");
                option_input.nextLine();
            }

            switch (input) {

                case 1:

                    System.out.println("Enter title :");
                    title = title_input.nextLine();
                    System.out.println("Enter note :");
                    user_note = note_input.nextLine();
                    note = new Note(user_note,title);
                    if(noteLinkedHashMap != null) {
                        noteLinkedHashMap.addNoteToLinkedHashMap(note.getDateTime(), note);
                        NoteDataUtility.commitNoteToStorage(noteLinkedHashMap);
                    }else{
                        noteLinkedHashMap = new NoteLinkedHashMap(note.getDateTime(),note);
                        NoteDataUtility.commitNoteToStorage(noteLinkedHashMap);
                    }
                    break;

                case 2:

                     NoteLinkedHashMap fetchedNoteLinkedHashMap = NoteDataUtility.fetchNoteFromStorage();
                     if(fetchedNoteLinkedHashMap != null){
                         fetchedNoteLinkedHashMap.displayAllNotes();
                     } else {
                         System.out.println("No notes found on storage");
                     }

                    break;

                case 3:
                     noteLinkedHashMap = null;
                     if(NoteDataUtility.deleteNoteData())
                         System.out.println("Notes deleted");
                     else
                         System.out.println("Cannot remove Notes");
                    break;

                case 4:
                    System.out.println("Exiting Bye Bye");
                    break;

                default:
                    System.out.println("Not valid input");


            }


        }while (input != 4);



    }


    public static void waitForEnter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to quit...");
        input.nextLine();
    }

}
