package br.com.solutis.exercicio.seis;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncinal, String escola) {
        super(nome, codigoFuncinal);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10; // 10% a mais.
    }

    @Override
    public String toString() {
        return super.toString() + ", escola='" + escola + "'";
    }
}
