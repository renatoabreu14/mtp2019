/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author renato
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private boolean sexoFem;
    
    public Pessoa(String nome, int idade, boolean sexoFem){
        this.nome = nome;
        this.idade = idade;
        this.sexoFem = sexoFem;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexoFem() {
        return sexoFem;
    }

    public void setSexoFem(boolean sexoFem) {
        this.sexoFem = sexoFem;
    }
    
    public void fezAniversario(){
        idade++;
    }
}
