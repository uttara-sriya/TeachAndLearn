package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sampa on 24-07-2016.
 */
@Entity
@Table(name = "user_students")
public class UserStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentid")
    private long studentId;
    @Column(name = "role_id")
    private long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private  String lastName;

    public UserStudent(){}
    public UserStudent(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
