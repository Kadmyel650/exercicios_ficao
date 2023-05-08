package exercicios;
import java.util.Scanner;
import java.util.Stack;

public class exercicios_05 {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Stack<Character> pilhaLetras = new Stack<>();

	    System.out.print("Digite a palavra a ser verificada: ");
	    String palavra = scanner.next();

	    for (int i = 0; i < palavra.length(); i++) {
	      pilhaLetras.push(palavra.charAt(i));
	    }

	    String palavraInvertida = "";
	    while (!pilhaLetras.isEmpty()) {
	      palavraInvertida += pilhaLetras.pop();
	    }

	    if (palavra.equals(palavraInvertida)) {
	      System.out.println("\nA palavra " + palavra + " é um palíndromo!");
	    } else {
	      System.out.println("\nA palavra " + palavra + " não é um palíndromo!");
	    }

	    scanner.close();
	  }
	}
