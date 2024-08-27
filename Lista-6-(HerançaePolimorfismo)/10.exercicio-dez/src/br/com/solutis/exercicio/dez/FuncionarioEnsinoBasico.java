package br.com.solutis.exercicio.dez;

class FuncionarioEnsinoBasico extends Funcionario {
    private final String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        // Renda básica + 10%
        setRendaTotal(getRendaTotal() * 1.10);
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String toString() {
        return String.format("FuncionarioEnsinoBasico{nome='%s', codigoFuncional='%s', escola='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), escola, getRendaTotal());
    }
}
