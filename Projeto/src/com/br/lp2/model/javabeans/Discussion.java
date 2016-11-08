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
public class Discussion implements Serializable{
    
    private Long idDiscussion;
    private String name;
    private Date discussionDate;
    private UserLp2 user;
    

    public Discussion() {
        
    }

    public Discussion(Long idDiscussion, String name, Date discussionDate, UserLp2 user) {
        this.idDiscussion = idDiscussion;
        this.name = name;
        this.discussionDate = discussionDate;
        this.user = user;
    }

    public Long getIdDiscussion() {
        return idDiscussion;
    }

    public void setIdDiscussion(Long idDiscussion) {
        this.idDiscussion = idDiscussion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDiscussionDate() {
        return discussionDate;
    }

    public void setDiscussionDate(Date discussionDate) {
        this.discussionDate = discussionDate;
    }

    public UserLp2 getUser() {
        return user;
    }

    public void setUser(UserLp2 user) {
        this.user = user;
    }
    
}
