/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBds;
import  java.sql.*;

/**
 *
 * @author sc03m14
 */
public class Conexion_a_bases_de_dts {
    private static String url="jdbc:mysql://localhost:3306/alumno";
    private static String user="root";
    private static String pass="Santiago3000#";
    
    //Se define un metodo de conexion
    public static Connection conexion(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("conexion exitosa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    
}
