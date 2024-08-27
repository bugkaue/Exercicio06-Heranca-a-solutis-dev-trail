package br.com.solutis.exercicio.oito;

class Vendedor extends Comissao {
    private static final double VALOR_COMISSAO = 250.00;

    public Vendedor() {
        super();
        calcularSalarioComComissao(VALOR_COMISSAO);
    }

    @Override
    public String toString() {
        return "Vendedor - " + super.toString();
    }
}
