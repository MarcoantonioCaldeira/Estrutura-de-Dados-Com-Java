package com.marco.estruturadedados.vetor.teste;

import com.marco.estruturadedados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {
        Lista<String> a = new Lista(4);

        a.adiciona("A");
        a.adiciona("B");
        a.adiciona("C");
        a.adiciona("D");

        System.out.println(a);
    }
}
