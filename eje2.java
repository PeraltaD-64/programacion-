 import java.util.Scanner;
  public class eje2
  {
    public static void main(String[] args)
   {
    int n1, n2;
    byte menu;    
    Scanner m=new Scanner(System.in);
    System.out.println("[1]. Multiplos de 3 ");
    System.out.println("[2]. Numeros Impares ");
    menu=m.nextByte();
 if(menu==1)
     {
       System.out.println("Multiplos de 3 en el rango de 30 a 60 ");
       for(n1=30; n1<=60; n1++){  
       if(n1%3==0){
        System.out.println(n1);
        }
     }
    }
    else if(menu==2)
     {
        System.out.println("Numeros impares en el rango de -40 a -20 ");
        for(n2=-40; n2<=-20; n2++){
        if(n2%2!=0){
         System.out.println(n2);
         }
      }
     }
    else
      {
        System.out.println("No se selecciono alguna de las opciones dadas ");
       }
    }
 }