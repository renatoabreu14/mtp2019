/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprogramaemjava;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class MeuPrimeiroProgramaEmJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int num1 = leitor.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int num2 = leitor.nextInt();
        
        //System.out.println("Hello world!");
        
        System.out.println("A soma dos números é: " + (num1+num2));
        
        System.out.println("Informe um nome: ");
        String nome = leitor.next();
        System.out.println("O nome informado foi: " + nome + " teste " + num1);
    }
    
}
