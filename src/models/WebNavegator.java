package models;

import interfaces.WebInterface;

public class WebNavegator implements WebInterface {

    private String site;

    public WebNavegator(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida!");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Nova página adicionada!");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Página atualizada!");
    }
}
