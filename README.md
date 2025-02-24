# OrdersPOO 🛒

Este projeto tem como objetivo a criação de um sistema de pedidos utilizando **Programação Orientada a Objetos (POO)** em Java. Durante o desenvolvimento, foram trabalhadas diversas classes para representar clientes, produtos, itens do pedido e o próprio pedido em si. Além disso, o projeto fez uso da classe **Enum** para gerenciar o status dos pedidos e trabalhei com **Date** e **SimpleDateFormat** para manipulação de datas.

## 📌 Tecnologias Utilizadas

- **Java**
- **Programação Orientada a Objetos (POO)**
- **Enum (OrderStatus)**
- **Date e SimpleDateFormat**

## 📂 Estrutura do Projeto

O projeto foi estruturado com as seguintes classes:

- **`Client`**: Representa um cliente, contendo nome, e-mail e data de nascimento.
- **`Product`**: Contém informações sobre um produto, como nome e preço.
- **`OrderItem`**: Representa um item do pedido, associando um produto, à quantidade comprada e o subtotal.
- **`OrderExercice`**: Classe principal que gerencia o pedido, armazenando a hora que foi realizado o pedido, o status, o cliente e os produtos.
- **`OrderStatus`** (*Enum*): Enumeração que define os possíveis status de um pedido (exemplo: `PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`).
- **`ProgramExercice`**: Classe principal (main) responsável por executar a lógica do sistema.

## 🚀 Funcionalidades

- **Cadastro de Clientes**
- **Cadastro de Produtos**
- **Criação de Pedidos**
- **Gerenciamento de Itens do Pedido**
- **Cálculo do Total do Pedido**
- **Atualização do Status do Pedido**
- **Manipulação de Datas com SimpleDateFormat**

## 📖 Aprendizados

Neste projeto, aprofundei meus conhecimentos em **POO**, trabalhando com conceitos como:
- Encapsulamento e Organização de Classes.
- Relacionamento entre Objetos.
- Uso de **Enums** para definição de estados.
- Manipulação de listas e composição de objetos.
- Uso da **classe Date e SimpleDateFormat** para formatar e manipular datas.

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/CaikeRabis/OrdersPOO.git
2. Abra o projeto em uma IDE compatível com Java (IntelliJ, Eclipse, VS Code).
3. Compile e execute a classe ProgramExercice para testar o sistema.
