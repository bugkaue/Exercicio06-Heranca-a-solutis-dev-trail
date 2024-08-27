package br.com.solutis.exercicio.onze;

class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double RENDA_BASE = 1000.00;
    private double rendaTotal;
    private double comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = RENDA_BASE;
        this.comissao = 0; // Inicialmente, comissão é 0
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

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return String.format("Funcionario{nome='%s', comissao=%.2f, rendaTotal=%.2f}",
                nome, comissao, rendaTotal);
    }
}
