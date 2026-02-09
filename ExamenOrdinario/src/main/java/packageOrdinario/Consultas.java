/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOrdinario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jesusito
 */
public class Consultas {
    public void insertarProfesorBD(Profesor p) {

        String sql = "INSERT INTO profesor(nombre, apellido, correo, telefono) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getCorreo());
            ps.setInt(4, p.getTelefono());

            ps.executeUpdate();
            System.out.println("✅ Profesor guardado en BD");

        } 
        catch (Exception e) {
            System.out.println("❌ Error al guardar profesor: " + e.getMessage());
        }
    
    }
    public void consultarProfesores() {

        String sql = "SELECT id, nombre, apellido, correo, telefono FROM profesor";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- LISTA DE PROFESORES ---");

            boolean hayRegistros = false;

            while (rs.next()) {
                hayRegistros = true;

                System.out.println("-----------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Correo: " + rs.getString("correo"));
                System.out.println("Teléfono: " + rs.getString("telefono"));
            }

            if (!hayRegistros) {
                System.out.println("⚠️ No hay profesores registrados.");
            }

        } 
        catch (SQLException e) {
            System.out.println("❌ Error al consultar profesores: " + e.getMessage());
        }
    }
    
    public void editarProfesor() {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n--- EDITAR PROFESOR ---");
            System.out.print("Ingrese el ID del profesor a editar: ");
            int id = sc.nextInt();
            sc.nextLine();

            String sqlBuscar = "SELECT * FROM profesor WHERE id = ?";
            String sqlActualizar = "UPDATE profesor SET nombre = ?, apellido = ?, correo = ?, telefono = ? WHERE id = ?";

            try (Connection con = Conexion.getConexion();
                 PreparedStatement psBuscar = con.prepareStatement(sqlBuscar)) {

                psBuscar.setInt(1, id);
                ResultSet rs = psBuscar.executeQuery();

                if (!rs.next()) {
                    System.out.println("❌ No existe un profesor con ese ID.");
                    return;
                }

                // Mostrar datos actuales
                System.out.println("\nDatos actuales:");
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Correo: " + rs.getString("correo"));
                System.out.println("Teléfono: " + rs.getString("telefono"));

                // Pedir nuevos datos
                System.out.println("\nIngrese los nuevos datos:");

                System.out.print("Nuevo nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Nuevo apellido: ");
                String apellido = sc.nextLine();

                System.out.print("Nuevo correo: ");
                String correo = sc.nextLine();

                System.out.print("Nuevo teléfono: ");
                String telefono = sc.nextLine();

                try (PreparedStatement psActualizar = con.prepareStatement(sqlActualizar)) {

                    psActualizar.setString(1, nombre);
                    psActualizar.setString(2, apellido);
                    psActualizar.setString(3, correo);
                    psActualizar.setString(4, telefono);
                    psActualizar.setInt(5, id);

                    int filas = psActualizar.executeUpdate();

                    if (filas > 0) {
                        System.out.println("✅ Profesor actualizado correctamente.");
                    }

                }

            } 
            catch (SQLException e) {
                System.out.println("❌ Error al editar profesor: " + e.getMessage());
            }
        }
    public void eliminarProfesorBD(int idProfesor) {
        String sql = "DELETE FROM profesor WHERE id = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idProfesor);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Profesor eliminado exitosamente");
            } else {
                System.out.println("❌ No se encontró un profesor con ese ID");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar profesor: " + e.getMessage());
        }
    }
    
    // .....................aLUMNOS

    // 1. INSERTAR ALUMNO
    public void insertarAlumnoBD(Alumno a) {
        String sql = "INSERT INTO alumno(nombre, apellido, matricula, correo) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getMatricula());
            ps.setString(4, a.getCorreo());

            ps.executeUpdate();
            System.out.println("Alumno guardado en BD");

        } catch (SQLException e) {
            System.out.println("Error al guardar alumno: " + e.getMessage());
        }
    }

    // 2. CONSULTAR ALUMNOS
    public void consultarAlumnos() {
        String sql = "SELECT id, nombre, apellido, matricula, correo FROM alumno";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- LISTA DE ALUMNOS ---");
            boolean hayRegistros = false;

            while (rs.next()) {
                hayRegistros = true;
                System.out.println("-----------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Matrícula: " + rs.getString("matricula"));
                System.out.println("Correo: " + rs.getString("correo"));
            }

            if (!hayRegistros) {
                System.out.println("️ No hay alumnos registrados.");
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar alumnos: " + e.getMessage());
        }
    }

// 3. EDITAR ALUMNO
    public void editarAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- EDITAR ALUMNO ---");
        System.out.print("Ingrese el ID del alumno a editar: ");
        int id = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String sqlBuscar = "SELECT * FROM alumno WHERE id = ?";
        String sqlActualizar = "UPDATE alumno SET nombre = ?, apellido = ?, matricula = ?, correo = ? WHERE id = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement psBuscar = con.prepareStatement(sqlBuscar)) {

            psBuscar.setInt(1, id);
            ResultSet rs = psBuscar.executeQuery();

            if (!rs.next()) {
                System.out.println("❌ No existe un alumno con ese ID.");
                return;
            }

            // Mostrar datos actuales
            System.out.println("\nDatos actuales:");
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Apellido: " + rs.getString("apellido"));
            System.out.println("Matrícula: " + rs.getString("matricula"));
            System.out.println("Correo: " + rs.getString("correo"));

            // Pedir nuevos datos
            System.out.println("\nIngrese los nuevos datos:");

            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nuevo apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Nuevo matrícula: ");
            String matricula = sc.nextLine();

            System.out.print("Nuevo correo: ");
            String correo = sc.nextLine();

            try (PreparedStatement psActualizar = con.prepareStatement(sqlActualizar)) {

                psActualizar.setString(1, nombre);
                psActualizar.setString(2, apellido);
                psActualizar.setString(3, matricula);
                psActualizar.setString(4, correo);
                psActualizar.setInt(5, id);

                int filas = psActualizar.executeUpdate();

                if (filas > 0) {
                    System.out.println("✅ Alumno actualizado correctamente.");
                }
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al editar alumno: " + e.getMessage());
        }
        
    }

// 4. ELIMINAR ALUMNO
    public void eliminarAlumnoBD(int idAlumno) {
        String sql = "DELETE FROM alumno WHERE id = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Alumno eliminado exitosamente");
            } else {
                System.out.println("❌ No se encontró un alumno con ese ID");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar alumno: " + e.getMessage());
        }
    }

}
