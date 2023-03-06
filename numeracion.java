public class numeracion {

     public static void main (String[] args) {
      int s, num=0;
   
        for(s=500; s>=440; s-=4) {
          if(s<=500 &&  s >=480) {
            System.out.println(s);
            }
        else if(s<=460 && s >=440) {
             System.out.println(s);
            }
        if (s%10 == 0){
            num++;
      }
   }
 System.out.println("Numeros que terminan en cero:" + num);
  }
}