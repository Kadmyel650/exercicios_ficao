package exercicios;

	public class No {
	    private int valor;
	    private No proximo;

	    public No(int valor) {
	        this.valor = valor;
	        this.proximo = null;
	    }

	    public int getValor() {
	        return valor;
	    }

	    public void setValor(int valor) {
	        this.valor = valor;
	    }

	    public No getProximo() {
	        return proximo;
	    }

	    public void setProximo(No proximo) {
	        this.proximo = proximo;
	    }
	}

	public class ListaEncadeada {
	    private No inicio;

	    public ListaEncadeada() {
	        this.inicio = null;
	    }

	    public void adicionar(int valor) {
	        No novoNo = new No(valor);

	        if (inicio == null) {
	            inicio = novoNo;
	        } else {
	            No atual = inicio;
	            No anterior = null;

	            while (atual != null && valor > atual.getValor()) {
	                anterior = atual;
	                atual = atual.getProximo();
	            }

	            if (anterior == null) {
	                inicio = novoNo;
	            } else {
	                anterior.setProximo(novoNo);
	            }

	            novoNo.setProximo(atual);
	        }
	    }

	    public void remover(int valor) {
	        No atual = inicio;
	        No anterior = null;

	        while (atual != null && atual.getValor() != valor) {
	            anterior = atual;
	            atual = atual.getProximo();
	        }

	        if (atual == null) {
	            return;
	        }

	        if (anterior == null) {
	            inicio = atual.getProximo();
	        } else {
	            anterior.setProximo(atual.getProximo());
	        }
	    }

	    public void exibirOrdemCrescente() {
	        List<Integer> numeros = new ArrayList<>();

	        No atual = inicio;
	        while (atual != null) {
	            numeros.add(atual.getValor());
	            atual = atual.getProximo();
	        }

	        Integer[] array = numeros.toArray(new Integer[numeros.size()]);
	        Arrays.sort(array);

	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}

