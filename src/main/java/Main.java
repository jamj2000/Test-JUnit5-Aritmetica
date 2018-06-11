// José Antonio Muñoz Jiménez - Junio 2018

import java.util.Arrays;

public class Main {

  private static final int NUM1 = 5;
  private static final int NUM2 = 2;
  private static final int NUM3 = 10;

  public static void main (String[] args) {
    System.out.println ("Dados los números " + NUM1 + " y " + NUM2 );
    System.out.println ("La suma es " + Aritmetica.suma(NUM1, NUM2) );
    System.out.println ("La resta es " + Aritmetica.resta(NUM1, NUM2) );
    System.out.println ("La multiplicación es " + Aritmetica.multiplicacion(NUM1, NUM2) );
    System.out.println ("La división es " + Aritmetica.division(NUM1, NUM2) );
    
    System.out.println ();
    System.out.println ("Ordenamos los siguientes números: " + NUM1 + ", " + NUM2 + ", " + NUM3);
    System.out.println ("Los números ordenados son: " +  Arrays.toString (Utilidades.ordenar(NUM1, NUM2, NUM3))) ;
  }
}
