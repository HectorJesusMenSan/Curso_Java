package examentercerparcial;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    File archivo = new File("consultaLibro.txt");
    // INSERT
    public void insertar(Libro libro) {
        String sql = "INSERT INTO libro VALUES (0, ?, ?, ?, ?)";

        try (Connection con = Conexion_bds.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getAnio());

            ps.executeUpdate();
            System.out.println("Libro insertado en BD");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(int id, String isbn, String titulo, String autor, String anio) {
        String sql = "UPDATE libro SET isbn=?, titulo=?, autor=?, anio=? where id_libro = ?";

        try (Connection con = Conexion_bds.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, isbn);
            ps.setString(2, titulo);
            ps.setString(3, autor);
            ps.setString(4, anio);
            ps.setInt(5, id);


            ps.executeUpdate();
            System.out.println("Libro actualizado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(String isbn) {
        String sql = "DELETE FROM libro WHERE isbn=?";

        try (Connection con = Conexion_bds.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, isbn);
            ps.executeUpdate();
            System.out.println("Libro eliminado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT → guarda en archivo consultaLibro.txt
     public void consultar() throws IOException {

         String sql = "SELECT * FROM libro";
         File archivo = new File("src/examentercerparcial/consultaLibro.txt");

         try (Connection con = Conexion_bds.conectar();
              PreparedStatement ps = con.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {

             while (rs.next()) {
                 int id = rs.getInt("id_libro");
                 String isbn = rs.getString("isbn");
                 String titulo = rs.getString("titulo");
                 String autor = rs.getString("autor");
                 String anio = rs.getString("anio");
                 
                 System.out.println("------------");
                 System.out.println("id: " + id);
                 System.out.println("isbn: " + isbn);
                 System.out.println("titulo: " + titulo);
                 System.out.println("autor: " + autor);
                 System.out.println("anio: " + anio);
                 System.out.println("------------");

                 String linea = id + "; " + isbn + "; " + titulo + "; " + autor + "; " + anio;

                 pw.println(linea);
             }

             System.out.println("Consulta guardada en consultaLibro.txt");

         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}
