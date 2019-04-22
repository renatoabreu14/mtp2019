/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

/**
 *
 * @author renato
 */
public class Ex1 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int i = 0;
        while (chico >= ze){
            chico += 0.02;
            ze += 0.03;
            i++;
        }
        System.out.println("Se passaram "+i+" anos até que Ze ficasse maior que Chico");
    }
}
