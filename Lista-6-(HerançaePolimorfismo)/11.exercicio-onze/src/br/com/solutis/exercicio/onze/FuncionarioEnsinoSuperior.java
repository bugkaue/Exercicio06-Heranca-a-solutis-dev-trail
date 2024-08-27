package br.com.solutis.exercicio.onze;


class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private final String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        setRendaTotal(getRendaTotal() * 2.00);
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String toString() {
        return String.format("FuncionarioEnsinoSuperior{nome='%s', escola='%s', universidade='%s', comissao=%.2f, rendaTotal=%.2f}",
                getNome(), getEscola(), universidade, getComissao(), getRendaTotal());
    }
}
