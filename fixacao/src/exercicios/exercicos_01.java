package exercicios;

import java.util.Scanner;

public class exercicos_01 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int[] vetor = new int[10];
	    for (int i = 0; i < 10; i++) {
	      System.out.print("Informe o " + (i+1) + "º número inteiro: ");
	      vetor[i] = input.nextInt();
	    }
	    int maior = vetor[0];
	    for (int i = 1; i < 10; i++) {
	      if (vetor[i] > maior) {
	        maior = vetor[i];
	      }
	    }

	    System.out.println("O maior valor informado é: " + maior);
	  }
	}
