package exercicios0603;
import java.util.Scanner;
public class CalculadoraGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis
		double consmedio,litros,custtotal,combus,disttotal;
		//instanciar classe scanner 
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("informe o valor do litro da gasolina");
		combus = ler.nextDouble();
		
		System.out.println("informe o valor da distância total");
		disttotal = ler.nextDouble();
		
		System.out.println("informe o valor do consumo medio");
		consmedio = ler.nextDouble();
		
		//Processamento
		litros = disttotal/ consmedio;
		custtotal= litros*combus;
		
		//Saída 
	    System.out.println("A quantidade de litros gasto é : " + litros );
	    System.out.println("O resultado do custo total é : " + custtotal  );
	  	
		
		
		
		
		
		
		
		
		
	}

}
