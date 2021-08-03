package com.local.java;

import java.util.function.UnaryOperator;

public class Aula {

    public static void main(String[] args) {
        UnaryOperator<Integer> calCularValorVezesTrinta = valor -> valor * 3;
        int valor = 100;
        System.out.println("O valor é : " + calCularValorVezesTrinta.apply(10));
    }
}
