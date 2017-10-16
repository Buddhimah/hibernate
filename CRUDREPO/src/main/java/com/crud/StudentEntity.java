package com.crud;

import javax.persistence.*;

/**
 * Created by buddhimah on 10/16/2017.
 */
@Entity
@Table(name = "student", schema = "students", catalog = "")
public class StudentEntity {

    private int id;
    private String name;
    @Id
    @Column(name="id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
