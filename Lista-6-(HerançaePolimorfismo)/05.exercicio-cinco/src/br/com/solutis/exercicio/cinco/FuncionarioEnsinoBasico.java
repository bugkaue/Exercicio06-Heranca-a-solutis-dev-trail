package br.com.solutis.exercicio.cinco;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escola;


    public FuncionarioEnsinoBasico(String codigoFuncinal, String nome) {
        super(codigoFuncinal, nome);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "FuncionarioEnsinoBasico{" +
                "escola='" + escola + '\'' +
                '}';
    }
}
