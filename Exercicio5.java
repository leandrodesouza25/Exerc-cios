
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Programa: Média Ponderada.");
		System.out.println("Insira a 1 Nota:");
		n1 = entrada.nextDouble();
		
		System.out.println("Insira o 1 Peso:");
		p1 = entrada.nextDouble();
		
		System.out.println("Insira a 2 Nota:");
		n2 = entrada.nextDouble();
		
		System.out.println("Insira o 2 Peso:");
		p2 = entrada.nextDouble();
		
		System.out.println("Insira a 3� Nota:");
		n3 = entrada.nextDouble();
		
		System.out.println("Insira o 3� Peso:");
		p3 = entrada.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média final é: " + media);
		
		
	}

}
