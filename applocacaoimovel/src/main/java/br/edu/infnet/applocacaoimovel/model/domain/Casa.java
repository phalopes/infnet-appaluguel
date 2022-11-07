package br.edu.infnet.applocacaoimovel.model.domain;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_casa")
public class Casa extends Imovel{
    private boolean quintal;
    private int quartos;
    private String cor;

    public boolean isQuintal() {
        return quintal;
    }

    public void setQuintal(boolean quintal) {
        this.quintal = quintal;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + quintal + "; " + quartos + "; " + cor;
    }
}
