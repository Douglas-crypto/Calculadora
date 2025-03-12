package org.example.Opicoes;

public enum Opicoes {
    SOMA("+"),
    SUBTRACAO("-"),
    DIVISAO("/"),
    MULTIPLICACAO("*");

    private String simbolo;

    Opicoes(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static Opicoes fromSimbolo(String simbolo) {
        for (Opicoes operacao : Opicoes.values()) {
            if (operacao.getSimbolo().equals(simbolo)) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Operação inválida: " + simbolo);
    }
}
