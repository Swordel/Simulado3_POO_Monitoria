package com.simulado3;

public class Calculadora {

    public static double somar(Dupla<Double> d){
        return d.getPrimeiro() + d.getSegundo();
    }

    public static double subtrair(Dupla<Double> d){
        return d.getPrimeiro() - d.getSegundo();
    }

    public static double mult(Dupla<Double> d){
        return d.getPrimeiro() * d.getSegundo();
    }

    public static double dividir(Dupla<Double> d) throws Exception{
        if(d.getSegundo() == 0)
            throw new Exception("Nao ha divisao por 0");
            
        return d.getPrimeiro() / d.getSegundo();
    }

}
