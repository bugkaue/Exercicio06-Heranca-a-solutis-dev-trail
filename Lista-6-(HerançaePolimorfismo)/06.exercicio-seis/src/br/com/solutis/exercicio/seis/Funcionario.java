package br.com.solutis.exercicio.seis;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double Renda_BASICA = 1000.0;

    public Funcionario(String nome, String codigoFuncinal) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRendaTotal() {
        return Renda_BASICA;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigoFuncional='" + codigoFuncional + '\'' +
                ", renda total=" + calcularRendaTotal() +
                '}';
    }
}
