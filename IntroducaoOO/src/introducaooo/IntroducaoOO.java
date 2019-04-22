/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaooo;

import classes.Pessoa;
import java.util.Scanner;

/**
 *
 * @author renato
 */
public class IntroducaoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Informe o nome da pessoa: ");
        p1.setNome(leitor.next());
        System.out.println("Informe a idade da pessoa: ");
        p1.setIdade(leitor.nextInt());
        System.out.println("Informe o sexo da pessoa(true - Fem | false - Mas): ");
        p1.setSexoFem(leitor.nextBoolean());
        
        System.out.println(p1.getIdade());
        p1.fezAniversario();
        System.out.println(p1.getIdade());
        
        //System.out.println(p1);
        
    }
    
}
