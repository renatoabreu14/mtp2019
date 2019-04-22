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
public class Exercicio1Resolvido {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c = 0;
        
        System.out.println("Informe o 1º número: ");
        a = leitor.nextInt();
        
        System.out.println("Informe o 2º número: ");
        b = leitor.nextInt();
        
        System.out.println("Informe o 3º número: ");
        c = leitor.nextInt();
        
        if (a < b){//true
            if (b < c){
                System.out.println(a+" "+b+" "+c);
            }else{
                if (a < c){
                    System.out.println(a+" "+c+" "+b);
                }else{
                    System.out.println(c+" "+a+" "+b);
                }
            }
        }else{
            if (b < c){
                if (a < c){
                    System.out.println(b+" "+a+" "+c);
                }else{
                    System.out.println(b+" "+c+" "+a);
                }
            }else{
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
    
}
