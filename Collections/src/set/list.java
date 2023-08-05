package set;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

	
		lista.add(new Usuario("Thiele"));
		lista.add(new Usuario("Juliano"));
		lista.add(new Usuario("Regina"));
		lista.add(new Usuario("Larissa"));
		lista.add(new Usuario("Clair"));
		
		lista.remove(new Usuario("Clair"));
		
		if (lista.contains(new Usuario("Juliano"))) {
			System.out.println("Juliano foi encontrado na lista");
		} else {
			System.out.println("Juliano não está na lista");
		}
		
		
		for(Usuario x: lista) {
			System.out.println(x.nome);
		}
	}

}
