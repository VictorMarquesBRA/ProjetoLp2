/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.javabeans;

/**
 *
 * @author Killerman
 */
public class UserType {
    private Long idUserType;
    private String typename;

    public UserType(Long idUserType, String typename) {
        this.idUserType = idUserType;
        this.typename = typename;
    }

    public UserType() {
    }

    public Long getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Long idUserType) {
        this.idUserType = idUserType;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
    
    
}
