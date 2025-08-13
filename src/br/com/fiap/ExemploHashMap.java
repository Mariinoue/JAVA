package br.com.fiap;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String,String>();
        do{
            try{
                String sigla, estado;
                //Cadstro de sigla e nomes do estado
                do{
                    sigla = JOptionPane.showInputDialog("Digite uma Unidade Federal(UF) de um estado ou digite\"FIM\" para encerrar").toUpperCase();
                    if(!sigla.equals("FIM")){
                        if(mapa.containsKey(sigla)){
                            JOptionPane.showMessageDialog(null, "Este já estado foi cadastrado!");
                        }else {
                            estado = JOptionPane.showInputDialog("Digite o nome completo do estado anteriormente informado");
                            mapa.put(sigla,estado);
                        }
                    }
                }while(!sigla.equals("FIM"));
                //Buscando o nome do estado pela sua sigla
                String escolha = JOptionPane.showInputDialog("Digite uma UF a sua escolha").toUpperCase();
                if(mapa.containsKey(escolha)){
                    JOptionPane.showInputDialog(null, "O nome completo do estado é: " + mapa.get(escolha));
                }else{
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null,"Deseja continuar?","Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa","Adeus de Programa", JOptionPane.WARNING_MESSAGE);
    }
}


