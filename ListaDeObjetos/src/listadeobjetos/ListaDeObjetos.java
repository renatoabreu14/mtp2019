/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeobjetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renato
 */
public class ListaDeObjetos {
    
    private static ArrayList<String> listaDeNomes = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcao;
        String menu = "Selecione uma opção\n\n";
        menu += "1 - Adicionar nome\n";
        menu += "2 - Listar nomes\n";
        menu += "3 - Remover nome\n";
        menu += "Informe 0 para sair";
        do {            
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:{
                    adicionar();
                    break;
                }
                case 2:{
                    listar();
                    break;
                }
                case 3:{
                    break;
                }
            }
            
        } while (opcao != 0);
        
        
        
        
        
        
        
        
        
        
        /*listaDeNomes.add(leitor.nextLine());
        listaDeNomes.add(leitor.nextLine());
        listaDeNomes.add(leitor.nextLine());
        listaDeNomes.add(leitor.nextLine());
        
        System.out.println("Dados do vetor");
        
        int i = 0;
        for (String nome : listaDeNomes) {
            System.out.println(i+" - "+nome);
            i++;
        }
        
        System.out.println("Informe a posição para excluir:");
        int posicao = leitor.nextInt();
        listaDeNomes.remove(posicao);
        
        System.out.println("Dados do vetor");
        
        i = 0;
        for (String nome : listaDeNomes) {
            System.out.println(i+" - "+nome);
            i++;
        }*/
    }
    
    public static void adicionar(){
        System.out.println("Informe o nome:");
        String nome = leitor.next();
        listaDeNomes.add(nome);
    }
    
    public static void listar(){
        int i = 0;
        for (String nome : listaDeNomes) {
            System.out.println(i+" - "+nome);
            i++;
        }
    }
    
}
