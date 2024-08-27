package br.com.solutis.exercicio.dez;

public class Empresa {
    public static void main(String[] args) {
        // Array de funcionários com 10 elementos
        Funcionario[] funcionarios = new Funcionario[10];

        // Preenchendo o array com funcionários conforme a distribuição

        // 1 Gerente
        funcionarios[0] = new FuncionarioGerente("Funcionario Gerente", "1001");

        // 2 Supervisores
        funcionarios[1] = new FuncionarioSupervisor("Funcionario Supervisor 1", "2001");
        funcionarios[2] = new FuncionarioSupervisor("Funcionario Supervisor 2", "2002");

        // 7 Vendedores
        funcionarios[3] = new FuncionarioVendedor("Funcionario Vendedor 1", "3001");
        funcionarios[4] = new FuncionarioVendedor("Funcionario Vendedor 2", "3002");
        funcionarios[5] = new FuncionarioVendedor("Funcionario Vendedor 3", "3003");
        funcionarios[6] = new FuncionarioVendedor("Funcionario Vendedor 4", "3004");
        funcionarios[7] = new FuncionarioVendedor("Funcionario Vendedor 5", "3005");
        funcionarios[8] = new FuncionarioVendedor("Funcionario Vendedor 6", "3006");
        funcionarios[9] = new FuncionarioVendedor("Funcionario Vendedor 7", "3007");

        // Cálculo dos salários totais e por nível de escolaridade
        double salarioTotal = 0;
        double salarioGerente = 0;
        double salarioSupervisor = 0;
        double salarioVendedor = 0;

        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioGerente) {
                salarioGerente += f.getRendaTotal();
            } else if (f instanceof FuncionarioSupervisor) {
                salarioSupervisor += f.getRendaTotal();
            } else if (f instanceof FuncionarioVendedor) {
                salarioVendedor += f.getRendaTotal();
            }
            salarioTotal += f.getRendaTotal();
        }

        // Exibição dos resultados
        System.out.printf("Salário Total da Empresa: R$ %.2f%n", salarioTotal);
        System.out.printf("Salário Total Gerente: R$ %.2f%n", salarioGerente);
        System.out.printf("Salário Total Supervisor: R$ %.2f%n", salarioSupervisor);
        System.out.printf("Salário Total Vendedor: R$ %.2f%n", salarioVendedor);

        // Exibição dos funcionários (opcional para verificação)
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}