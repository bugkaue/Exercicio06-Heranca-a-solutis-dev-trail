package br.com.solutis.exercicio.nove;

class Gerente extends Comissao {
    public static final double VALOR_COMISSAO = 1500.00;

    public Gerente() {
        super();
        calcularSalarioComComissao(VALOR_COMISSAO);
    }

    @Override
    public String toString() {
        return "Gerente - " + super.toString();
    }
}
