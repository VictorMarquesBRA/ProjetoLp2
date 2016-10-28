/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31507239
 */
public class SingletonConnection {
    
    private static SingletonConnection instance; //objeto do mesmo tipo da classe
    private Connection connection;
    
    private SingletonConnection(){ //construtor
        ResourceBundle prop = ResourceBundle.getBundle("resources.db");
        try {
            Class.forName(prop.getString("DRIVER")); //determinando driver da conexão
            
            String url = prop.getString("PROTOCOL") + "://" + prop.getString("HOST") + "/" + prop.getString("DATABASE")
                    + ";useUnicode=yes&characterEncoding=UTF-8";
            
            connection = DriverManager.getConnection(url, prop.getString("USERNAME"), prop.getString("PASSWORD")); //gerenciar conexão
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
        
    
    public static SingletonConnection getInstance(){// retornar a mesma instância objeto
        if(instance!=null) instance = new SingletonConnection();
        return instance;
    }
    
}
