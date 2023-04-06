package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/*  Aumento ou diminuição do preço em relação ao número
		 *  de vendas e ao valor do produto
		 */ 
		Scanner sc = new Scanner(System.in);
		double pre, venda,nov_pre;
		System.out.println("Digite o valor do preço: ");
		pre = sc.nextDouble();
		System.out.println("Digite o número de vendas mensais: ");
		venda = sc.nextDouble();
		if(venda < 500 || pre < 30) {
			nov_pre = pre * 10/100;
			System.out.println("O valor do preço sofreu aumento de 10%, e ficou de: "+(nov_pre+pre));
		}
		else if((venda >= 500) && (venda < 1200) || (pre<=30) && (pre<80)) {
			nov_pre = pre*15/100;
			System.out.println("O valor do preço sofreu aumento de 15%, e ficou de: "+(nov_pre+pre));
		}
		else if(venda >= 1200 || pre >= 80) {
			nov_pre = pre*20/100;
			System.out.println("O valor do preço sofreu uma diminuição de 20%, e ficou de: "+(pre-nov_pre));
		}
	}
}