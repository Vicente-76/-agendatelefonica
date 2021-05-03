/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

/**
 *
 * @author Vicente Moraes
 * @since 01/05/2021
 */
public class Contato {
    
    private String nome;
    private int telefone;
    private String endereço;

    public Contato() {
    }

    public Contato(String nome, int telefone, String endereço) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Nome = "+ nome + " Telefone = " + telefone + " Endereço = " + endereço;
    }
    
    
    
}
