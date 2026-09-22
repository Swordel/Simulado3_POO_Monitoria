package com.simulado3;

//Cliente has-many transações

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

    private String nome;
    //txns = Transactions
    private ArrayList<Moeda> txns; //transações é um array de Moedas. As moedas possui denom+valor.

    public Cliente(String nome){
        this.nome = nome;
        txns = new ArrayList<>();
    }

    //Do enunciado (última linha): Adicionar transações válidas (valores positivos)
    public void registrar(Moeda moeda){
        if(moeda == null)
            return;
            
        if(moeda.getValor() > 0)
            txns.add(moeda);
    }

    //Listar todas as transações de Bitcoin e Solana
    public void listarBTCSOL(){
        for(Moeda m : txns){
            if(Denom.isSOLBTC(m.getDenominacao())) //pego a Denom de cada moeda do array e mando pro isSOLBTC? Se for true, listo.
                m.mostrar();
        }
    }

    //Calcular o total das transações em Ethereum (ETH), Sui e Cardano (ADA) (valores separados)
    public HashMap<Denom,Double> calcularTotais(){  //para cada moeda, vou ter um total <Denom,Double>

        HashMap<Denom,Double> auxTotal;
        auxTotal = new HashMap<>();
        auxTotal.put(Denom.ADA,0.0); //inicializo cada chave-valor com zeros
        auxTotal.put(Denom.ETH,0.0); 
        auxTotal.put(Denom.SUI,0.0); 

        for(Moeda m : txns){

            if(Denom.isADA(m.getDenominacao())){
                double atual = auxTotal.get(Denom.ADA);  // pega o valor atual da chave ADA
                auxTotal.put(Denom.ADA, atual + m.getValor()); // sobrescreve com atual + novo valor -> O put em uma chave que já existe sobrescreve o valor anterior.
            }
            if(Denom.isETH(m.getDenominacao())){
                double atual = auxTotal.get(Denom.ETH);
                auxTotal.put(Denom.ETH, atual + m.getValor());
            }
            if(Denom.isSUI(m.getDenominacao())){
                double atual = auxTotal.get(Denom.SUI);
                auxTotal.put(Denom.SUI, atual + m.getValor());
            }
        }

        return auxTotal; //retorna o HashMap
    }

    //Calcular o total de transações
    public double calcular(){
        double total = 0;
        for(Moeda m : txns)
            total += m.getValor();

        return total;
    }

    //Mostrar todas as transações na tela
    public void mostrarTudo(){
        for(Moeda m : txns)
            m.mostrar();
    }

}
