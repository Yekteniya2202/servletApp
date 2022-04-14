package com.company.model;

import java.io.Serializable;

public class Client implements Serializable {
    private Integer id;
    private String name;
    private String lastname;
    private String phone;

    public Client(int id, String name, String lastname, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getPhone(){
        return this.phone;
    }
}
