package br.com.solutis.exercicio.oito;

class Supervisor extends Comissao {
    private static final double VALOR_COMISSAO = 600.00;

    public Supervisor() {
        super();
        calcularSalarioComComissao(VALOR_COMISSAO);
    }

    @Override
    public String toString() {
        return "Supervisor - " + super.toString();
    }
}
