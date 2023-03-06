
  import static java.lang.Math.sqrt;
    import java.util.Scanner;
    
    public class triangulos
    {

     public static void main(String[] args) 
     {
     
      float l1, l2, l3, a, sp, raiz;
       Scanner d = new Scanner(System.in);

         System.out.print("***Ingresa el lado 1A del triangulo: ");
          l1 = d.nextFloat();
         System.out.print("***Ingresa el lado 2B del triangulo: ");
          l2 = d.nextFloat();
         System.out.print("***Ingresa el lado 3C del trinagulo; ");
          l3 = d.nextFloat();         

         if(l1 == l2 && l2 == l3)
          {
            System.out.println("Tipo de triangulo: Equlatero");
          }
         else if(l1 != l2 && l2 != l3 && l1 != l3)
          {
            System.out.println("Tipo de triangulo: Escaleno");
          }
         else
          {
            System.out.println("Tipo de triangulo: Isosceles");
          }


              sp = (l1 + l2 +l3)/2;
              raiz = sp*(sp-l1)*(sp-l2)*(sp-l3);
              a = (float) sqrt(raiz);
                System.out.println("El area del triangulo: " +a+ " Metros cuadrados");
       }
    }
