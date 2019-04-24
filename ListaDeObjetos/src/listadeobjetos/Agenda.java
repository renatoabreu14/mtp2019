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
public class Agenda {
    
    private static ArrayList<Contato> agenda = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        String menu = "Selecione uma opção\n\n";
        menu += "1 - Adicionar Contato\n";
        menu += "2 - Listar Contatos\n";
        menu += "3 - Remover Contato\n";
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
                    remover();
                    break;
                }
            }
        } while (opcao != 0);
    }
    
    private static void adicionar(){
        Contato contato = new Contato();
        leitor.nextLine();
        System.out.println("Informe o Nome:");
        contato.setNome(leitor.nextLine());
        System.out.println("Informe o Email:");
        contato.setEmail(leitor.nextLine());
        System.out.println("Informe o Telefone:");
        contato.setTelefone(leitor.nextLine());
        agenda.add(contato);
    }
    
    private static void listar(){
        for (Contato contato : agenda) {
            String linha = contato.getNome() + "|";
            linha += contato.getEmail() + "|";
            linha += contato.getTelefone();
            System.out.println(linha);
        }
    }
    
    private static void remover(){
        Contato contato = new Contato();
        leitor.nextLine();
        System.out.println("Informe o Nome:");
        contato.setNome(leitor.nextLine());
        int indice = -1;
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNome().equals(contato.getNome())){
                indice = i;
            }
        }
        agenda.remove(indice);
                
    }
    
}
