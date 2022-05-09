package Familia52;

import java.util.Scanner;

public class Lista3Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int NumTeste;
		for(NumTeste=1000;NumTeste<=1999;NumTeste++) {
			if(NumTeste%11==5) {
				System.out.println("\n"+NumTeste);
			}
		}

	}

}
