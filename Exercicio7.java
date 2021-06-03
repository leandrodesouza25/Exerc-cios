import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
  
	  
	  double a , b , c , d , e, f , x , y;
	  
	  System.out.println("Insira A: ");
      
	  Scanner ler = new Scanner(System.in);
	  
	  a = ler.nextDouble();
	  
	  System.out.println("Insira B: ");
      b = ler.nextDouble();
      
      System.out.println("Insira C: ");
      c = ler.nextDouble();
      
      System.out.println("Insira D: ");
      d = ler.nextDouble();
      
      System.out.println("Insira E: ");
      e = ler.nextDouble();
      
      System.out.println("Insira F: ");
      f = ler.nextDouble();
      
      x = (c*e)-(b*f)/(a*e)-(b*d);
      y = (a*f)-(c+d)/(a*e)-(b*d);
      
      System.out.println("O valor de X é: " + x);
      System.out.println("O valor de Y é: " + y);

  
  
  
  
  
  
}
  
}
