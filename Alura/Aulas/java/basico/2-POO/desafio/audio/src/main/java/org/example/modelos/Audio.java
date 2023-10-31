package org.example.modelos;

public class Audio {
    private String titulo;
    private int DuracaoMin;
    private int totalDeReproducoes;
    private int curtidas = 0;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMin() {
        return DuracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        DuracaoMin = duracaoMin;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(){
        curtidas++;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo Audio");
    }
}
