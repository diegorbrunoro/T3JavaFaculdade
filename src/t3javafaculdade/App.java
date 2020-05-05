/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3javafaculdade;

import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
        int value =0, par=0;
        
        ListaDupla LD = new ListaDupla();
        ListaDupla LDPar = new ListaDupla();
        
        
        Nodo nodoAtual = LD.prim;

        
        while(value != 99)
        {
        valor = JOptionPane.showInputDialog("Digite o numero: \n" + "Ou \nDigite X para Sair");
        value = Integer.parseInt(valor);
            if(value != 99){
                LD.mostraLista();   
            }
            if(value >=0){
                LD.insereInicio(value); 
            }else{
                LD.insereFim(value);
            }
        
        }//Fim 1º While
        
        nodoAtual = LDPar.prim;
        
            while(nodoAtual != null)
        {
            if(nodoAtual.dado %2 == 0){
                        LDPar.insereInicio(par);
                    }
            nodoAtual = nodoAtual.next;
        }//Fim 2º While
            LDPar.mostraLista();
                    
        }
        
        
        }