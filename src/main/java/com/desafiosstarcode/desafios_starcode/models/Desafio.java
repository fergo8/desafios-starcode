package com.desafiosstarcode.desafios_starcode.models;

public class Desafio {

    private int numero;
    private String nome;
    private String descricao;
    private String url;

    public Desafio(int numero, String nome, String descricao, String url) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.url = url;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
