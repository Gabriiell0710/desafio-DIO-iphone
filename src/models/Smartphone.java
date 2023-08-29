package models;

import interfaces.PhoneInterface;

import java.util.Optional;

public class Smartphone implements PhoneInterface {

    MusicPlay musicPlay = new MusicPlay("Hello", 2000);
    WebNavegator webNavegator = new WebNavegator("Google");

    public Smartphone() {
        this.musicPlay = musicPlay;
        this.webNavegator = webNavegator;
    }

    public MusicPlay getMusicPlay() {
        return musicPlay;
    }

    public WebNavegator getWebNavegator() {
        return webNavegator;
    }

    @Override
    public void ligar() {
        System.out.println("Ligação efetuada!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado!");
    }
}
