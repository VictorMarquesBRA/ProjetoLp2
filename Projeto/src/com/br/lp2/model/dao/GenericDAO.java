/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import java.util.List;

/**
 *
 * @author 31507239
 */
public interface GenericDAO<E> {
    
    public boolean insert(E e); //C - CREATE
    
    public List<E> findAll(E e); //R - READ
    public List<E> findById(E e); //R - READ
    
    public boolean modify(E e); //U - UPDATE
    
    public boolean remove(E e); //D - DELETE
    
}
