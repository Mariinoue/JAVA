package br.com.fiap;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
        pessoa.put("Maria", 1);
        pessoa.put("Joao", 2);
        pessoa.put("Pedro", 3);
        pessoa.put("Carlos", 4);
        pessoa.put("Antonio", 5);
        pessoa.put("Rodrigo", 6);
        for(Map.Entry<String, Integer> valor : pessoa.entrySet()){
            System.out.println("Chave: " + valor.getKey() + " - Valor: " + valor.getValue());
        }
    }
}
