package net.sgoliver.android.recyclerview;

public class Alumno
{
    private String apellidos;
    private String nombre;
    private String clase;
    private String nivel;
    private String sexo;

    public Alumno(String apellidos, String nombre, String clase, String nivel, String sexo) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.sexo = sexo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
