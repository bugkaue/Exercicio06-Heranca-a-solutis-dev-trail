# Projeto de Herança e Polimorfismo

Este projeto contém uma série de exercícios de programação orientada a objetos, abordando conceitos de herança, polimorfismo, e cálculos relacionados a comissões e salários.

## Exercícios

### Exercício 01

Crie uma hierarquia de classes para animais com os seguintes atributos e comportamentos:

- **Animal (classe base)**
  - Atributos comuns a todos os animais.
  - Métodos para emitir som e correr (opcional).

- **Cachorro (herda de Animal)**

- **Cavalo (herda de Animal)**

- **Preguica (herda de Animal)**

### Exercício 02

Implemente um programa que crie instâncias dos três tipos de animais definidos no Exercício 01 e invoque o método que emite o som de cada um de forma polimórfica.

### Exercício 03

Implemente uma classe `Veterinario` com um método `examinar(Animal animal)` que faz o animal emitir um som quando examinado. Passe os três tipos de animais como parâmetros.

### Exercício 04

Crie uma classe `Zoologico` que contém 10 jaulas (utilize um array). Coloque um animal diferente em cada jaula, percorra cada jaula e emita o som. Se o animal tiver o comportamento de correr, faça-o correr.

### Exercício 05

Crie um modelo para registrar a vida acadêmica dos funcionários:

- **Funcionario (classe base)**
  - Para funcionários sem escolaridade, apenas nome e código funcional.
  - Para funcionários com ensino básico, adicione a escola.
  - Para funcionários com ensino médio, adicione a escola.
  - Para funcionários com graduação, adicione a universidade.

### Exercício 06

Estenda o modelo do Exercício 05:

- Todos os funcionários possuem uma renda básica de R$1000,00.
- Conclusão do ensino básico: renda total é renda básica acrescida de 10%.
- Conclusão do ensino médio: renda total é a renda do nível anterior acrescida de 50%.
- Conclusão da graduação: renda total é a renda do nível anterior acrescida de 100%.

### Exercício 07

Simule uma empresa com 10 funcionários usando um array. Distribua a escolaridade dos funcionários como segue:

- 40% ensino básico
- 40% ensino médio
- 20% nível superior

Calcule os custos da empresa com salários totais e por nível de escolaridade utilizando a classe `Funcionario` desenvolvida no Exercício 06.

### Exercício 08

Crie uma hierarquia de comissões:

- **Comissao (classe base)**
  - Gerente: R$1500,00
  - Supervisor: R$600,00
  - Vendedor: R$250,00

### Exercício 09

Adicione à classe `Funcionario` um atributo para a comissão e atualize o cálculo da renda total para incluir o adicional da comissão.

### Exercício 10

Refaça o Exercício 07, mas considere a seguinte distribuição de funcionários:

- 10% Gerentes
- 20% Supervisores
- 70% Vendedores

### Exercício 11

Sobreescreva o método `toString` na classe `Funcionario` para imprimir o nome do funcionário, a comissão e o salário total. Imprima todos os funcionários da empresa criada no Exercício 10.

## Executando o Projeto

1. **Compile**: Compile o projeto usando seu ambiente de desenvolvimento ou linha de comando.
2. **Execute**: Execute as classes principais para verificar a saída dos exercícios.

### Exemplo de Execução

Para verificar a saída dos exercícios, você pode executar a classe principal correspondente a cada exercício. Por exemplo:

```sh
java br.com.solutis.exercicio.oito.EmpresaComissao

1. Clone o repositório:

   ```bash
   
      git clone https://github.com/bugkaue/Exercicio06-Heranca-a-solutis-dev-trail.git
