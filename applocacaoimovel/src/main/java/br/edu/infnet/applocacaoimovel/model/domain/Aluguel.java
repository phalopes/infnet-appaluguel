package br.edu.infnet.applocacaoimovel.model.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_aluguel")
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int periodo;
    private LocalDate dataInicio;
    private boolean web;
    private LocalDateTime dataRequisicao;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Imovel> imoveis;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Aluguel() {
        this.periodo = 30;
        this.dataInicio = LocalDate.now().plusDays(30) ;
        this.dataRequisicao = LocalDateTime.now();
        this.web = true;
        this.imoveis = new ArrayList<>();
    }

    public Aluguel(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public LocalDateTime getDataRequisicao() {
        return dataRequisicao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ": " + periodo + "; " + dataInicio + "; " + dataRequisicao + "; " + web + "; Imóveis: " + imoveis.size();
    }
}
