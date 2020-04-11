package com.codethinktank.clinote;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class NoteLinkedHashMap implements Serializable {

    private  Map<String,Note> newNoteMap;
    private static int counter = 0;

    public NoteLinkedHashMap(String key,Note demonote) {
        counter++;
        newNoteMap = new LinkedHashMap<>();
        newNoteMap.put(key+" "+counter,demonote);

    }


    public void addNoteToLinkedHashMap(String date,Note note) {

        counter++;
        newNoteMap.put(date+" "+counter,note);

    }

    public void displayAllNotes() {

        for(Map.Entry<String,Note> entry : newNoteMap.entrySet()){
           String date = entry.getKey();
           Note note = entry.getValue();
           System.out.println(date+" -> "+note.getNote());

        }

    }

}
