package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Adição ao conjunto do valor Double 1.2
		conjunto.add(true); // Adição ao conjunto do valor Boolean true
		conjunto.add("Juliano"); // Adição ao conjunto do valor String Juliano
		conjunto.add(3); // Adição ao conjunto do valor Integer 3
		conjunto.add('p'); // Adição ao conjunto do valor Character p
		conjunto.add(3); // Comando será ignorado e não acrescentado ao conjunto por ser um valor repetido
			
		System.out.println(conjunto.size()); //  Comando retorna o tamanho de elementos do conjunto
		
		conjunto.remove(14); // Ao tentar remover um valor inexistente ao conjunto, o comando será ignorado
		
		System.out.println("\n" + conjunto);
		conjunto.remove(1.2);
		conjunto.remove('p');
		
		System.out.println("Remoção do valor 1.2  e p do conjunto: \n\n" + conjunto);
		System.out.println("Existe no conjunto o valor 'Juliano'? \n" + conjunto.contains("Juliano"));
		
		@SuppressWarnings("rawtypes")
		Set nuns = new HashSet();
		
		nuns.add(1);
		nuns.add(9);
		nuns.add(8);
		nuns.add(2);
		
		System.out.println(nuns);
		
		conjunto.addAll(nuns);
		
		System.out.println("Comando .addAll() adicionou a HashSet nuns ao conjunto\n" + conjunto );
		
		
		
	}

}
