package br.edu.infnet.applocacaoimovel.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    public Cliente(){

    }
    public Cliente(String nome, String cpf, String telefone) throws Exception {
        this.nome = nome;
        this.setCpf(cpf);
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.hashedCpf();
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.length() != 11){
            throw new Exception("CPF precisa ter 11 números");
        }
        String regex = "[0-9]+";
        if(!cpf.matches(regex)){
            throw new Exception("CPF precisa ser composto apenas por números");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String hashedCpf(){
        char[] arr_cpf = this.cpf.toCharArray();
        StringBuilder hashedCpf = new StringBuilder();
        for(int i = 0; i < arr_cpf.length; i++){
            if(i > 3 && i < 9){
                continue;
            }
            if(i == 3){
                hashedCpf.append(". ... -");
                continue;
            }

            hashedCpf.append(arr_cpf[i]);
        }

        return hashedCpf.toString();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + "; " + hashedCpf() + "; " + telefone;
    }
}
