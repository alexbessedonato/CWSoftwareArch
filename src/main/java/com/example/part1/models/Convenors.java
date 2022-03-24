package com.example.part1.models;

import javax.persistence.*;
import javax.swing.text.Position;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
public class Convenors {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Position position;


    @ManyToMany(mappedBy = "convenors")
    private Set<Modules> modules = new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setModules(Set<Modules> modules) {
        this.modules = modules;
    }
}
