package br.com.solutis.exercicio.onze;


class FuncionarioEnsinoBasico extends Funcionario {
    private final String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        setRendaTotal(getRendaTotal() * 1.10);
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String toString() {
        return String.format("FuncionarioEnsinoBasico{nome='%s', escola='%s', comissao=%.2f, rendaTotal=%.2f}",
                getNome(), escola, getComissao(), getRendaTotal());
    }
}
