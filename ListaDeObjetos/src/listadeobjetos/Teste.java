/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeobjetos;

import java.util.ArrayList;

/**
 *
 * @author renato
 */
public class Teste {
    
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<String>();//criar um vetor de String
        
        vetor.add("Renato");//add() método para adicionar um novo valor no vetor
        vetor.add("Gabriel");
        vetor.add("Juliana");
        vetor.add("Eliseu");
        
        for (int i = 0; i < vetor.size()/*size() devolve o tamanho do vetor*/; i++) {
            System.out.println(vetor.get(i));//get(i) exibe o conteúdo do vetor na posição i
        }
        
        vetor.remove("Gabriel");//remove um valor do vetor
        
        for (int i = 0; i < vetor.size(); i++) {
            System.out.println(vetor.get(i));
        }
        
        for (String nome : vetor) {//laço de repetição especial para ArrayList
            System.out.println(nome);
        }
    }
    
}
