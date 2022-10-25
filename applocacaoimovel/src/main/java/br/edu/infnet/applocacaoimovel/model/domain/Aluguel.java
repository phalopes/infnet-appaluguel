package br.edu.infnet.applocacaoimovel.model.domain;

import java.time.LocalDateTime;

public class Aluguel {
    public int periodo;
    public LocalDateTime inicio;
    public boolean web;

    @Override
    public String toString() {
        return periodo + "; " + inicio + "; " + web;
    }
}
