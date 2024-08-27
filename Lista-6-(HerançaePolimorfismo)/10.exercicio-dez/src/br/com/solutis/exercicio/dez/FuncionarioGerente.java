package br.com.solutis.exercicio.dez;

class FuncionarioGerente extends Funcionario {
    public FuncionarioGerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        // Renda básica + 50%
        setRendaTotal(getRendaTotal() * 1.50);
    }

    @Override
    public String toString() {
        return String.format("FuncionarioGerente{nome='%s', codigoFuncional='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), getRendaTotal());
    }
}
