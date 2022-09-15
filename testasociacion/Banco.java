package testasociacion;

public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    public void agregarCliente(Persona persona){
        
    }
    public Persona darBajaCliente(Persona persona){
      return persona;  
    }
    public boolean buscarCliente(Persona persona){
    
    }
    public void clientesTipo(char tipo){
        
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }
    
}   
    
