package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Programa que mostra um número que seja maior que os outros
		// dois digitados pelo usuario
		Scanner sc = new Scanner(System.in);
		double num1,num2,num3;
		System.out.println("Digite o 1° número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o 2° número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite o 3° número: ");
		num3 = sc.nextDouble();
		if(num1 > num2 & num1 > num3) {
			System.out.println("O maior número é o: "+num1);
		}
		else if(num2 > num1 & num2 > num3) {
			System.out.println("O maior número é o: "+num2);
		}
		else if(num3 > num1 & num3 > num2) {
			System.out.println("O maior número é o: "+num3);
		}
	}
}
