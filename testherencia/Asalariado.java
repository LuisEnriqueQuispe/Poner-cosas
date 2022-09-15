/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testherencia;

/**
 *
 * @author Alumno
 */
public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;

    public Asalariado(String nombre, long dni, int diasdiasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long nuevo_dni) {
        this.dni = nuevo_dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }
}
