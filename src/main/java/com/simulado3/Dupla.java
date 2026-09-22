package com.simulado3;

public class Dupla<T> {

    private T primeiro, segundo;

    public Dupla(T primeiro, T segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public T getSegundo() {
        return segundo;
    }

}
