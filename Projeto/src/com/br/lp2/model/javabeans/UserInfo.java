/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.javabeans;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author 31507239
 */
public class UserInfo implements Serializable {
    private Long idUserinfo;
    private String firstname;
    private String lastname;
    private char gender;
    private String email;
    private Date birthday;
    private byte[] photo;

    public UserInfo() {
    }

    public UserInfo(Long idUserinfo, String firstname, String lastname, char gender, String email, Date birthday, byte[] photo) {
        this.idUserinfo = idUserinfo;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
        this.photo = photo;
    }

    public Long getIdUserinfo() {
        return idUserinfo;
    }

    public void setIdUserinfo(Long idUserinfo) {
        this.idUserinfo = idUserinfo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    
}
