/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.cientifica.test;
import pe.edu.cientifica.config.Conexion;
/**
 *
 * @author José
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conexion();
        //listar();
        //listar2();
        //crear();
        //editar();
        //eliminar();
        if(Conexion.getConexion()!=null){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    
}
