package testherencia;

public class EmpleadoProduccion extends Asalariado{
    
    private String turno;

    public EmpleadoProduccion(String turno, String nombre, long dni, int diasdiasVacaciones) {
        super(nombre, dni, diasdiasVacaciones);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }   
}
