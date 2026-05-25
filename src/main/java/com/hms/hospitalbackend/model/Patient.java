package com.hms.hospitalbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name="patients")

public class Patient {

    @Id
    private int id;

    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private String phone;

    public Patient(){}


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }


    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }


    public String getBloodGroup(){
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }


    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

}