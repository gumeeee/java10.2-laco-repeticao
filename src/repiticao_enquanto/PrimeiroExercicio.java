package repiticao_enquanto;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int idade, totalMaiorQue50 = 0, totalMenorQue21 = 0;
		String opcao = "s";
		
		System.out.print("Digite a idade das pessoas \n");
		while(!opcao.equals("n")) {
			System.out.print("Idade: ");
			idade = leitura.nextInt();
			
			if (idade < 0) {
				System.out.println("Idade negativa");
			}
			else if (idade < 21) {
				totalMenorQue21++;
			} else if(idade > 50) {
				totalMaiorQue50++;
			}
			
			System.out.println("Deseja continuar? (s/n)");
			opcao = leitura.next();
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalMenorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiorQue50);
		
	}
}
