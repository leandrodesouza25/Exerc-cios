import java.util.Scanner;
public class Raizes {

	public static void main(String[] args) {
		int a , b , c;
		double r = 0 , s = 0 , d;
		
		
		System.out.println("Escreva A: ");
		 Scanner leia = new Scanner(System.in);
		 
		 a = leia.nextInt();
		 
		 System.out.println("Escreva B: ");
		 
		 b = leia.nextInt();
		 
         System.out.println("Escreva C: ");
		 
		 c = leia.nextInt();
		 
		 
		 r = Math.pow ((a+b),2);
		 
		 r = (a + b) * 2;
		s = (b + c) * 2;
		d = (r + s) / 2;
		
		System.out.println("O resultado é: " + d);

		 
	}

}
