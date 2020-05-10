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
public class App2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ListaDupla LD = new ListaDupla();
        ListaDupla LDPar = new ListaDupla();
        Nodo nodoAtual = LD.prim;
        int numeroDigitado =0, opcao=0;
        
        do{
        System.out.print("Digite um número: ");
            numeroDigitado = ler.nextInt();
        
            if(numeroDigitado > 0){
                    LD.insereInicio(numeroDigitado);
                }else 
                    LD.insereFim(numeroDigitado);
                    
        System.out.print("Deseja Continuar (1 = S /0 = N)? : ");
            opcao = ler.nextInt();
        }while(opcao !=0);
        
        nodoAtual = LD.prim;
        
      while(nodoAtual != null)
        {
                if(nodoAtual.dado %2 ==0){
                    LDPar.insereInicio(nodoAtual.dado);
                }
                 nodoAtual=nodoAtual.next;
         }
       

        LDPar.mostraLista();
        

    
    }
    
}
