# GameList-API 🎮

![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-green)
![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)

## 📖 Sobre o Projeto

**GameList-API** é uma API RESTful desenvolvida como parte da conclusão do curso intensivo **Java Spring Professional da DevSuperior**. O objetivo foi construir um backend robusto para gerenciar e organizar listas de videogames, aplicando de forma prática um conjunto de conceitos avançados da stack Java e do ecossistema Spring.

Este projeto demonstra a construção de uma API bem estruturada, desde o acesso a dados até a exposição de endpoints, seguindo as melhores práticas de desenvolvimento de software.

## 🚀 Conceitos Avançados Aplicados

Este projeto não foi apenas sobre criar endpoints, mas sobre implementar uma arquitetura sólida e eficiente. Os principais aprendizados e conceitos aplicados incluem:

* **Arquitetura em Camadas (Controller, Service, Repository):** Separação clara de responsabilidades, facilitando a manutenção e escalabilidade do código.
* **Padrão DTO (Data Transfer Object):** Utilização de DTOs para customizar e controlar os dados expostos pela API, desacoplando a camada de apresentação das entidades de domínio.
* **Spring Data JPA:** Mapeamento objeto-relacional (ORM) completo, com ênfase em relacionamentos complexos, incluindo a implementação de **chaves primárias compostas** com `@Embeddable` e `@EmbeddedId`.
* **Consultas SQL Nativas com Projections:** Criação de consultas SQL otimizadas para o banco de dados, utilizando Projections do Spring Data para retornar apenas os dados necessários e melhorar a performance.
* **Injeção de Dependência:** Uso massivo do mecanismo de DI do Spring para gerenciar os componentes da aplicação.
* **Banco de Dados H2 em Memória:** Configuração de um ambiente de desenvolvimento e teste ágil, com um banco de dados que sobe junto com a aplicação.
* **Build Tool com Maven:** Gerenciamento de dependências e do ciclo de vida do projeto.

## ✨ Funcionalidades

A API oferece os seguintes recursos:

* ✅ Listar todos os jogos de forma resumida.
* ✅ Obter os detalhes completos de um jogo específico.
* ✅ Listar todas as coleções (listas de jogos) disponíveis.
* ✅ Visualizar todos os jogos pertencentes a uma coleção específica, respeitando a sua ordem.
* ✅ Reordenar jogos dentro de uma coleção.

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA / Hibernate**
* **Maven**
* **H2 Database** (Ambiente de Desenvolvimento)
* **PostgreSQL** (Pronto para Ambiente de Produção)

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para executar a API localmente.

### Pré-requisitos
* [Git](https://git-scm.com/)
* Java JDK 17 ou superior
* Maven 3.8 ou superior

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Mafmerlos/GameList-API.git](https://github.com/Mafmerlos/GameList-API.git)
    ```

2.  **Navegue até a pasta do projeto:**
    ```bash
    cd GameList-API
    ```

3.  **Execute a aplicação com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```

4.  **Acesse a API:**
    A aplicação estará rodando em `http://localhost:8080`.

5.  **Acesse o Console do Banco H2:**
    Para visualizar o banco de dados em memória, acesse `http://localhost:8080/h2-console` no seu navegador.
    * **JDBC URL:** `jdbc:h2:mem:testdb`
    * **User Name:** `sa`
    * **Password:** (deixe em branco)

## Endpoints da API

| Método | Rota                            | Descrição                                         |
| :----- | :------------------------------ | :-------------------------------------------------- |
| `GET`  | `/games`                        | Retorna uma lista resumida de todos os jogos.       |
| `GET`  | `/games/{id}`                   | Retorna os detalhes completos de um jogo específico.  |
| `GET`  | `/lists`                        | Retorna todas as coleções de jogos.                 |
| `GET`  | `/lists/{listId}/games`         | Retorna os jogos de uma coleção específica, ordenados.|
| `POST` | `/lists/{listId}/replacement`   | Move um jogo de uma posição para outra na coleção.    |

**Exemplo de corpo para a requisição `POST /lists/{listId}/replacement`:**
```json
{
    "sourceIndex": 2,
    "destinationIndex": 0
}
```

## 👨‍💻 Autor

Desenvolvido por **Matheus Figueira Merlos** .

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matheus-merlos-531089243/)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Mafmerlos)
