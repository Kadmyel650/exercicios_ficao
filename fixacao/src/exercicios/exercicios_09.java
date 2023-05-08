package exercicios;
import java.util.Scanner;

class Pessoa {
    String nome;
    Pessoa prox;

    public Pessoa(String nome) {
        this.nome = nome;
        this.prox = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getProx() {
        return prox;
    }

    public void setProx(Pessoa prox) {
        this.prox = prox;
    }
}
	public class ListaEncadeada {
	    Pessoa inicio;
	    Pessoa fim;
	    int tamanho;

	    public ListaEncadeada() {
	        this.inicio = null;
	        this.fim = null;
	        this.tamanho = 0;
	    }

	    public void adicionar(String nome) {
	        Pessoa pessoa = new Pessoa(nome);

	        if (inicio == null) {
	            inicio = pessoa;
	            fim = pessoa;
	        } else {
	            fim.setProx(pessoa);
	            fim = pessoa;
	        }

	        tamanho++;
	        System.out.println(nome + " adicionado na lista.");
	    }

	    public void remover(String nome) {
	        Pessoa anterior = null;
	        Pessoa atual = inicio;

	        while (atual != null && !atual.getNome().equals(nome)) {
	            anterior = atual;
	            atual = atual.getProx();
	        }

	        if (atual == null) {
	            System.out.println(nome + " não encontrado na lista.");
	            return;
	        }

	        if (anterior == null) {
	            inicio = atual.getProx();
	        } else {
	            anterior.setProx(atual.getProx());
	        }

	        if (atual == fim) {
	            fim = anterior;
	        }

	        tamanho--;
	        System.out.println(nome + " removido da lista.");
	    }

	    public void exibir() {
	        Pessoa atual = inicio;

	        if (tamanho == 0) {
	            System.out.println("Lista vazia.");
	        } else {
	            System.out.println("Nomes na lista:");

	            while (atual != null) {
	                System.out.println(atual.getNome());
	                atual = atual.getProx();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ListaEncadeada lista = new ListaEncadeada();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nEscolha uma opção:");
	            System.out.println("1 - Adicionar nome");
	            System.out.println("2 - Remover nome");
	            System.out.println("3 - Exibir nomes");
	            System.out.println("4 - Sair");

	            int opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o nome a ser adicionado:");
	                    String nome = scanner.nextLine();
	                    lista.adicionar(nome);
	                    break;

	                case 2:
	                    System.out.println("Digite o nome a ser removido:");
	                    nome = scanner.nextLine();
	                    lista.remover(nome);
	                    break;

	                case 3:
	                    lista.exibir();
	                    break;

	                case 4:
	                    System.out.println("Encerrando o programa.");
	                    return;

	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	        }
	    }
	}