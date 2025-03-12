package org.example.Opcoes;

public enum Operacoes {
    SOMA("+"),
    SUBTRACAO("-"),
    DIVISAO("/"),
    MULTIPLICACAO("*");

    private String simbolo;

    Operacoes(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static Operacoes fromSimbolo(String simbolo) {
        for (Operacoes operacao : Operacoes.values()) {
            if (operacao.getSimbolo().equals(simbolo)) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Operação inválida: " + simbolo);
    }
}
