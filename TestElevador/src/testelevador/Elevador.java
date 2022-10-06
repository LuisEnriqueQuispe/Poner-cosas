
package testelevador;

public class Elevador extends Edificio{
    private final int Peso = 750;
	private int pisoF;
	private int pisoA;
 
	public Elevador(int pisoF) {
		this.pisoF = pisoF;
		pisoA = 1; 
	}
        public void controlar(int personas, int pisoDestino){
 
		if (personas * 50 > Peso)
			System.out.println( "Peso maximo superado");
		if (pisoDestino < 1)
			System.out.println( "No se puede bajar mas pisos");
		if (pisoDestino > pisoF)
			System.out.println( "No se puede subir mas pisos ");
		if (pisoA == pisoDestino)
			System.out.println( "El elevador se encuentra en el piso " + pisoDestino);
		pisoA = pisoDestino;
	}
        public int getPisoA() {
		return pisoA;
	}
 
}
