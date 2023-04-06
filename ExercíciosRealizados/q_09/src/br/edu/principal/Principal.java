package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Programa que imprime o data e o horario que o usuario forneceu
		Scanner sc = new Scanner(System.in);
		int dia,mes,ano,hora,minuto;
		System.out.println("Digite o dia: ");
		dia = sc.nextInt();
		System.out.println("Digite o mês: ");
		mes = sc.nextInt();
		System.out.println("Digite o ano: ");
		ano = sc.nextInt();
		System.out.println("Data atual: "+dia+"/"+mes+"/"+ano );
		if(mes == 1) {
			System.out.println("O mês atual é: Janeiro");
		}
		if(mes == 2) {
			System.out.println("O mês atual é: Fevreiro");
		}
		if(mes == 3) {
			System.out.println("O mês atual é: Março");
		}
		if(mes == 4) {
			System.out.println("O mês atual é: Abril");
		}
		if(mes == 5) {
			System.out.println("O mês atual é: Maio");
		}
		if(mes == 6) {
			System.out.println("O mês atual é: Junho");
		}
		if(mes == 7) {
			System.out.println("O mês atual é: Julho");
		}
		if(mes == 8) {
			System.out.println("O mês atual é: Agosto");
		}
		if(mes == 9) {
			System.out.println("O mês atual é: Setembro");
		}
		if(mes == 10) {
			System.out.println("O mês atual é: Outubro");
		}
		if(mes == 11) {
			System.out.println("O mês atual é: Novembro");
		}
		if(mes == 12) {
			System.out.println("O mês atual é: Dezembro");
		}
		System.out.println(ano);
		System.out.println("Digite a hora: ");
		hora = sc.nextInt();
		System.out.println("Digite o minuto: ");
		minuto = sc.nextInt();
		System.out.println("Hora atual: "+hora+":"+minuto);
	}

}