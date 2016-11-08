/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.connection.SingletonConnection;
import com.br.lp2.model.javabeans.UserInfo;
import com.br.lp2.model.javabeans.UserLp2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31507239
 */
public class UserLp2DAO implements GenericDAO<UserLp2> {

    //Passo 1 - estabelecer conexão
    private final Connection connection = SingletonConnection.getInstance().getConnection();
    
    @Override
    public boolean insert(UserLp2 e) {
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
                String sql2 = "INSERT INTO userinfo(firstname, lastname, email, birthday, gender, photo) VALUES(?, ?, ?, ?, ?, ?)";
                PreparedStatement pst2 = connection.prepareStatement(sql2);
                pst2.setLong(1, key);
                pst2.setString(2, e.getUserinfo().getFirstname());
                pst2.setString(3, e.getUserinfo().getLastname());
                pst2.setString(4, e.getUserinfo().getEmail());
                pst2.setDate(5, new java.sql.Date(e.getUserinfo().getBirthday().getTime() ) );
                pst2.setString(6, String.valueOf(e.getUserinfo().getGender()));
                pst2.setBytes(7, e.getUserinfo().getPhoto());//foto
                
                int rows2 = pst2.executeUpdate();
                
                if (rows2>0) {
                    result = true;
                }
                
                pst2.close();
                
            }
            
            //Passo 5 - fechar o statement/conexão
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserLp2DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    @Override
    public List<UserLp2> findAll(UserLp2 e) {

        List<UserLp2> users = new ArrayList<>();
        
        //Passo 2
        String sql = "SELECT * FROM userlp2 INNER JOIN userinfo ON id_userlp2=id_userinfo";
        try {
            Statement st = connection.createStatement();
            
            //Passo 3
            ResultSet rs = st.executeQuery(sql);
            
            //Passo 4
            while(rs!=null && rs.next()){
                UserInfo ui = new UserInfo();
                ui.setIdUserinfo(  rs.getLong("id_userinfo")  );
                ui.setFirstname(   rs.getString("firstname")   );
                ui.setLastname(  rs.getString("lastname")  );
                ui.setEmail(  rs.getString("email")  );
                ui.setBirthday(new java.util.Date(rs.getDate("birthday").getTime())  );
                ui.setGender(rs.getString("gender"));
                ui.setPhoto(rs.getBytes("photo"));
                
                Userlp2 u = new Userlp2();
                u.setUsername(  rs.getString("username")  );
                u.setPassword(  rs.getString("password")  );
                u.setId_userlp2( rs.getLong("id_userlp2"));
                u.setUserinfo(ui);
                
                users.add(u);
            }
            
            //Passo 5
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Userlp2DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }

    @Override
    public List<UserLp2> findById(UserLp2 e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modify(UserLp2 e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(UserLp2 e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
