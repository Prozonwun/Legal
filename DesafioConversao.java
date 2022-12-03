package TreinoDuvidas;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("quanto vc recebeu de salario: ");
		String sal1 = entrada.next().replace(",", ".");
		
		System.out.print("quanto vc recebeu de salario: ");
		String sal2 = entrada.next().replace(",", ".");
		
		System.out.print("quanto vc recebeu de salario: ");
		String sal3 = entrada.next().replace(",", ".");// usando o replace, n vai importar se a pessoa utilizar uma "," ou um "." para separar os numeros decimais do
									//salario
		
		System.out.println("estamos calculando a media... ");
		
		double nume1 = Double.parseDouble(sal1);
		double nume2 = Double.parseDouble(sal2);
		double nume3 = Double.parseDouble(sal3);
		double media = (nume1 + nume2 + nume3) / 3;
		
		System.out.printf("uma recebe %.2f, outro %.2f e o outro %.2f a soma de todos os salarios dá uma media de %.2f", nume1, nume2, nume3, media);
		
		entrada.close();
	}
}
