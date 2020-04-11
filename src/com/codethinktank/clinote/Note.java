package com.codethinktank.clinote;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note implements Serializable {

    private String note,title;
    private String date_in_String;


    public Note(String note,String title) {
        this.title = title;
        this.note = note;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date_in_String = dateTime.format(dateTimeFormatter);
    }

    public String getDateTime() {
       return date_in_String;
    }

    public String getNote(){
        return  title+" -> "+note;
    }

}
