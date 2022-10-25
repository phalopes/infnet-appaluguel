package br.edu.infnet.applocacaoimovel.model.domain;

public class Casa extends Imovel{
    public boolean quintal;
    public int quartos;
    public String cor;

    @Override
    public String toString() {
        return super.toString() + "; " + quintal + "; " + quartos + "; " + cor;
    }
}
