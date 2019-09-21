package Entidades;

public class Estudiante {
    private String Nombre;
    private String Coidigo;
    private String Materia;
    private Double Parcial1;
    private Double Parcial2;
    private Double Parcial3;
    private Double Promedio;

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCoidigo() {
        return this.Coidigo;
    }

    public void setCoidigo(String coidigo) {
        this.Coidigo = coidigo;
    }

    public String getMateria() {
        return this.Materia;
    }

    public void setMateria(String materia) {
        this.Materia = materia;
    }

    public Double getParcial1() {
        return this.Parcial1;
    }

    public void setParcial1(Double parcial1) {
        this.Parcial1 = parcial1;
    }

    public Double getParcial2() {
        return this.Parcial2;
    }

    public void setParcial2(Double parcial2) {
        this.Parcial2 = parcial2;
    }

    public Double getParcial3() {
        return this.Parcial3;
    }

    public void setParcial3(Double parcial3) {
        this.Parcial3 = parcial3;
    }

    public Double getPromedio() {
        return this.Promedio;
    }

    public void setPromedio(Double promedio) {
        this.Promedio = promedio;
    }
}
