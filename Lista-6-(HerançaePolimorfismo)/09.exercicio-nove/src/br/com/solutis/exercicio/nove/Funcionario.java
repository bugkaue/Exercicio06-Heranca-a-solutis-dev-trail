package br.com.solutis.exercicio.nove;

class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double RENDA_BASE = 1000.00;
    private double rendaTotal;
    private double comissao; // Novo atributo para armazenar a comissão

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = RENDA_BASE;
        this.comissao = 0.00; // Inicializa a comissão como zero
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getRendaTotal() {
        // Retorna a renda total incluindo a comissão
        return rendaTotal + comissao;
    }

    // Setter para rendaTotal
    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    // Setter para comissao
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
