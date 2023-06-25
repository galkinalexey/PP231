package com.galkin.spring.mvcdao.models;


import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotEmpty(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 35, message = "Длина имени должна быть больше 2 и меньше 35 символов")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Поле фамилия должно быть заполнено")
    @Size(min = 2, max = 35, message = "Длина фамилии должна быть больше 2 и меньше 35 символов")
    private String surname;

    @Column(name = "age")
    @Min(value = 1, message = "Возраст не может быть меньше или равняться нулю")
    private byte age;

    @Column(name = "email")
    @NotEmpty (message = "Поле Email должно быть заполнено")
    @Email(message = "Введен некорректный адрес электронной почты")
    private String email;

    public User() { }

    public User(long id, String name, String surname, byte age, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
