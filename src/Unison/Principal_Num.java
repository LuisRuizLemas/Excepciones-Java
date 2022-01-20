package Unison;


import java.util.InputMismatchException;
import java.util.Scanner;

// Luis G. Ruiz
public class Principal_Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        boolean condicion;

        do {
            condicion = false;
            try {

                System.out.println("**Programa para calculo de raiz cudrada**");
                System.out.println("Teclee un numero: ");
                numero = teclado.nextInt();

                if (numero < 0) {
                    throw new NumeroNegativoExcepcion("Error: el numero no puede ser negativo");
                }
                System.out.println("la raiz cuadrada de " + numero + " es " + Math.sqrt(numero));


            } catch (NumeroNegativoExcepcion ex) {
                System.out.println("Error: Debe introducir un número positivo.");
                condicion = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error: Debe introducir numeros.");
                condicion = true;
                System.exit(0);
            }
        }
        while (condicion);
    }
}