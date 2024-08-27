package br.com.solutis.exercicio.onze;

class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        setRendaTotal(getRendaTotal() * 1.50);
    }

    @Override
    public String toString() {
        return String.format("FuncionarioEnsinoMedio{nome='%s', escola='%s', comissao=%.2f, rendaTotal=%.2f}",
                getNome(), getEscola(), getComissao(), getRendaTotal());
    }
}
