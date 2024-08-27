package br.com.solutis.exercicio.seis;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncinal, String escola, String universidade) {
        super(nome, codigoFuncinal, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00;
    }

    @Override
    public String toString() {
        return super.toString() + ", universidade='" + universidade + "'";
    }
}
