package com.marco.estruturadedados.vetor.exercicios;

import com.marco.estruturadedados.vetor.Lista;

public class Ex1 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(3);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.buscaContains("A"));

    }
}
