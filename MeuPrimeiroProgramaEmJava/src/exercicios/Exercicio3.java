/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String nome, sobrenome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome:");
        nome = leitor.nextLine();
        
        System.out.println("Informe o sobrenome:");
        sobrenome = leitor.nextLine();
        
        System.out.println("O nome completo é: " + nome + " " + sobrenome);
    }
}
