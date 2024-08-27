package br.com.solutis.exercicio.nove;

class Supervisor extends Comissao {
    public static final double VALOR_COMISSAO = 600.00;

    public Supervisor() {
        super();
        calcularSalarioComComissao(VALOR_COMISSAO);
    }

    @Override
    public String toString() {
        return "Supervisor - " + super.toString();
    }
}