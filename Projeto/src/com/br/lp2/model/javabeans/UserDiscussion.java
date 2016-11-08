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
    private UserLp2 user;
    private Discussion discussion;    

    public UserDiscussion() {
    }
    
    public UserDiscussion(Long idUserDis, UserLp2 user, Discussion discussion) {
        this.idUserDis = idUserDis;
        this.user = user;
        this.discussion = discussion;
    }

    public Long getIdUserDis() {
        return idUserDis;
    }

    public void setIdUserDis(Long idUserDis) {
        this.idUserDis = idUserDis;
    }

    public UserLp2 getUser() {
        return user;
    }

    public void setUser(UserLp2 user) {
        this.user = user;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }
    
}
