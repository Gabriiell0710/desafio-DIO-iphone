package models;

import interfaces.MusicInterface;

public class MusicPlay implements MusicInterface {

    private String musica;
    private int ano;

    public MusicPlay(String musica, int ano) {
        this.musica = musica;
        this.ano = ano;
    }

    public String getMusica() {
        return musica;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public void play() {
        System.out.println("Tocando música!");
    }

    @Override
    public void stop() {
        System.out.println("Parando música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }
}
