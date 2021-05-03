/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vicente Moraes
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();      
        Scanner scn = new Scanner(System.in);
        int escolha = 1, indice;
        while(escolha != 0){
            Contato contato = new Contato();                
            System.out.println("##### Escolha uma opção: #####");
            System.out.println("1 - Cadastrar pessoa.");
            System.out.println("2 - Listar pessoas.");
            System.out.println("3 - Alterar pessoas.");
            System.out.println("4 - Excluir pessoas.");
            System.out.println("0 - Sair");
            escolha = scn.nextInt();
            scn.nextLine();
	
            switch(escolha){
                case 0:
                    break;
                case 1:
                    System.out.println("Entre com o nome:");
                    contato.setNome(scn.nextLine());
                    System.out.println("Entre com o numero do telefone:");
                    try {
                        contato.setTelefone(scn.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.print("O valor informado não é um número!");
                        System.out.println("");
                    }
                    scn.nextLine();
                    System.out.println("Entre com o endereço:");
                    contato.setEndereço(scn.nextLine());
                    agenda.adicionarContato(contato);
                    
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:                    
                    agenda.listarContatos();
                    System.out.println("Entre com o codigo do Contato a ser alterado:");
                    indice = scn.nextInt();
                    scn.nextLine();
                    System.out.println("Entre com o nome:");
                    contato.setNome(scn.next());
                    scn.nextLine();
                    System.out.println("Entre com o numero do telefone:");
                    try {
                        contato.setTelefone(scn.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.print("O valor informado não é um número!");
                        System.out.println("");
                    }
                    scn.nextLine();
                    System.out.println("Entre com o endereço:");
                    contato.setEndereço(scn.next());
                    scn.nextLine();
                    agenda.removerContato(indice-1);
                    agenda.atualizarContato(indice-1, contato);
                    break;
                case 4:
                    agenda.listarContatos();
                    System.out.println("Entre com o codigo do Contato a ser excluido:");
                    indice = scn.nextInt();
                    scn.nextLine();
                    agenda.removerContato(indice-1);
                    break;
            }   
        }
        scn.close();
    }
}
