package br.com.solutis.exercicio.dez;

class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private final String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        // Renda do nível anterior + 100%
        setRendaTotal(getRendaTotal() * 2.00);
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String toString() {
        return String.format("FuncionarioGraduacao{nome='%s', codigoFuncional='%s', escola='%s', universidade='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), getEscola(), universidade, getRendaTotal());
    }
}

