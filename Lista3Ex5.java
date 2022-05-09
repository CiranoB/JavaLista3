package Familia52;

import java.util.Scanner;

public class Lista3Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,somatorio=0;
		do{
			System.out.println("\n(Insira 0 para sair)Digite um número: ");
			numero = leia.nextInt();
			somatorio=somatorio+numero;
		}while(numero!=0);
		System.out.println("\nO Somatório resultou em: "+somatorio);
	}

}
