package br.edu.infnet.applocacaoimovel.model.domain;

public class Cliente {
    public String nome;
    public String cpf;
    public String telefone;

    @Override
    public String toString() {
        return nome + "; " + cpf + "; " + telefone;
    }
}
