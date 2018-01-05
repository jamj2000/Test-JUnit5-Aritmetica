public class Utilidades {

  public static int[] ordenar (int num1, int num2, int num3) {
       int [] ordenados;

       if ( num1 < num2  &&  num1 < num3 ){
           if ( num2 < num3 )  ordenados = new int[] { num1, num2, num3};
           else                ordenados = new int[] { num1, num3, num2};
       }
       else if ( num2 < num1  &&  num2 < num3 ){
           if ( num1 < num3 )  ordenados = new int[] { num2, num1, num3};
           else                ordenados = new int[] { num2, num3, num1};
       }
       else if ( num3 < num1  &&  num3 < num2 ){
           if ( num1 < num2 )   ordenados = new int[] { num3, num1, num2};
           else                 ordenados = new int[] { num3, num3, num1};
       }
       else // Números iguales
         ordenados = new int[] { num1, num2, num3};

      return  ordenados;
  }

}