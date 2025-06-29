package com.marco.estruturadedados.vetor.teste;

import com.marco.estruturadedados.vetor.Vetor;

public class Aula3 {

    public static void main(String[] args) {
       Vetor vetor = new Vetor(2);
        try {
            vetor.adiciona("A");
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("D");
            vetor.adiciona("E");
            vetor.adiciona("F");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
