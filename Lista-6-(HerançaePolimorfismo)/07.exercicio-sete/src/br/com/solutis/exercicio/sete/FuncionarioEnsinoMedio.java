package br.com.solutis.exercicio.sete;

class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        // Renda do nível anterior + 50%
        setRendaTotal(getRendaTotal() * 1.50);
    }

    @Override
    public String toString() {
        return String.format("FuncionarioEnsinoMedio{nome='%s', codigoFuncional='%s', escola='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), getEscola(), getRendaTotal());
    }
}
