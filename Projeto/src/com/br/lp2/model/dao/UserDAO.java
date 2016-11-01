/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.connection.SingletonConnection;
import com.br.lp2.model.javabeans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31507239
 */
public class UserDAO implements GenericDAO<User> {

    //Passo 1 - estabelecer conexão
    private final Connection connection = SingletonConnection.getInstance().getConnection();
    
    @Override
    public boolean insert(User e) {
        boolean result = false;
        
        //Passo 2 - criar o statement
        String sql = "INSERT INTO userlp2(username,password) VALUES(?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //pst.setString(1, e.getUsername());
            //pst.setString(2, e.getPassword());

            //Passo 3 - executar a consulta
            int rows = pst.executeUpdate();
            
            //Passo 4 - tratar os resultados
            if (rows == 1){
                long key = 0;
                ResultSet rs = pst.getGeneratedKeys();
                if(rs.next()) key = rs.getLong(1);
                
                //Passo 2b
                String sql2 = "INSERT INTO userinfo(firstname, lastname, email, birthday) VALUES(?, ?, ?, ?, ?, ?)";
                PreparedStatement pst2 = connection.prepareStatement(sql2);
                pst2.setLong(1, key);
                //pst2.setString(2, e.getUserinfo().getFirstname());
                //pst2.setString(3, e.getUserinfo().getLastname());
                //pst2.setString(4, e.getUserinfo().getEmail());
                //pst2.setDate(5, new java.sql.Date(e.getUserinfo().getBirthday().getTime() ) );
                //pst2.setBytes(6, e.getUserinfo().getAlgumaCoisa2());//foto
                result = true;
                
            }
            
            //Passo 5 - fechar o statement/conexão
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    @Override
    public List<User> findAll(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Passo 1 - estabelecer a conexão
        
        //Passo 2 - criar o statement
        

        //Passo 3 - executar a consulta

        
        //Passo 4 - tratar os resultados

        
        //Passo 5 - fechar o statement/conexão
    }

    @Override
    public List<User> findById(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modify(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
