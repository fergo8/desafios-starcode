package com.desafiosstarcode.desafios_starcode.models;

import java.util.List;


public class DesafioDetalhe {

    private Integer numero;
    private String titulo;
    private List<String> descricao;
    private String objetivo;
    private String url;
    private String frase;
    private String fraseCriptografada;

    public DesafioDetalhe(Integer numero, String titulo, List<String> descricao, String objetivo, String url) {
        this.numero = numero;
        this.titulo = numero == null ? titulo : Integer.toString(numero).concat(" - " + titulo);
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.url = url;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getDescricao() {
        return descricao;
    }

    public void setDescricao(List<String> descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFraseCriptografada() {
        return fraseCriptografada;
    }

    public void setFraseCriptografada(String fraseCriptografada) {
        this.fraseCriptografada = fraseCriptografada;
    }

}
