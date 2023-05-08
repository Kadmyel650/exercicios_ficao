package exercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicios_08 {
	    public static void main(String[] args) {
	        Queue<String> fila = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao = 0;

	        do {
	            System.out.println("Selecione uma opção:");
	            System.out.println("1 - Adicionar documento");
	            System.out.println("2 - Remover próximo documento");
	            System.out.println("3 - Exibir documentos na fila");
	            System.out.println("4 - Adicionar documento prioritário");
	            System.out.println("0 - Sair");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do documento: ");
	                    String nome = scanner.next();
	                    fila.add(nome);
	                    System.out.println("Documento " + nome + " adicionado à fila.");
	                    break;
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("Não há documentos na fila.");
	                    } else {
	                        String proximoDocumento = fila.poll();
	                        System.out.println("Documento " + proximoDocumento + " removido da fila.");
	                    }
	                    break;
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("Não há documentos na fila.");
	                    } else {
	                        System.out.println("Documentos na fila:");
	                        for (String documento : fila) {
	                            System.out.println(documento);
	                        }
	                    }
	                    break;
	                case 4:
	                    System.out.print("Digite o nome do documento prioritário: ");
	                    String documentoPrioritario = scanner.next();
	                    fila.offer(documentoPrioritario);
	                    System.out.println("Documento " + documentoPrioritario + " adicionado à fila como prioritário.");
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
