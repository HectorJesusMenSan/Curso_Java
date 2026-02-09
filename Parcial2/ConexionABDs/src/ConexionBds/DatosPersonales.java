package ConexionBds;

public class DatosPersonales {
    private int id_dp;
    private String nombre;
    private String apellido;
    private String curp;
    private String fecha_nacimiento;

    // Constructor vacío
    public DatosPersonales() {
    }

    // Constructor con parámetros
    public DatosPersonales(String nombre, String apellido, String curp, String fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // Métodos getters y setters
    public int getId_dp() {
        return id_dp;
    }

    public void setId_dp(int id_dp) {
        this.id_dp = id_dp;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

}
