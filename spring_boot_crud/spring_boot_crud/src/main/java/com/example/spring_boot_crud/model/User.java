package com.example.spring_boot_crud.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    @NotEmpty(message = "Name is not empty")
    @Size(min = 2, max = 15, message = "Name has min 2 simbols and max 15")
    private String name;

    @Column(name = "lastname")
    @NotEmpty(message = "Lastname is not empty")
    private String lastname;

    @Column(name = "age")
    @Min(value = 0, message = "Ege must be bigger 0")
    private int age;

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int id, String name, int age, String lastname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }
}
