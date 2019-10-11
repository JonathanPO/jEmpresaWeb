package model;

import java.util.Date;

public class Empregado {
    private String nome;
    private String nomeDoMeio;
    private String sobrenome;
    private int codigo;
    private Date dtNascimento;
    private String endereco;
    private char sexo;
    private double salario;
    private Empregado gerente;
    private Departamento departamento;

    public Empregado(int codigo) {
        this.codigo = codigo;
    }

    public Empregado(String nome, String nomeDoMeio, String sobrenome, int codigo, Date dtNascimento, String endereco, char sexo, double salario, Empregado gerente, Departamento departamento) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.gerente = gerente;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
