package org.example.Operaces;

import org.example.Interface.Operacao;

public class Adicao implements Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
