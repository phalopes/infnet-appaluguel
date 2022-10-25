package br.edu.infnet.applocacaoimovel.model.domain;

public class Imovel {
    public String endereco;
    public float valor;
    public float metragem;
    public boolean acessivel;
    public int codigo;

    @Override
    public String toString() {
        return endereco + "; " + valor + "; " + metragem + "; " + acessivel + "; " + codigo;
    }
}
