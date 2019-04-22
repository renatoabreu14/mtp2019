/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        
        //System.out.println("Informe a idade do nadador:");
        //idade = leitor.nextInt();
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do nadador:"));
        
        if (idade < 5){
            System.out.println("Não categorizado");
        }else{
            if ((idade >= 5) && (idade <=7)){
                System.out.println("Infantil A");
            }
            if ((idade >= 8) && (idade <=10)){
                System.out.println("Infantil B");
            }
            if ((idade >= 11) && (idade <=13)){
                System.out.println("Juvenil A");
            }
            if ((idade >= 14) && (idade <=17)){
                System.out.println("Juvenil B");
            }
            if ((idade >= 18)){
                System.out.println("Adulto");
            }
        }
    }
    
}
