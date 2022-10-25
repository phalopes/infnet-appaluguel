package br.edu.infnet.applocacaoimovel.model.domain;

import java.time.LocalDateTime;

public class Aluguel {
    private int periodo;
    private LocalDateTime inicio;
    private boolean web;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return periodo + "; " + inicio + "; " + web;
    }
}
