package com.knf.dev.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="userdetails")
public class DetailsUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

    private Date date;

    private String place;

    private int age;
    private String hobbies;

//    private String gender;

    public DetailsUser() {

    }
    public DetailsUser(String name, Date date, String place,int age,String hobbies) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.age=age;
        this.hobbies = hobbies;
//        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
