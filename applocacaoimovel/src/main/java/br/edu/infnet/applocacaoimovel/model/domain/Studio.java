package br.edu.infnet.applocacaoimovel.model.domain;

public class Studio extends Imovel{
    private int andar;
    private boolean portaria;
    private float condominio;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isPortaria() {
        return portaria;
    }

    public void setPortaria(boolean portaria) {
        this.portaria = portaria;
    }

    public float getCondominio() {
        return condominio;
    }

    public void setCondominio(float condominio) {
        this.condominio = condominio;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + andar + "; " + portaria + "; " + condominio;
    }
}
