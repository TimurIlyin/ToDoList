package ru.tuxoft.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Event {

    private Date date;
    private String event;
    private String comment;

    public Event() {
    }

    public Event(Date date, String event, String comment) {
        this.date = date;
        this.event = event;
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}