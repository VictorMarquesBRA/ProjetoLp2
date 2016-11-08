/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.javabeans.UserLp2;
import java.util.List;

/**
 *
 * @author 31507239
 */
public interface GenericDAO<E> {
    
    public boolean insert(E e); //C - CREATE
    
    public List<E> findAll(E e); //R - READ
    public UserLp2 findById(long id); //R - READ
    
    public boolean modify(E e); //U - UPDATE
    
    public boolean remove(E e); //D - DELETE
    
}
