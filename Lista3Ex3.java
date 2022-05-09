package Familia52;

import java.util.Scanner;

public class Lista3Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0,contador21=0,contador50=0;
		while(idade!=-99){
			System.out.println("\n(Insira -99 para sair)Insira a idade: ");
			idade = leia.nextInt();
			if(idade==-99)
				break;
			if(idade<21)
				contador21++;
			if(idade>50)
				contador50++;
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+contador21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+contador50);
	}

}
