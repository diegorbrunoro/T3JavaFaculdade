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
        // TODO code application logic here

        int par=0;
        Scanner ler = new Scanner(System.in);
        ListaDupla LD = new ListaDupla();
         
        System.out.println("Para Sair digite X \n");
        int entra = ler.nextInt();
        if (entra ==1){
        while(entra != 'x'){
            System.out.println("PDigite o Valor: \n");
            int valor = ler.nextInt();
            LD.insereInicio(valor); 
            
        }
        
LD.mostraLista(); 
        
           
            
                
   
                    
        }
        
        
        }