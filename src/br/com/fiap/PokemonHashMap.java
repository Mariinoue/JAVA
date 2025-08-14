package br.com.fiap;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public  static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<String, String>();
        do{
            try{
                String nomePokemon , tipoPokemon;
                //cadastro de nome e tipo do pokemon
                do{
                    nomePokemon = JOptionPane.showInputDialog("Digite o nome do pokemon ou digite\"FIM\" para encerrar: ").toUpperCase();
                    if(!nomePokemon.equals("FIM")){
                        if(pokemon.containsKey(nomePokemon)){
                            JOptionPane.showMessageDialog(null, "Este pokemon já foi cadastrado!");
                        }else{
                            tipoPokemon = JOptionPane.showInputDialog("Digite o tipo do pokemon informado anteriormente").toUpperCase();
                            pokemon.put(nomePokemon, tipoPokemon);
                        }
                    }
                }while(!nomePokemon.equals("FIM"));
                //Buscando o nome do pokemon e o tipo de pokemon
                String escolha = JOptionPane.showInputDialog("Digite tipo de pokemon escolhido: ").toUpperCase();
                ArrayList<String> nomesEncontrados = new ArrayList<>();
                for(Map.Entry<String, String> valor :pokemon.entrySet()){
                    System.out.println("Chave: " + valor.getKey() + " - Valor: " + valor.getValue());
                    if(valor.getValue().equals(escolha)){
                        nomesEncontrados.add(valor.getKey());
                    }

                }

                if(nomesEncontrados.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum pokemon"+ escolha);
                }else{
                    JOptionPane.showMessageDialog(null, "Os pokemons do tipo:" + escolha + " são: \n" + nomesEncontrados);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null,"Deseja continuar?","Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa","Adeus de Programa", JOptionPane.WARNING_MESSAGE);


    }
}
