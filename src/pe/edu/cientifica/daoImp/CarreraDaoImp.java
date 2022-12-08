/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.daoImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.edu.cientifica.config.Conexion;
import pe.edu.cientifica.dao.Operaciones;
import pe.edu.cientifica.model.Carrera;
/**
 *
 * @author José
 */
public class CarreraDaoImp implements Operaciones<Carrera> {
    private PreparedStatement ps;
    private Connection cx;  
    private ResultSet rs;
    @Override
    public int create(Carrera t) {
        String SQL = "INSERT INTO carrera (nombre) VALUES(?)";
        int x=0;
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getCarre());
            x = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error:"+ e);   
        }
        return x;
    }

    @Override
    public int update(Carrera t) {
        String SQL = "UPDATE carrera SET nombre=? WHERE idcarrera=?";
        int x = 0;
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getCarre());
            ps.setInt(2, t.getIdcarrera());
            x= ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "DELETE FROM carrera WHERE idcarrera=?";
        int x=0;
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1,id);
            x=ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Carrera read(int id) {
        String SQL = "SELECT *FROM carrera WHERE idcarrera=?";
        Carrera c =  new Carrera();
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while(rs.next()){ 
                c.setIdcarrera(rs.getInt("idcarrera"));
                c.setCarre(rs.getString("nombre"));
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return c;
    }

    @Override
    public List<Carrera> readAll() {
        String SQL = "SELECT *FROM carrera";
        List<Carrera> lista = new ArrayList<>();
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs= ps.executeQuery();
            while(rs.next()){
                Carrera c =  new Carrera();
                c.setIdcarrera(rs.getInt("idcarrera"));
                c.setCarre(rs.getString("nombre"));
                lista.add(c);
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }   
        return lista;
    }

    @Override
    public List<Map<String, Object>> readAll2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
