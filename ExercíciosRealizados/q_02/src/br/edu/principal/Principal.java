package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Media aritmética de uma nota e o quanto o usuario precisa
		// tirar caso tira nota abaixo de 7
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media, nota_exam;
		System.out.println("Digite a 1° nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a 2° nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a 3° nota: ");
		nota3 = sc.nextDouble();
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("Média aritmética: "+media);
		if(media >= 0 && media < 3) {
			System.out.println("Você está reprovado");
		}
		else if(media >= 3 && media < 7) {
			System.out.println("Exame");
			nota_exam = 12 - media;
			System.out.println("Você deve tirar nota "+ nota_exam+ " para ser aprovado");
		}
		else if(media >= 7 && media < 10) {
			System.out.println("Você está aprovado");
		}
	}
}