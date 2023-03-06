public class numeracion2 {

     public static void main (String[] args) {
      int a=500, num = 0;
   
        while(a>=440) {
          if(a<=500 &&  a >=480) {
            System.out.println(a);
            }
        else if(a<=460 && a >=440) {
             System.out.println(a);
            }
        if (a%10 == 0){
            num++;
      }
     a-=4;
   }

 System.out.println("Numeros que terminen en cero:" + num);

  }
}