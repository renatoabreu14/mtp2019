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
public class Ex3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int voto;
        int cand1 = 0, cand2= 0, cand3= 0, cand4= 0, nulo= 0, branco = 0, i = 0;
        do{
            System.out.println("Para sair do programa informe 0");
            System.out.println("Informe seu voto: ");
            voto = leitor.nextInt();
            if (voto > 0){
                i++;
                switch (voto){
                    case 1:{
                        cand1++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    case 2:{
                        cand2++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    case 3:{
                        cand3++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    case 4:{
                        cand4++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    case 5:{
                        nulo++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    case 6:{
                        branco++;
                        System.out.println("Voto registrado");
                        break;  
                    }
                    default:{
                        System.out.println("Voto inválido");
                    }
                }
            }
        }while(voto > 0);
        if (i > 0){
            System.out.println("O Candidato 1 obteve: " + cand1 + " votos");
            System.out.println("O Candidato 2 obteve: " + cand2 + " votos");
            System.out.println("O Candidato 3 obteve: " + cand3 + " votos");
            System.out.println("O Candidato 4 obteve: " + cand4 + " votos");
            System.out.println("Votos nulo: " + nulo + " votos");
            System.out.println("Votos em branco: " + branco + " votos");
        }else{
            System.out.println("Não houve votos registrados");
        }
    }
    
}
