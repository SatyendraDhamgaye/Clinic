package com.model;

import com.beans.ClinicBeans;
import conn.DatabaseConnect;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClinicModel {

    String message = null;
    Connection con = DatabaseConnect.connectDB();
     PreparedStatement ps =null;
     String sql;
    public void insert(ClinicBeans beans, HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        
        
         try {
            
            sql = "INSERT INTO clinic(name , email , mobile , username , password , conpass) VALUES(?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1,beans.getName());
            ps.setString(2,beans.getEmail());
            ps.setString(3,beans.getMobile());
            ps.setString(4,beans.getUsername());
            ps.setString(5,beans.getPassword());
            ps.setString(6,beans.getConpass());
            int s = ps.executeUpdate();
            if(s==1){
                message="Data Inserted Sucessfully";
            }
         }catch( SQLException e)
                 {
                    message = e.getMessage();
                    }finally{
             response.sendRedirect("submit.jsp");
         }
    }

    
}

   
    


