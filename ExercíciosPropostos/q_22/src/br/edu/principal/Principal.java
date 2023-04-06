package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Calculo de IMC e diz o grupo de risco
		Scanner sc = new Scanner(System.in);
		int idade;
		double peso;
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		if(idade < 20) {
			System.out.println("Digite seu peso: ");
			peso = sc.nextDouble();
			if(peso <= 60) {
				System.out.println("Grupo de risco 9");
			}
			else if(peso >60 && peso<=90) {
				System.out.println("Grupo de risco 8");
			}
			else {
				System.out.println("Grupo de risco 7");
			}
		}
		else if(idade > 20 && idade <= 50) {
			System.out.println("Digite seu peso: ");
			peso = sc.nextDouble();
			if(peso <= 60) {
				System.out.println("Grupo de risco 6");
			}
			else if(peso >60 && peso<=90) {
				System.out.println("Grupo de risco 5");
			}
			else {
				System.out.println("Grupo de risco 4");
			}
		  }
		else if(idade > 50) {
			System.out.println("Digite seu peso: ");
			peso = sc.nextDouble();
			if(peso <= 60) {
				System.out.println("Grupo de risco 3");
			}
			else if(peso >60 && peso<=90) {
				System.out.println("Grupo de risco 4");
			}
			else {
				System.out.println("Grupo de risco 1");
			}
		  }
		}
	}