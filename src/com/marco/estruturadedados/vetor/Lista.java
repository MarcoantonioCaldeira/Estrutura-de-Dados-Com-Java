package com.marco.estruturadedados.vetor;

import java.util.ArrayList;


public class Lista<T> {

    private T[] elementos;
    private int tamanho;


    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Adicao basica
    public void adiciona1(T elemento) {
        for(int i=0; i<elementos.length; i++) {
            if(elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }


    //Metodo adiciona melhorado
    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }

    }

    //Adicionar elemento em uma posição específica
    public boolean adiciona(int posicao, T elemento) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public void removePosicao(T elemento){
        int pos = this.buscaPosicao(elemento);
        if(pos > -1) {
            this.remove(pos);
        } else {
            throw new IllegalArgumentException("Elemento não encontrado: " + elemento);
        }
    }

    //Aumentar capacidade do vetor
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Busca de elemento por posição
    public T busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }
        return this.elementos[posicao];
    }

    //Busca de posicao por elemento
    public int buscaPosicao(T elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean buscaContains(T elemento) {
       return buscaPosicao(elemento) > -1;
    }

    public T obtem(int posicao){
        return this.busca(posicao);
    }

    //Busca o indice do elemento dando prioridade ao ultimo indice
    public int ultimoIndice(T elemento){
        for (int i=this.tamanho-1; i>=0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
