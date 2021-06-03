import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
		 // Por: Leandro de Souza
		
		  int anos , meses , dias , idade;
		  
		  System.out.println("Digite sua idade: ");
            Scanner leia = new Scanner(System.in);
            
            anos = leia.nextInt();
            
            System.out.println("Digite quantos meses se passaram desde seu aniversário: ");
       
            meses = leia.nextInt();
            
            System.out.println("Digite a quantidade em dias");
            
            dias = leia.nextInt();
            
            idade = anos*365 + meses * 30 + dias ;
            
            System.out.println("Sua idade em dias é: " + idade + " Dias");
            
	}

}
