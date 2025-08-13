package br.com.fiap;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        do{
            JOptionPane.showMessageDialog(null, "Confira a seguir os resultados do sorteio da Loteria da Sorte Premiada!", "Loteria",  JOptionPane.INFORMATION_MESSAGE);
            while(numerosSorteados.size()<6){
                int numero = random.nextInt(59) + 1;
                numerosSorteados.add(numero);
            }
            ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null,"Os numeros do sorteados são:\n" + resultadoDoSorteio);

        } while (JOptionPane.showConfirmDialog(null,"Deseja continuar?","Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa","Adeus de Programa", JOptionPane.WARNING_MESSAGE);

    }
}
