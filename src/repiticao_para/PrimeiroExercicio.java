package repiticao_para;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int quantidadeNumeros, qtdNumerosPares = 0, qtdNumerosImpares = 0;
		
		System.out.print("Quantos números deseja digitar: ");
		quantidadeNumeros = leitura.nextInt();
		
		for (int i =0; i < quantidadeNumeros; i++) {
			int numero;
			int contador = i + 1;
			
			System.out.print("Digite o " + contador + "º número: ");
			numero = leitura.nextInt();
			
			if (numero % 2 == 0) {
				qtdNumerosPares++;
			} else {
				qtdNumerosImpares++;
			}
			
		}
		System.out.println("Total de números pares: " + qtdNumerosPares);
		System.out.println("Total de números ímpares: " + qtdNumerosImpares);
	}

}
