package br.com.solutis.exercicio.seis;



public class FuncionarioTeste {
    public static void main(String[] args) {
        // Criando funcionários com diferentes níveis de educação
        Funcionario funcionario1 = new Funcionario("Carlos", "0001");
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Lucia", "0002", "Escola Estadual");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Pedro", "0003", "Escola Técnica");
        FuncionarioEnsinoSuperior funcionario4 = new FuncionarioEnsinoSuperior("Fernanda", "0004", "Colégio São Paulo", "Universidade Federal");

        // Exibindo detalhes e renda de cada funcionário
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}
