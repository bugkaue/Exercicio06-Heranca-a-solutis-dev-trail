package br.com.solutis.exercicio.seis;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, String codigoFuncinal, String escola) {
        super(nome, codigoFuncinal, escola);
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;
    }
}
