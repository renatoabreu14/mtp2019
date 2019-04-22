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
public class Exercicio1 {
    
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o 1º número:");
        a = leitor.nextInt();
        
        System.out.println("Informe o 2º número:");
        b = leitor.nextInt();
        
        System.out.println("Informe o 3º número:");
        c = leitor.nextInt();
        
         if (a < b)                                           // a>b
           if (b < c) System.out.println(a+" "+b+" "+c);            // a>b>c
           else                                             // a>b,c>=b
               if (a < c) System.out.println(a+" "+ c+" "+ b);   // a>c>=b
               else System.out.println(c+" "+ a+" "+ b);         // c>=a>b
       else                                                 // b>=a
           if (b < c)                                       // b>=a,b>c
               if (a < c) System.out.println(b+" "+ a+ " "+c);   // b>=a>c
               else System.out.println(b+" "+ c+" "+ a);         // b>c>=a
           else System.out.println(c +" "+b+" "+ a);
    }
}
