package exercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicios_07 {
	    public static void main(String[] args) {
	        Queue<String> fila = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao = 0;

	        do {
	            System.out.println("Selecione uma opção:");
	            System.out.println("1 - Adicionar cliente");
	            System.out.println("2 - Remover próximo cliente");
	            System.out.println("3 - Exibir clientes na fila");
	            System.out.println("0 - Sair");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nome = scanner.next();
	                    fila.add(nome);
	                    System.out.println("Cliente " + nome + " adicionado à fila.");
	                    break;
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("Não há clientes na fila.");
	                    } else {
	                        String proximoCliente = fila.poll();
	                        System.out.println("Cliente " + proximoCliente + " removido da fila.");
	                    }
	                    break;
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("Não há clientes na fila.");
	                    } else {
	                        System.out.println("Clientes na fila:");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	            System.out.println();
	        } while (opcao != 0);
	    }
	}
