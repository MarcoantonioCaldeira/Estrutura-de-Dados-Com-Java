package com.marco.estruturadedados.pilha.exercicios;

import com.marco.estruturadedados.pilha.teste.Pilha;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        for (int i=1; i<=5; i++){

            System.out.println("Digite 5 numeros: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0) {
                System.out.println("Empilhando o número " + numero);
                pilha.empilha(numero);
            } else {
                pilha.desempilha();
            }

            if(pilha.estaVazia()) {
                System.out.println("Pilha vazia");
            } else {
                System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
            }
        }

    }
}
