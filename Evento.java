// 3 - Sistema que leia o tempo de duração de um evento, expresso em segundos, mostrado em anos, meses e dias
import java.util.Scanner;
public class Evento {

	public static void main(String[] args) {
	
                 int minutos , segundos, horas;
                 System.out.println("Digite o tempo em segundos");
                 Scanner leia = new Scanner(System.in);
                 
                  segundos = leia.nextInt();
                  

              	minutos = (segundos / 60);
              	horas = (minutos * 60);
              	
              	System.out.println(("O tempo total do evento é de\n " + horas + "horas \n " + minutos + "minutos \n " + segundos + "segundos ")
);
                		 
                		 
                		 ;
	}

}
