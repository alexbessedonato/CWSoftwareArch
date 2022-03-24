package com.example.part1.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Sessions {
    @Id
    @GeneratedValue
    private long id;
    private String topic;
    private Timestamp datetime;
    private int duration;

    @ManyToOne
    private Modules modules;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }
}
