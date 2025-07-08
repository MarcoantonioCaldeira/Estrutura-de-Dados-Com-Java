package com.marco.estruturadedados.vetor.exercicios;

import com.marco.estruturadedados.vetor.Lista;

public class Ex3 {

    public static void main(String[] args) {
        // Exemplo de uso da classe Lista
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        lista.removePosicao("C");

        System.out.println("Lista após remoção: " + lista);
    }
}
