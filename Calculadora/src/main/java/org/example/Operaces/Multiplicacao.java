package org.example.Operaces;

import org.example.Interface.Operacao;

public class Multiplicacao implements Operacao {

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
