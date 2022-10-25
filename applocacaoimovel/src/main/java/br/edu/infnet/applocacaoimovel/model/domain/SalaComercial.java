package br.edu.infnet.applocacaoimovel.model.domain;

public class SalaComercial extends Imovel{
    private int elevadores;
    private boolean recepcao;
    private float condominio;

    public int getElevadores() {
        return elevadores;
    }

    public void setElevadores(int elevadores) {
        this.elevadores = elevadores;
    }

    public boolean isRecepcao() {
        return recepcao;
    }

    public void setRecepcao(boolean recepcao) {
        this.recepcao = recepcao;
    }

    public float getCondominio() {
        return condominio;
    }

    public void setCondominio(float condominio) {
        this.condominio = condominio;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + elevadores + "; " + recepcao + "; " + condominio;
    }
}
