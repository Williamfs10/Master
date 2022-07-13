import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Operacoes o = new Operacoes ();
				
        
		Scanner scanner = new Scanner(System.in); 
          System.out.println("Digite o 1° valor:");
            int v1 = scanner.nextInt();
          System.out.println("Digite o 2° valor:");
           int v2 = scanner.nextInt();
          
         o.soma(v1,v2);
         
         System.out.println("vamos iniciar a operação de divisão");
          System.out.println("Digite o 1° valor:");
          int v3 = scanner.nextInt();
         System.out.println("Digite o 2° valor:");
          int v4 = scanner.nextInt();
          o.dividir(v3,v4);
          
        System.out.println("Digite o 1° valor:");
        int n5 = scanner.nextInt();
        System.out.println("Digite o 2° valor:");
        int n6 = scanner.nextInt();
        o.multiplicar(n5, n6);
        System.out.println("Digite o 1° valor:");
        int p1 = scanner.nextInt();
        System.out.println("Digite o 2° valor");
        int p2 = scanner.nextInt();
        o.subtracao(p1,p2);
        
        
        	
          
	}
}
     
        
	


   