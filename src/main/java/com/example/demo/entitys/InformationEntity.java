package com.example.demo.entitys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InformationEntity {
    
    private String name;
    private String date; 

    public InformationEntity(String name) {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        this.date = dateFormat.format(new Date()); 
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
