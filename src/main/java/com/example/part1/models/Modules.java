package com.example.part1.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Modules {

    @Id
    private String code;
    private String title;
    private int level;
    private boolean optional;

    @ManyToMany
    @JoinTable(
            name = "modules_taught",
            joinColumns = @JoinColumn(name = "module_code"),
            inverseJoinColumns = @JoinColumn(name = "convenor_id")

    )
    private Set<Convenors> convenors = new HashSet<>();

    @OneToMany(mappedBy = "module")
    private Set<Sessions> sessions = new HashSet<>();


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public Set<Convenors> getConvenors() {
        return convenors;
    }

    public void setConvenors(Set<Convenors> convenors) {
        this.convenors = convenors;
    }

    public Set<Sessions> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Sessions> sessions) {
        this.sessions = sessions;
    }
}
