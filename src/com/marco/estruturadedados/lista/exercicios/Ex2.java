package com.marco.estruturadedados.lista.exercicios;

import com.marco.estruturadedados.lista.ListaEncadeada;

public class Ex2 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        for (int i=1; i<=10; i++) {
            lista.adiciona(""+i);
        }
        System.out.println(lista);

        lista.inverte();
        System.out.println(lista);
    }
}
