/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeobjetos;

/**
 *
 * @author renato
 */
public class Contato {
    
    private String nome;
    private String email;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contato){
            Contato contato = (Contato)obj;
            if (contato.getNome().equals(this.getNome())){
                return true;
            }
        }
        return false;
    }
    
    
    
}
