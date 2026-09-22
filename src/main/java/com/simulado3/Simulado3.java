package com.simulado3;

public class Simulado3 {

    public static void main(String[] args) {
        
        //=================== EXERCÍCIO 1
        //Esse exercício não precisa de Main. Foi feito apenas para demonstração.

        /*

        Cliente c = new Cliente("Gaby");

        //Moeda m1 = new Moeda(Denom.BTC, 100);
        //c.registrar(m1);
        //ou, diretamente:
        c.registrar(new Moeda(Denom.BTC, 100)); //m1
        c.registrar(new Moeda(Denom.SOL, 200)); //m2
        c.registrar(new Moeda(Denom.ETH, 150)); //m3
        c.registrar(new Moeda(Denom.ADA, 300)); //m4
        c.registrar(new Moeda(Denom.SUI, 50)); //m5
        c.registrar(new Moeda(Denom.BTC, 75)); //m6
        c.registrar(new Moeda(Denom.ETH, 100)); //m7
        c.registrar(new Moeda(Denom.SOL, -50)); // inválida, não entra

        System.out.println("--- Todas as transacoes ---");
        c.mostrarTudo();

        System.out.println("--- BTC e SOL ---"); //BTC e SOL:   100, 200, 75 (os dois BTCs e o SOL)
        c.listarBTCSOL();

        System.out.println("--- Totais ETH, SUI e ADA ---"); //ETH= 250 (150+100) | SUI: 50.0 | ADA: 300.0 
        HashMap<Denom, Double> totais = c.calcularTotais();
        for(Denom d : totais.keySet()) //O keySet() retorna todas as chaves do HashMap, aí você usa cada chave para buscar o valor com get().
            System.out.println(d + ": " + totais.get(d));

        //Ou você pode printar direto com System.out.println porque o HashMap já tem um toString() próprio:
        System.out.println(c.calcularTotais()); // saída: {ETH=250.0, SUI=50.0, ADA=300.0}

        System.out.println("--- Total geral ---");
        System.out.println("Total: " + c.calcular()); // 975.0

        */

        //=================== EXERCÍCIO 2

        //Enunciado: Crie uma classe main que possua instancias para Dupla<Integer>, Dupla<Double> e Dupla<String>.
        //Mostre na tela todos os valores através dos gets.

        /*

        Dupla<Integer> duplaInt = new Dupla<>(10, 20);
        Dupla<Double> duplaDouble = new Dupla<>(3.14, 2.71);
        Dupla<String> duplaString = new Dupla<>("Ola", "Mundo");

        System.out.println(duplaInt.getPrimeiro());
        System.out.println(duplaInt.getSegundo());

        System.out.println(duplaDouble.getPrimeiro());
        System.out.println(duplaDouble.getSegundo());

        System.out.println(duplaString.getPrimeiro());
        System.out.println(duplaString.getSegundo());

        */

        //=================== EXERCÍCIO 3

        /*

        Dupla<Double> dupla = new Dupla<>(10.0, 2.0);

        System.out.println(Calculadora.somar(dupla));
        System.out.println(Calculadora.subtrair(dupla));
        System.out.println(Calculadora.mult(dupla));

        try {
            double res = Calculadora.dividir(new Dupla<>(4.0,0.0)); // o <> vazio é preenchido automaticamente como Double -> o método dividir espera Dupla<Double>
            System.out.println(res);   

        } catch (Exception e) {
            System.out.println("Deu erro");
            System.err.println(e.getMessage()); // "Nao ha divisao por 0"
        }

        */

        //=================== EXERCÍCIO 4

        /*
        (a) FALSA — final garante que o valor não pode ser alterado após a inicialização.
        (b) FALSA — uma árvore binária tem no máximo dois filhos por nó, não três. Com três atributos do mesmo tipo seria uma árvore ternária.
        (c) FALSA — static indica que o atributo pertence à classe e não a um objeto. Quem controla o acesso externo é o private.
        (d) FALSA — setter dá acesso de escrita, não de leitura. Leitura é responsabilidade do getter.
        (e) FALSA — métodos públicos são necessários e esperados
        (f) VERDADEIRA — os valores de um enum são implicitamente public static final.
        (g) VERDADEIRA — boolean é um dos tipos primitivos do Java.
        (h) VERDADEIRA — a própria main é o exemplo clássico: public static void main(String[] args).
        (i) FALSA — int é tipo primitivo e não pode receber null. 
        (j) VERDADEIRA — por isso você acessa diretamente pela classe sem criar um objeto.

        */

    }
}
