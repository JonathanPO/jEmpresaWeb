package model;

public class Local {
    private Departamento departamento;
    private String nome;

    public Local(Departamento departamento, String nome) {
        this.departamento = departamento;
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
