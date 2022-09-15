package testherencia;

public class EmpleadoDistribucion extends Asalariado{
    
    private String region;

    public EmpleadoDistribucion(String region, String nombre, long dni, int diasdiasVacaciones) {
        super(nombre, dni, diasdiasVacaciones);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }  
}
