package com.marco.estruturadedados.lista.exercicios;

import java.time.LocalDate;

public class Ex5 {

    public static void main(String[] args) {
            ListaEncadeadaImutavel<Transacao> lista = new ListaEncadeadaImutavel<>();

            Transacao compra = new Transacao(1, 1, "Compra veiculo novo", 30000, LocalDate.now(), "Maria");
            lista.adiciona(compra);

            lista.adiciona(new Transacao(2, 2, "Venda", 25000, LocalDate.now(), "João"));

            System.out.println(lista);
    }
}