package com.marco.estruturadedados.lista.exercicios;

import com.marco.estruturadedados.lista.ListaEncadeada;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        for (int i=1; i<=10; i++) {
            lista.adiciona(i);
        }

        System.out.println(lista);

        System.out.println(Arrays.toString(transformaArray(lista)));

        System.out.println(Arrays.toString(lista.transformaArray()));

        LinkedList<Integer> list = new LinkedList<>();
        for (int i=1; i<=10; i++) {
            list.add(i);
        }
    }

    public static int[] transformaArray(ListaEncadeada<Integer> lista) {
        int tamanho = lista.getTamanho();
        int[] vetor = new int[tamanho];
        for (int i=0; i<tamanho; i++) {
            vetor[i] = lista.busca(i);
        }
        return vetor;
    }
}
