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
public class UserDiscussion implements Serializable{
    
    private Long idUserDis;
    private Long User user;
    private Long Discussion discussion;

    public UserDiscussion() {
    }

    public UserDiscussion(Long idUserDis, Long User, Long Discussion) {
        this.idUserDis = idUserDis;
        this.User = User;
        this.Discussion = Discussion;
    }

    public Long getIdUserDis() {
        return idUserDis;
    }

    public void setIdUserDis(Long idUserDis) {
        this.idUserDis = idUserDis;
    }

    public Long getUser() {
        return User;
    }

    public void setUser(Long User) {
        this.User = User;
    }

    public Long getDiscussion() {
        return Discussion;
    }

    public void setDiscussion(Long Discussion) {
        this.Discussion = Discussion;
    }
    
    
    
    
}
