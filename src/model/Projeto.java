package model;

public class Projeto {
    private String descricao;
    private int codigo;
    private Local local;
    private Departamento departamento;

    public Projeto(int codigo) {
        this.codigo = codigo;
    }

    public Projeto(String descricao, int codigo, Local local, Departamento departamento) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.local = local;
        this.departamento = departamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
