import java.util.Scanner; 
 public class imc
{      public static void main(String[] args) 
  { 
   double peso,altura,imc; 
   Scanner entrada=new Scanner(System.in);    System.out.println("Introduzca su peso");    peso=entrada.nextDouble(); 
   System.out.println("Introduzca su altura");    altura=entrada.nextDouble();    imc=peso/(altura*altura); 
   System.out.println("SUIMC es de ["+imc+"]");    if(imc<=18.4) 
 { 
  System.out.println("Insuficiencia ponderal"); 
 }   else if(imc>=18.5 && imc<=24.9) 
 { 
  System.out.println("Normal"); 
 }   else if(imc>=25 && imc<=29.9) 
 { 
  System.out.println("Sobrepeso"); 
 }    else if(imc>=30 && imc<=34.9) 
 { 
  System.out.println("Obesidad II"); 
 }   else 
 { 
  System.out.println("Obesidad III"); 
  } 
 } 
} 
