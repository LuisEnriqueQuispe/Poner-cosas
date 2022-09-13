package testcomposicion;

public class TestComposicion {

    public static void main(String[] args) {
      Persona Octavio = new Persona(1542,"Octavio","Garrido");
      Octavio.getCuenta().getNumero();
      Octavio.getCuenta().getSaldo();
      Octavio.getCuenta().setSaldo(10000);
      System.out.println(Octavio.getCuenta());
      System.out.println(Octavio);
      
    }
    
}
