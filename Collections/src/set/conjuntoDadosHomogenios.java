package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoDadosHomogenios {

	public static void main(String[] args) {
		SortedSet<String> lista = new TreeSet<>();
		
		lista.add("Regina");
		lista.add("Juliano");
		lista.add("Thiele");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		

	}

}
