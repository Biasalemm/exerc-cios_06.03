package exercicios0603;

import java.util.Scanner;

public class BaseeAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
				double base,altura,area;
				//instaciar classe scanner
				Scanner ler  = new Scanner (System.in);
				
				//Entrada de dados 
				System.out.println("informe o valor da base: ");
				base = ler.nextDouble();
				
				System.out.println("informe o valor da altura: ");
				altura = ler.nextDouble();
				
				//Processamento
				area = (base* altura)/ 2;
				//Saída 
				 System.out.println(" o resultado da area é : " + area );
	}

}
