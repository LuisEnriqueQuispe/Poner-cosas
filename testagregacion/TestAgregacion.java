package testagregacion;

public class TestAgregacion {

    public static void main(String[] args) {
       Automovil Mcqueen = new Automovil("SRT-401",2,"Chevrolet","Corvette");
       Motor mcqueen = new Motor(8,750);
       
       Mcqueen.setMotor(mcqueen);
       System.out.println(Mcqueen);
    }
    
}
