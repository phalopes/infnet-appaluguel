package br.edu.infnet.applocacaoimovel.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private int periodo;
    private LocalDateTime inicio;
    private boolean web;
    private Cliente cliente;
    private List<Imovel> imoveis;

    public Aluguel() {
        this.periodo = 30;
        this.inicio = LocalDateTime.now().plusDays(30) ;
        this.web = true;
        this.imoveis = new ArrayList<>();
    }

    public Aluguel(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ": " + periodo + "; " + inicio + "; " + web + "; Imóveis: " + imoveis.size();
    }
}
