package fundamentos;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Qual a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Vamos calcular a media da sua prova, vc fez 4 provas");
		
		System.out.print("Quanto vc tirou na prova 1: ");
		double prova1 = entrada.nextDouble();
		
		System.out.print("Quanto vc tirou na prova 2: ");
		double prova2 = entrada.nextDouble();
		
		System.out.print("Quanto vc tirou na prova 3: ");
		double prova3 = entrada.nextDouble();
		
		System.out.print("Quanto vc tirou na prova 4: ");
		double prova4 = entrada.nextDouble();
		
		double media = (prova1 + prova2 + prova3 + prova4)/4;
		
		System.out.printf("O aluno(a) %s tem %d anos e Com a soma de todas as suas notas nas avaliacoes sua media ficou de %.1f",nome, idade, 
				media);
		
		entrada.close();
	}
}
