package com.marco.estruturadedados.vetor.teste;

import com.marco.estruturadedados.vetor.Vetor;

public class Aula6 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        try {
            vetor.adiciona("A");
            vetor.adiciona("B");
            vetor.adiciona("C");
            System.out.println(vetor.busca(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
