package br.edu.infnet.applocacaoimovel.model.domain;

public class SalaComercial extends Imovel{
    public int elevadores;
    public boolean recepcao;
    public float condominio;

    @Override
    public String toString() {
        return super.toString() + "; " + elevadores + "; " + recepcao + "; " + condominio;
    }
}
