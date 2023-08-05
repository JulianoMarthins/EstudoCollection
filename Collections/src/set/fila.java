package set;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		/* Para adicionar valores a fila teremos dois métodos, o .add e o .offer. A diferença entre os dois se dará
		* caso a fila tenha um tamanho litado onde, ao tentar adicionar um novo elemento pelo metodo .add
		* o programa dará uma excessão equanto em .offer o programa apenas retornara false confirmando
		* assim a não inclusão deste elemento a fila.
		*/
		
		fila.add("Juliano");
		fila.add("Thiele");
		fila.add("Larissa");
		fila.offer("Gabriel"); 
		fila.add("Gilherme");
		fila.add("Rafaela");

		/*
		 *  Os métodos .peek() e .element() retornarão o nome do primeiro elemento da fila, a diferença entre os dois
		 *  é que quando a fila estiver vazia, o método .peek retornará um null enquanto o método .element
		 *  dará uma excessão;
		 */
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		/*
		 * fila.size() -> retorna a quantidade de valores na fila
		 * fila.clear() -> apagara todos os elementos da fila
		 * fila.isEmpty() -> Retorna boolean se a fila está vazia
		 * fila.contains() -> Procura elemento passado no parâmetro
		 */
		
		
		/*
		 * O método .poll retorna o próximo valor da fila e o remove da fila, caso a fila esteja vazia este método
		 * retornada null
		 * 
		 * O método .remove retorna o próximo valor da fila e o remove da fila, caso a fila esteja vazia o método
		 * retornará uma excessão
		 */
		
		System.out.println(fila.poll()); // Retorna o próximo elemento da fila e o remove da mesma
		System.out.println(fila.poll()); // Retorna null caso a fila esteja vazia
		System.out.println(fila.remove()); // Remove um elemento da lista mas retorna excessão caso a fila esteja vazia
		
		
	}
}
