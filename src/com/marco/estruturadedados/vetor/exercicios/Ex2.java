package com.marco.estruturadedados.vetor.exercicios;

import com.marco.estruturadedados.vetor.Lista;

public class Ex2 {

    public static void main(String[] args) {
        // Exemplo de uso da classe Lista
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println("Indice: " + lista.ultimoIndice("A"));

    }
}
