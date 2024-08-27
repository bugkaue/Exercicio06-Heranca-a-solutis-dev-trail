package br.com.solutis.exercicio.cinco;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioEnsinoSuperior(String ana, String codigoFuncinal, String nome, String universidade) {
        super(codigoFuncinal, nome);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return "FuncionarioEnsinoSuperior{" +
                "universidade='" + universidade + '\'' +
                '}';
    }
}
