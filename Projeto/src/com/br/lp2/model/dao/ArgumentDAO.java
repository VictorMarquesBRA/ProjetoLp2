/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.connection.SingletonConnection;
import com.br.lp2.model.javabeans.Argument;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Killerman
 */
public class ArgumentDAO implements GenericDAO<Argument> {

    private final Connection connection = SingletonConnection.getInstance().getConnection();
    
    @Override
    public boolean insert(Argument e) {
        boolean result = false;
        
        //Passo 2 - criar o statement
        String sql = "INSERT INTO argument(id_argument, text, argumentdate, fk_user, fk_discussion) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setLong(1, e.getIdArgument());
            pst.setString(2, e.getText());
            pst.setDate(3, e.getArgumentDate());
            pst.setLong(4, e.getUser().getIdUser());
            pst.setLong(5, e.getDiscussion().getIdDiscussion());
            
            int rows = pst.executeUpdate();
            
            if (rows == 1){
                result = true;                
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserLp2DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public List<Argument> findAll(Argument e) {
        List<Argument> arguments = new ArrayList();
        
        String sql = "SELECT * FROM argument";
        
        try {
            Statement st = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ArgumentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arguments;
    }

    @Override
    public List<Argument> findById(Argument e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modify(Argument e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Argument e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}