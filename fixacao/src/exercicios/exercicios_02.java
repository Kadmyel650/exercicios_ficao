package exercicios;

public class exercicios_02 {
		  public static void main(String[] args) {
		    int[] multiplosDe5 = new int[100];
		    int index = 0;

		    for (int i = 1; i <= 500; i++) {
		      if (i % 5 == 0) {
		        multiplosDe5[index] = i;
		        index++;
		      }
		    }

		    System.out.println("Valores armazenados no vetor:");
		    for (int i = 0; i < index; i++) {
		      System.out.println(multiplosDe5[i]);
		    }
		  }
		}

