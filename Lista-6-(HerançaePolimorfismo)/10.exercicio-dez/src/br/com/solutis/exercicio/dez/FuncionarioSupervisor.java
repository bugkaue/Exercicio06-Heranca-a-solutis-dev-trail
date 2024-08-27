package br.com.solutis.exercicio.dez;

class FuncionarioSupervisor extends Funcionario {
    public FuncionarioSupervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        // Renda básica + 30%
        setRendaTotal(getRendaTotal() * 1.30);
    }

    @Override
    public String toString() {
        return String.format("FuncionarioSupervisor{nome='%s', codigoFuncional='%s', rendaTotal=%.2f}",
                getNome(), getCodigoFuncional(), getRendaTotal());
    }
}
