package repeticao_faca_enquanto;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.print("Digite um número: ");
			numero = leitura.nextInt();

			if (numero > 0)
				soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);
	}
}
