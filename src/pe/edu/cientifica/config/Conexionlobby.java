/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author José
 */
public class Conexionlobby {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    private static final String URL="jdbc:mysql://localhost:3306/bdinscri";
    private static final String USER = "root";
    private static final String PASS = "123456";
    public Conexionlobby(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=DriverManager.getConnection(URL,USER,PASS);
        System.out.println("Conectado");
        } 
        catch(Exception e){
            System.out.println("Error al conectar");
        }
    }
    public ArrayList<Login>Login(String username, String password){
        ArrayList<Login> res=new ArrayList<>();
        try{
            ps=cn.prepareStatement("select * from usuario where username=? and password=?");
            ps.setString(1,username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while(rs.next()){
                Login lo=new Login();
                lo.setUsername(rs.getString("username"));
                lo.setPassword(rs.getString("password"));
                res.add(lo);
            }
            if(res.isEmpty()){
                System.out.println("Acceso denegado");
            } else {
                System.out.println("Login excitoso");
            }
        }catch (Exception e){
        }
        return res;
    }
}
