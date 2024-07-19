# Projeto de Gestão de Trabalhadores

Este projeto tem como objetivo ler os dados de um trabalhador com N contratos (onde N é fornecido pelo usuário), solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes e enumerações:

### Classe `Worker`

A classe `Worker` representa um trabalhador e possui os seguintes atributos e métodos:

- **Atributos:**
  - `name` (String): Nome do trabalhador.
  - `level` (WorkerLevel): Nível do trabalhador (enum).
  - `baseSalary` (Double): Salário base do trabalhador.
  - `contracts` (List<HourContract>): Lista de contratos de hora.

- **Métodos:**
  - `addContract(HourContract contract)`: Adiciona um contrato à lista de contratos.
  - `removeContract(HourContract contract)`: Remove um contrato da lista de contratos.
  - `income(Integer year, Integer month)`: Calcula o rendimento do trabalhador para um determinado mês e ano.

### Classe `HourContract`

A classe `HourContract` representa um contrato de hora e possui os seguintes atributos e métodos:

- **Atributos:**
  - `date` (LocalDate): Data do contrato.
  - `valuePerHour` (Double): Valor por hora do contrato.
  - `hours` (Integer): Número de horas trabalhadas no contrato.

- **Métodos:**
  - `totalValue()`: Calcula o valor total do contrato com base no número de horas e valor por hora.

### Classe `Department`

A classe `Department` representa o departamento ao qual o trabalhador pertence e possui os seguintes atributos:

- **Atributos:**
  - `name` (String): Nome do departamento.

### Enum `WorkerLevel`

O enum `WorkerLevel` define os níveis do trabalhador:

- `JUNIOR`
- `MID_LEVEL`
- `SENIOR`

## Exemplo de Uso

1. Leia os dados de um trabalhador, incluindo nome, nível, salário base e departamento.
2. Solicite o número de contratos (N) e leia os dados de cada contrato (data, valor por hora, número de horas).
3. Solicite do usuário um mês e ano específicos.
4. Mostre o salário do trabalhador para o mês e ano especificados.

![image](https://github.com/user-attachments/assets/38a93534-e64f-4457-bb76-843b2ed351b6)
