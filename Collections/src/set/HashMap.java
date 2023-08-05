package set;

import java.util.HashSet;

public class HashMap {

	public static void main(String[] args) {
		HashSet<Usuario> user = new HashSet<Usuario>();

		user.add(new Usuario("Tiago"));
		user.add(new Usuario("Juliano"));
		user.add(new Usuario("Morgana"));
		
		
		boolean resultado = user.contains(new Usuario("Juliano"));
		System.out.println("Resultado da procura: --> " + resultado);
		
	}

}
