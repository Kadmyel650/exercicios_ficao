package exercicios;
import java.util.Scanner;
import java.util.Stack;

public class exercicios_04 {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Stack<String> pilhaNomes = new Stack<>();

	    int opcao = 0;
	    do {
	      System.out.println("\nEscolha uma opção:");
	      System.out.println("1 - Adicionar nome");
	      System.out.println("2 - Remover último nome");
	      System.out.println("3 - Exibir nomes armazenados");
	      System.out.println("4 - Sair");
	      System.out.print("Opção: ");
	      opcao = scanner.nextInt();

	      switch (opcao) {
	        case 1:
	          System.out.print("\nDigite o nome a ser adicionado: ");
	          String nome = scanner.next();
	          pilhaNomes.push(nome);
	          break;
	        case 2:
	          if (pilhaNomes.isEmpty()) {
	            System.out.println("\nPilha vazia. Impossível remover nome.");
	          } else {
	            String nomeRemovido = pilhaNomes.pop();
	            System.out.println("\nNome removido: " + nomeRemovido);
	          }
	          break;
	        case 3:
	          System.out.println("\nNomes armazenados na pilha:");
	          for (String nomeArmazenado : pilhaNomes) {
	            System.out.println(nomeArmazenado);
	          }
	          break;
	        case 4:
	          System.out.println("\nEncerrando o programa...");
	          break;
	        default:
	          System.out.println("\nOpção inválida. Tente novamente.");
	          break;
	      }
	    } while (opcao != 4);

	    scanner.close();
	  }
	}
