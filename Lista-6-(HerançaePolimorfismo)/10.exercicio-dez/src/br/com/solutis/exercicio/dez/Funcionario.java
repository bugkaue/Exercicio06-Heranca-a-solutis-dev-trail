package br.com.solutis.exercicio.dez;

class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double RENDA_BASE = 1000.00;
    private double rendaTotal;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = RENDA_BASE;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }
}
