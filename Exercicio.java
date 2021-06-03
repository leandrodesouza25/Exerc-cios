import java.util.Scanner;

public class Exercicio {
	//Expresse em anos , dias e meses sua idade

	public static void main(String[] args) {
	        
		int diasdevida , anosdevida , mesesdevida;
		
		System.out.println("Digite sua idade em dias de vida: ");
		Scanner  leia = new Scanner(System.in);
		
		diasdevida = leia.nextInt();
		
		anosdevida = ( diasdevida / 365);
		mesesdevida = (diasdevida / 30);
		
		System.out.println("Você tem " + anosdevida + " Anos de idade " + mesesdevida + " meses de vida " + diasdevida + "dias de vida");
		
		
		
			
		

		
		
				
				;
		
		

	}

}
