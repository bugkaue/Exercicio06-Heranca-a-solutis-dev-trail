package br.com.solutis.exercicio.cinco;
public class Funcionario {

    private String nome;
    private String codigoFuncinal;

    public Funcionario(String codigoFuncinal, String nome) {
        this.codigoFuncinal = codigoFuncinal;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncinal() {
        return codigoFuncinal;
    }

    public void setCodigoFuncinal(String codigoFuncinal) {
        this.codigoFuncinal = codigoFuncinal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigoFuncinal='" + codigoFuncinal + '\'' +
                '}';
    }
}
