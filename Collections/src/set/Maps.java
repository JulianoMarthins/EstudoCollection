package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> dicionario = new HashMap<>();
		
		dicionario.put(1, "Juliano Martins");
		dicionario.put(2, "Thiele Gringer");
		dicionario.put(3, "Regina Martins");
		
		
		System.out.println(dicionario.keySet()); // Metodo retorna as chaves da lista
		System.out.println(dicionario.values()); // Metodo values retorna os valores da lista
		
		System.out.println(dicionario.containsKey(3)); // Metodo procura na lista a chave passada como parâmetro
		System.out.println(dicionario.containsValue("Thiele Gringer")); // Metodo procura na lista o valor 
		
		System.out.println(dicionario.get(3)); // Retorna o valor da chave passada como parâmetro
		
		for( int chave: dicionario.keySet()) {
			System.out.println(chave);
		} // Percorre o dicionario retornando suas chaves
		
		for (String nome: dicionario.values()) {
			System.out.println(nome);
		} // Percorre o dicionario retornando os valores
		
		System.out.println("Chave        Valor");
		for(Entry<Integer, String> registro : dicionario.entrySet()) {
			System.out.println(registro.getKey() + "      " + registro.getValue());
		} // Precisa-se usar a classe Entry importada do java.util.HashMap para percorrer chave e valor do dicionario.
		
		
	}

}
