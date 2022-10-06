package testelevador;

import java.util.*;

public class TestElevador{

    private static Elevador elevador = null;

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (elevador == null) {
            System.out.print("Indique cuantos pisos tiene el edificio: ");

            int pisoFinal = Integer.parseInt(teclado.nextLine());
            if (pisoFinal < 2) {
                System.out.println("Edificio debe tener minimo dos pisos");
            } else {
                elevador = new Elevador(pisoFinal);
            }
        }
        int opcion = 0;
        while (opcion != 2) {
            System.out.println("\nPiso Actual: " + elevador.getPisoA());
            System.out.println("[1] - Controlar ascensor");
            System.out.println("[2] - Salir del programa");
            System.out.print("Escoja una opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    desplazar();
                    break;
                case 2:
                    System.out.println("\nFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("Elija entre los valores 1 y 2");
            }
        }
    }

    static void desplazar() {
        System.out.print("\nCuantas personas suben al ascensor?: ");
        int personas = Integer.parseInt(teclado.nextLine());
        System.out.print("Elija piso destino: ");
        int destino = Integer.parseInt(teclado.nextLine());
        elevador.controlar(personas, destino);

    }
}
