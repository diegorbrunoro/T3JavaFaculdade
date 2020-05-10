/* FACULDADE DOM BOSCO DE PORTO ALEGRE
 *  Sistemas de Informação - Estrtura de Dados - Terceiro T1
 * 
 * Objetivo do Programa: 
 * Escrever um programa que lê números inteiros, quando for positivo inserir no início de uma 
 * lista duplamente encadeada LD. Quando o número lido for negativo inserir no fim da lista.   
 * Determine um flag de saída para o loop de leitura dos números.  
 * Ao final da leitura da LD, criar uma lista dupla – LDPar – que deverá conter apenas os números pares da LD.  
 * Após a criação da LDPar exibir o conteúdo das duas listas. 
 * Componentes do grupo: Diego Rodrigues Brunoro
 * Data da entrega do arquivo fonte: 09/05/2020
 */
package t3javafaculdade;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class APP {

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
       
        
        System.out.print("\n Lista Apenas Pares: \n");
        LDPar.mostraLista();
        
        System.out.print("\n Lista total: \n");
        LD.mostraLista();
        

    
    }
    
}
