package br.com.solutis.exercicio.oito;

import java.util.ArrayList;
import java.util.List;

public class EmpresaComissao {

    public static void main(String[] args) {
        // Lista de comissões
        List<Comissao> comissoes = new ArrayList<>();

        // Adicionando 4 Gerentes
        for (int i = 0; i < 4; i++) {
            comissoes.add(new Gerente());
        }

        // Adicionando 4 Supervisores
        for (int i = 0; i < 4; i++) {
            comissoes.add(new Supervisor());
        }

        // Adicionando 2 Vendedores
        for (int i = 0; i < 2; i++) {
            comissoes.add(new Vendedor());
        }

        // Cálculo dos salários totais e por tipo de comissão
        double salarioTotal = 0;
        double salarioGerente = 0;
        double salarioSupervisor = 0;
        double salarioVendedor = 0;

        for (Comissao c : comissoes) {
            if (c instanceof Gerente) {
                salarioGerente += c.getSalarioComComissao();
            } else if (c instanceof Supervisor) {
                salarioSupervisor += c.getSalarioComComissao();
            } else if (c instanceof Vendedor) {
                salarioVendedor += c.getSalarioComComissao();
            }
            salarioTotal += c.getSalarioComComissao();
        }

        // Exibição dos resultados
        System.out.printf("Salário Total da Empresa: R$ %.2f%n", salarioTotal);
        System.out.printf("Salário Total Gerentes: R$ %.2f%n", salarioGerente);
        System.out.printf("Salário Total Supervisores: R$ %.2f%n", salarioSupervisor);
        System.out.printf("Salário Total Vendedores: R$ %.2f%n", salarioVendedor);

        // Exibição das comissões detalhadas por funcionário
        System.out.println("\nDetalhamento das Comissões:");
        comissoes.forEach(System.out::println);
    }
}
