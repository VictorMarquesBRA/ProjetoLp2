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
public class Argument implements Serializable{
    
    private Long idArgument;
    private String text;
    private Date argumentDate;
    private UserLp2 user;
    private Discussion discussion;

    public Argument() {
    }

    public Argument(Long idArgument, String text, Date argumentDate, UserLp2 user, Discussion discussion) {
        this.idArgument = idArgument;
        this.text = text;
        this.argumentDate = argumentDate;
        this.user = user;
        this.discussion = discussion;
    }

    public Long getIdArgument() {
        return idArgument;
    }

    public void setIdArgument(Long idArgument) {
        this.idArgument = idArgument;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getArgumentDate() {
        return argumentDate;
    }

    public void setArgumentDate(Date argumentDate) {
        this.argumentDate = argumentDate;
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
