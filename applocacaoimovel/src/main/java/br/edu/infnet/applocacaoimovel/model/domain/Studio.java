package br.edu.infnet.applocacaoimovel.model.domain;

public class Studio extends Imovel{
    public int andar;
    public boolean portaria;
    public float condominio;

    @Override
    public String toString() {
        return super.toString() + "; " + andar + "; " + portaria + "; " + condominio;
    }
}
