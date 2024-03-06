package exercicios0603;
import java.util.Scanner;
public class Convertermoeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double real,dolar;
		//instaciar classe scanner
		Scanner ler  = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("informe o valor em real");
		real = ler.nextDouble();
		
		//Processamento
		dolar = real*4.94;
		
		//Saída 
		System.out.println(" o valor da conversão é : " + dolar);
	    
	    

	}

}
