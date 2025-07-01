package com.marco.estruturadedados.vetor.teste;

import com.marco.estruturadedados.vetor.Vetor;

public class Aula8 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("A");
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona(4, "D");
            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
