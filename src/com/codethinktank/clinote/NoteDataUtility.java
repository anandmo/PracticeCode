package com.codethinktank.clinote;

import java.io.*;

public class NoteDataUtility {

    public static void commitNoteToStorage(NoteLinkedHashMap noteLinkedHashMap){

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("notedata.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(noteLinkedHashMap);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static NoteLinkedHashMap fetchNoteFromStorage(){

        File file = new File("notedata.txt");
        if(file.exists()) {
        try {

            FileInputStream fileInputStream = new FileInputStream("notedata.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            NoteLinkedHashMap noteLinkedHashMap = (NoteLinkedHashMap) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return noteLinkedHashMap;

        } catch (FileNotFoundException e) {
            System.out.println("Note data not found. Please add some note first");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  }

            return null;
    }

    public static boolean deleteNoteData(){

        File file = new File("notedata.txt");
        return file.delete();

    }

}
