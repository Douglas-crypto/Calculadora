package org.example.Main;

import org.example.Opcoes.Operacoes;
import org.example.Operaces.Adicao;
import org.example.Operaces.Divisao;
import org.example.Operaces.Multiplicacao;
import org.example.Operaces.Subtracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação (+, -, /, *):");
        for (Operacoes operacao : Operacoes.values()) {
            System.out.println(operacao.getSimbolo() + "  " + operacao.name());
        }

        String escolha = scanner.nextLine();

        Operacoes operacaoEscolhida;
        try {
            operacaoEscolhida = Operacoes.fromSimbolo(escolha);
            System.out.println("Você escolheu: " + operacaoEscolhida);

            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = 0;
            switch (operacaoEscolhida) {
                case SOMA:
                    resultado = new Adicao().calcular(a, b);
                    break;
                case SUBTRACAO:
                    resultado = new Subtracao().calcular(a, b);
                    break;
                case MULTIPLICACAO:
                    resultado = new Multiplicacao().calcular(a, b);
                    break;
                case DIVISAO:
                    if (b != 0) {
                        resultado = new Divisao().calcular(a, b);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        scanner.close();
                        return;
                    }
                    break;
            }

            System.out.println("Resultado: " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida. Tente novamente.");
        } finally {
            scanner.close();
        }
    }
}