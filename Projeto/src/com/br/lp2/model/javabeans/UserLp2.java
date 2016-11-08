/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.javabeans;

import java.io.Serializable;

/**
 *
 * @author 31507239
 */
public class UserLp2 implements Serializable {
    private Long idUser; 
    private String username;
    private String password;
    private UserInfo userinfo;
    private UserType usertype;

    public UserLp2() {
    }
    
    public UserLp2(Long idUser, String username, String password, UserInfo userinfo, UserType usertype) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.userinfo = userinfo;
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInfo userinfo) {
        this.userinfo = userinfo;
    }

    public UserType getUsertype() {
        return usertype;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    
    
    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }
    
    
}
