package br.com.solutis.exercicio.nove;

class Comissao {
    private static final double SALARIO_BASE = 1000.00;
    private double salarioComComissao;

    public Comissao() {
        this.salarioComComissao = SALARIO_BASE;
    }

    public double getSalarioComComissao() {
        return salarioComComissao;
    }

    public void calcularSalarioComComissao(double valorComissao) {
        this.salarioComComissao = SALARIO_BASE + valorComissao;
    }



    @Override
    public String toString() {
        return String.format("Salário com Comissão: R$ %.2f", salarioComComissao);
    }
}

