package br.com.solutis.exercicio.dez;

class FuncionarioVendedor extends Funcionario {
    public FuncionarioVendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        // Renda básica + 20%
        setRendaTotal(getRendaTotal() * 1.20);
    }

    @Override
    public String toString() {
        return String.format("FuncionarioVendedor{nome='%s', codigoFuncional='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), getRendaTotal());
    }
}