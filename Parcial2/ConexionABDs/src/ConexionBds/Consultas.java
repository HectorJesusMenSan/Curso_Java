/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBds;
import  java.sql.*;


public class Consultas {
     public void insertar(DatosPersonales persona){
          String sql = "INSERT INTO datos_personales(nombre, apellido, curp, fecha_nacimiento) VALUE (?,?,?,?)";
          try {
            Connection con = Conexion_a_bases_de_dts.conexion();
            //Preparar Sentencia
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getCurp());
            ps.setString(4, persona.getFecha_nacimiento());

            ps.executeUpdate();
            System.out.println("Insertado");            
          }
          catch(SQLException e){
            e.printStackTrace();
          }
     }
        
     public void leerDatos(){
          //Definir sentencia
          String sql = "select * from datos_personales";
          try{
            Connection con =  Conexion_a_bases_de_dts.conexion();
            //Preparar Sentencia
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("Seleccionado");
            while(rs.next()){
               //Recibir toda la informacion
               int id = rs.getInt("id_datos_personales");
               String nombre = rs.getNString("nombre");
               Date nac = rs.getDate("fecha_nacimiento");
               System.out.println("id_datos_personales: " +  id);
               System.out.println("Fecha de nacimiento: " +  nac);                    
               System.out.println("nombre: " +  nombre);
            }
          }
       catch (SQLException e ){
            e.printStackTrace();
        }
     }
     public void  ActualizarDatos(int id_buscar, String nvo_nombre){
          //definir l sentencia
          String sql ="update datos_personales set nombre = ? where id_datos_personales = ?";
          try{
               Connection con = Conexion_a_bases_de_dts.conexion();
               //Preparar Sentencia
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, nvo_nombre);
               ps.setInt(2, id_buscar);
               ps.executeUpdate();
               System.out.println("Dato Actualizado");
          }
          catch(SQLException e){
               e.printStackTrace();
          }
    }

     public void EliminarDato(int id){
          String sql ="delete from datos_personales where id_datos_personales = ?";     
          try{
               Connection con = Conexion_a_bases_de_dts.conexion();
               //Preparar Sentencia
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, id);
               ps.executeUpdate();
               System.out.println("Dato Eleminado");
          }
          catch(SQLException e){
               e.printStackTrace();
          }
    }
}
