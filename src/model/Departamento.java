package model;

import java.util.Date;

public class Departamento {
    private String nome;
    private int codigo;
    private Empregado gerente;
    private Date inicioGerente;

    public Departamento(int codigo) {
        this.codigo = codigo;
    }

    public Departamento(String nome, int codigo, Empregado gerente, Date inicioGerente) {
        this.nome = nome;
        this.codigo = codigo;
        this.gerente = gerente;
        this.inicioGerente = inicioGerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public Date getInicioGerente() {
        return inicioGerente;
    }

    public void setInicioGerente(Date inicioGerente) {
        this.inicioGerente = inicioGerente;
    }
}
