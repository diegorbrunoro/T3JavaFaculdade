/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3javafaculdade;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaDupla LD = new ListaDupla();
        ListaDupla LDPar = new ListaDupla();
        Nodo nodoAtual = LD.prim;
        
         int entra, par=0;

            
        
        do{           
            System.out.println("Informe o Valor: ");
                int valor = ler.nextInt();
            LD.insereInicio(valor);
                System.out.println("PARA SAIR: 0 \nPARA CONTINUAR: 1");
            entra = ler.nextInt();
        } while (entra == 1);
        LD.mostraLista(); 
        //Até aqui ok
        
        nodoAtual = LD.prim;
        
        
        //Percorre e insere na lista Maior ou menor do que zero
        while(nodoAtual != null)
        {
                if(nodoAtual.dado > 0){
                    LD.insereInicio(nodoAtual.dado);
                }
                if (nodoAtual.dado < 0) {
                    LD.insereFim(nodoAtual.dado);
                }
                if (nodoAtual.dado %2 ==0){
                   LDPar.insereInicio(nodoAtual.dado);
                }
                nodoAtual=nodoAtual.next;
         }
        
        LDPar.mostraLista(); 

    
    }
    
        
        
  
    
}
