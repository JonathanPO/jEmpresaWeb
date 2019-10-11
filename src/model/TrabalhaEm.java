package model;

public class TrabalhaEm {
    private Empregado empregado;
    private Projeto projeto;
    private int horas;

    public TrabalhaEm(Empregado empregado, Projeto projeto) {
        this.empregado = empregado;
        this.projeto = projeto;
    }

    public TrabalhaEm(Empregado empregado, Projeto projeto, int horas) {
        this.empregado = empregado;
        this.projeto = projeto;
        this.horas = horas;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
