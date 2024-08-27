package br.com.solutis.exercicio.onze;

public class SimulacaoEmpresa {
    public static void main(String[] args) {
        // Array de funcionários com 10 elementos
        Funcionario[] funcionarios = new Funcionario[10];

        // Preenchendo o array com funcionários conforme a distribuição

        // 4 funcionários com Ensino Básico
        funcionarios[0] = new FuncionarioEnsinoBasico("Funcionario Básico 1", "1001", "Escola Básica A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Funcionario Básico 2", "1002", "Escola Básica B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Funcionario Básico 3", "1003", "Escola Básica C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Funcionario Básico 4", "1004", "Escola Básica D");

        // 4 funcionários com Ensino Médio
        funcionarios[4] = new FuncionarioEnsinoMedio("Funcionario Médio 1", "2001", "Escola Média A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Funcionario Médio 2", "2002", "Escola Média B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Funcionario Médio 3", "2003", "Escola Média C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Funcionario Médio 4", "2004", "Escola Média D");

        // 2 funcionários com Nível Superior
        funcionarios[8] = new FuncionarioEnsinoSuperior("Funcionario Superior 1", "3001", "Escola Superior A", "Universidade A");
        funcionarios[9] = new FuncionarioEnsinoSuperior("Funcionario Superior 2", "3002", "Escola Superior B", "Universidade B");

        // Cálculo dos salários totais e por nível de escolaridade
        double salarioTotal = 0;
        double salarioEnsinoBasico = 0;
        double salarioEnsinoMedio = 0;
        double salarioGraduacao = 0;

        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioEnsinoBasico && !(f instanceof FuncionarioEnsinoMedio)) {
                salarioEnsinoBasico += f.getRendaTotal();
            } else if (f instanceof FuncionarioEnsinoMedio && !(f instanceof FuncionarioEnsinoSuperior)) {
                salarioEnsinoMedio += f.getRendaTotal();
            } else if (f instanceof FuncionarioEnsinoSuperior) {
                salarioGraduacao += f.getRendaTotal();
            }
            salarioTotal += f.getRendaTotal();
        }

        // Exibição dos resultados
        System.out.printf("Salário Total da Empresa: R$ %.2f%n", salarioTotal);
        System.out.printf("Salário Total Ensino Básico: R$ %.2f%n", salarioEnsinoBasico);
        System.out.printf("Salário Total Ensino Médio: R$ %.2f%n", salarioEnsinoMedio);
        System.out.printf("Salário Total Graduação: R$ %.2f%n", salarioGraduacao);

        // Exibição dos funcionários (opcional para verificação)
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}