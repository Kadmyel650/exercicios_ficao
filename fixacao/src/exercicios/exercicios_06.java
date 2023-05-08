package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class exercicios_06 {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Stack<Integer> pilha1 = new Stack<>();
	    Stack<Integer> pilha2 = new Stack<>();

	    System.out.print("Digite o tamanho do vetor: ");
	    int tamanho = scanner.nextInt();
	    int[] vetor = new int[tamanho];

	    for (int i = 0; i < tamanho; i++) {
	      System.out.print("Digite o elemento " + (i+1) + " do vetor: ");
	      vetor[i] = scanner.nextInt();
	      pilha1.push(vetor[i]);
	    }

	    while (!pilha1.isEmpty()) {
	      int aux = pilha1.pop();

	      while (!pilha2.isEmpty() && pilha2.peek() > aux) {
	        pilha1.push(pilha2.pop());
	      }

	      pilha2.push(aux);
	    }

	    for (int i = 0; i < tamanho; i++) {
	      vetor[i] = pilha2.pop();
	    }

	    System.out.print("Vetor ordenado: ");
	    for (int i = 0; i < tamanho; i++) {
	      System.out.print(vetor[i] + " ");
	    }

	    scanner.close();
	  }
	}
