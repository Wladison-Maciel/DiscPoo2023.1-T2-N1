package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Valor de um veiculo com imposto ou tambem um valor adicional
		// da distribuidora
		Scanner sc = new Scanner(System.in);
		double valorcarro, dist, impost,valorf;
		System.out.println("Digite o valor de fábrica do veiculo: ");
		valorcarro = sc.nextDouble();
		if(valorcarro <= 12000) {
			dist = 0.05*valorcarro;
			System.out.println("O valor final do veiculo ficará de: "+(dist+valorcarro));
		}
		else if(valorcarro > 12000 & valorcarro <=25000) {
			dist = 0.10*valorcarro;
			impost = 0.15*valorcarro;
			valorf = dist+impost;
			System.out.println("O valor final do veiculo ficará de: "+(valorcarro+valorf));
		}
		else if(valorcarro > 25000) {
			dist = 0.15*valorcarro;
			impost = 0.20*valorcarro;
			valorf = dist+impost;
			System.out.println("O valor final do veiculo ficará de: "+(valorcarro+valorf));
		}
	}
}
