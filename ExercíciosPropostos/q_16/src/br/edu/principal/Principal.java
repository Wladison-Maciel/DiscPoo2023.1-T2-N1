package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Programa que calcula o valor de um produto e seu desconto
		Scanner sc = new Scanner(System.in);
		double valorP = 0;
		double desc1,desc2;
		System.out.println("Digite o valor do produto: ");
		valorP = sc.nextDouble();
		if(valorP <= 30) {
			System.out.println("O valor do produto é: "+valorP+", não há desconto para este produto!");
		}
		else if(valorP >30 & valorP<=100) {
			desc1 = valorP * 10/100;
			System.out.println("O valor do produto é: "+valorP+", com desconto de 10% ficará de: "+(desc1+valorP));
		}
		else if(valorP >100) {
			desc2 = valorP * 15/100;
			System.out.println("O valor do produto é: "+valorP+", com desconto de 15% ficará de: "+(desc2+valorP));

		}
	}
}
