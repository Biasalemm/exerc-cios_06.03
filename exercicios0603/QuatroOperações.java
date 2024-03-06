package exercicios0603;

import java.util.Scanner;

public class QuatroOperações {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
				double a,b,som,div,mult,sub;
				//instaciar classe Scanner
				Scanner ler = new Scanner(System.in);
				
				// Entrada de dados
				System.out.println("informe valor 1: ");
				a = ler.nextDouble();
				
				System.out.println("informe valor 2: ");
				b = ler.nextDouble();
				
				//Processamento
				som = a+b;
				mult = a*b;
				div = a/b;
				sub = a-b;
				//Saída
				System.out.println("O resultado da soma é: " + som);
				System.out.println("O resultado multiplicação é: " + mult);
				System.out.println("O resultado divisão é: " + div);
				System.out.println("O resultado subtração é: " + sub);

	}

}
