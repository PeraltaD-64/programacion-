
        import java.util.Scanner;
        public class eje1
{
	public static void main(String[] args)
	{
		int in, i, d,ep, v;
		byte menu;
	Scanner m=new Scanner(System.in);
		System.out.println(" [1]. INCREMENTO ");
		System.out.println(" [2]. DECREMENTO ");
		menu=m.nextByte();
	switch(menu){
	case 1:
		do{
		System.out.print(" INGRESE EL VALOR INICIAL: ");
		in=m.nextInt();
		System.out.print(" INGRESE EL ESTADO DE PARO: ");
		ep=m.nextInt();
		System.out.print(" INGRESE EL VALOR DE INCREMENTO: ");
		i=m.nextInt();
	} 
                while(in>ep);
		for(v=in;v<=ep;v+=i){
		System.out.println("["+v+"]");
	}
		break;
		
	case 2:
		do{
		System.out.print(" INGRESE EL VALOR INICIAL: ");
		in=m.nextInt();
		System.out.print(" INGRESE EL ESTADO DE PARO: ");
		ep=m.nextInt();
	        System.out.println(" INGRESE EL VALOR DE DECREMENTO ");
		i=m.nextInt();
	}
                while(in<ep);
		for(v=in;v>=ep;v-=i){
		System.out.println("["+v+"]");
        }
        	break;
      }
    }
}