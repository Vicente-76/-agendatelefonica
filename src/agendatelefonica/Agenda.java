/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendatelefonica;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vicente Moraes
 * @since 01/05/2021
 */
public class Agenda {
    
    //List<Contato> contatos = new ArrayList<>();
    private List<Contato> agenda;
    
    //private ArrayList<Contato> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }
    
    public void adicionarContato(Contato contato){
        agenda.add(contato);
        System.out.println("");
    }
    
    public void removerContato(int id){
        agenda.remove(id);
        System.out.println("");
    }
    
    public void listarContatos(){
        int i=0;
        System.out.println("##### AGENDA TELEFONICA #####");
        for (Contato c: agenda) {
            if (c != null) {
                System.out.println(i + 1 + ".- " + c.toString());
                i++;
            }
        }
        System.out.println("");
    }
      
    public void atualizarContato(int id, Contato c){
        agenda.add(id, c);
        System.out.println("");
    }
}
