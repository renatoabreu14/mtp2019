/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor;
        double soma = 0;
        int i = 0;
        do{
            System.out.println("Para sair do programa informe um valor negativo");
            System.out.println("Informe um valor: ");
            valor = leitor.nextInt();
            if (valor > 0){
                soma += valor;
                //soma = soma + valor;
                i++;
            }
        }while(valor > 0);
        
        if (i > 0){
            System.out.println("A média dos valores informados é: " + (soma/i));
        }else{
            System.out.println("Nenhum foi informado");
        }
    }
}
