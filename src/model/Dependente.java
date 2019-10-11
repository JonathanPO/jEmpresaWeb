package model;

import java.util.Date;

public class Dependente {
    private Empregado empregado;
    private String nome;
    private char sexo;
    private Date dtNascimento;
    private String parentesco;

    public Dependente(Empregado empregado, String nome) {
        this.empregado = empregado;
        this.nome = nome;
    }

    public Dependente(Empregado empregado, String nome, char sexo, Date dtNascimento, String parentesco) {
        this.empregado = empregado;
        this.nome = nome;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.parentesco = parentesco;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
