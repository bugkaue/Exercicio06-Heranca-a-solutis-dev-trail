package br.com.solutis.exercicio.nove;

public class EmpresaComissaoTeste {
    public static void main(String[] args) {
        // Array de funcionários com 10 elementos
        Funcionario[] funcionarios = new Funcionario[10];

        // Preenchendo o array com funcionários conforme a distribuição
        preencherFuncionarios(funcionarios);

        // Cálculo dos salários totais e por nível de escolaridade
        double salarioTotal = calcularSalarioTotal(funcionarios);
        double salarioEnsinoBasico = calcularSalarioPorTipo(funcionarios, FuncionarioEnsinoBasico.class);
        double salarioEnsinoMedio = calcularSalarioPorTipo(funcionarios, FuncionarioEnsinoMedio.class);
        double salarioEnsinoSuperior = calcularSalarioPorTipo(funcionarios, FuncionarioEnsinoSuperior.class);

        // Exibição dos resultados
        exibirResultados(salarioTotal, salarioEnsinoBasico, salarioEnsinoMedio, salarioEnsinoSuperior);

        // Exibição dos funcionários (opcional para verificação)
        exibirFuncionarios(funcionarios);
    }

    private static void preencherFuncionarios(Funcionario[] funcionarios) {
        funcionarios[0] = new FuncionarioEnsinoBasico("Ana Silva", "1001", "Escola Básica A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Carlos Oliveira", "1002", "Escola Básica B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Maria Santos", "1003", "Escola Básica C");
        funcionarios[3] = new FuncionarioEnsinoBasico("João Pereira", "1004", "Escola Básica D");

        // 4 funcionários com Ensino Médio
        funcionarios[4] = new FuncionarioEnsinoMedio("Fernanda Lima", "2001", "Escola Média A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Rafael Costa", "2002", "Escola Média B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Beatriz Rodrigues", "2003", "Escola Média C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Lucas Almeida", "2004", "Escola Média D");

        // 2 funcionários com Nível Superior
        funcionarios[8] = new FuncionarioEnsinoSuperior("Juliana Fernandes", "3001", "Escola Superior A", "Universidade A");
        funcionarios[9] = new FuncionarioEnsinoSuperior("Miguel Souza", "3002", "Escola Superior B", "Universidade B");
    }

    private static double calcularSalarioTotal(Funcionario[] funcionarios) {
        double salarioTotal = 0;
        for (Funcionario f : funcionarios) {
            salarioTotal += f.getRendaTotal();
        }
        return salarioTotal;
    }

    private static double calcularSalarioPorTipo(Funcionario[] funcionarios, Class<?> tipoFuncionario) {
        double salarioPorTipo = 0;
        for (Funcionario f : funcionarios) {
            if (tipoFuncionario.isInstance(f)) {
                salarioPorTipo += f.getRendaTotal();
            }
        }
        return salarioPorTipo;
    }

    private static void exibirResultados(double salarioTotal, double salarioEnsinoBasico, double salarioEnsinoMedio, double salarioEnsinoSuperior) {
        System.out.printf("Salário Total da Empresa: R$ %.2f%n", salarioTotal);
        System.out.printf("Salário Total Ensino Básico: R$ %.2f%n", salarioEnsinoBasico);
        System.out.printf("Salário Total Ensino Médio: R$ %.2f%n", salarioEnsinoMedio);
        System.out.printf("Salário Total Ensino Superior: R$ %.2f%n", salarioEnsinoSuperior);
    }

    private static void exibirFuncionarios(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}